package br.com.alura.praticandojava.calculandoadatadeentrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2025,03,15);
        LocalDate prazoDias = dataInicio.plusDays(15);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data final formatada: " + prazoDias.format(formatoData));
    }
}
