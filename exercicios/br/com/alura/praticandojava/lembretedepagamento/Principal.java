package br.com.alura.praticandojava.lembretedepagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate vencimento = LocalDate.of(2025,11,30);
        LocalDate antecedencia = vencimento.minusDays(5);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do lembrete: " + antecedencia.format(formatoData));
    }
}
