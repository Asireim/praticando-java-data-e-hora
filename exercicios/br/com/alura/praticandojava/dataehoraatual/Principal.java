package br.com.alura.praticandojava.dataehoraatual;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String tarefa = "Enviar relatório semanal";

        System.out.printf("Dados da criação da tarefa \"%s\":%n", tarefa);
        LocalDate dataCriacao = LocalDate.now();
        System.out.println("Data atual: " + dataCriacao);
        System.out.println("Data atual (formatada): " + dataCriacao.format(formatoData));
        LocalTime horaCriacao = LocalTime.now();
        System.out.println("Hora atual: " + horaCriacao);
        System.out.println("Hora atual (formatada): " + horaCriacao.format(formatoHora));
    }
}
