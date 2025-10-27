package br.com.alura.praticandojava.controledeexpediente;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime horaEntrada = LocalTime.parse(leitura.next(), formatoHora);
        System.out.println("Digite a carga horária (em horas): ");
        int cargaHoraria = leitura.nextInt();
        System.out.println("Digite o horário de saída (HH:mm): ");
        LocalTime horaSaida = LocalTime.parse(leitura.next(), formatoHora);

        Duration tempoTrabalhado = Duration.between(horaEntrada, horaSaida);
        long horasExtras = tempoTrabalhado.toHours();
        long minutosExtras = tempoTrabalhado.toMinutesPart();

        System.out.println("O horário de entrada foi: " + horaEntrada.format(formatoHora));
        System.out.println("O horário de saída previsto é: " + horaEntrada.plusHours(cargaHoraria));
        System.out.println("O horário real da saída foi: " + horaSaida.format(formatoHora));
        System.out.println("O tempo trabalhado foi de " + tempoTrabalhado.toHours() + " horas e " + tempoTrabalhado.toMinutesPart() + " minutos.");

        if(horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h" + Math.abs(minutosExtras) + "min");
        }
    }
}
