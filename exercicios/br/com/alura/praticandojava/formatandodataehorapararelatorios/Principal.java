package br.com.alura.praticandojava.formatandodataehorapararelatorios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("Data/hora formatada: " + dataHora.format(formatoDataHora));

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dia = LocalDate.now();
        System.out.println("Dia formatado: " + dia.format(dataFormatada));

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.now();
        System.out.println("Hora formatada: " + hora.format(formatoHora));
    }
}
