package br.com.alura.praticandojava.verificandoadatadeumevento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate evento = LocalDate.of(2025,10,10);
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do evento: " + evento.format(formatoData));
        System.out.println("Data atual: " + hoje.format(formatoData));
        if(evento.isAfter(hoje)) {
            System.out.println("O evento está por vir.");
        } else {
            System.out.println("O evento já ocorreu.");
        }
    }
}
