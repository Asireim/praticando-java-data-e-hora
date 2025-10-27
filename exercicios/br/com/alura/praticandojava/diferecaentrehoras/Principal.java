package br.com.alura.praticandojava.diferecaentrehoras;

import java.time.Duration;
import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(8,30);
        LocalTime fim = LocalTime.of(17,30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.printf("Diferença de tempo: %d horas e %d minutos.", duracao.toHours(), duracao.toMinutesPart());
    }
}
