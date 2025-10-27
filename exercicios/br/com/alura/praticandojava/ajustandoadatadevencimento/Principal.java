package br.com.alura.praticandojava.ajustandoadatadevencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025,11,20);
        LocalDate adicionaMeses = dataVencimento.plusMonths(2);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nova data de vencimento: " + adicionaMeses.format(formatoData));
    }
}
