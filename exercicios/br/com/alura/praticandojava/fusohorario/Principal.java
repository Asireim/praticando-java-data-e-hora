package br.com.alura.praticandojava.fusohorario;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaTokyo = horaAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Hora atual em Tóquio: " + horaTokyo.format(formatoHora));

    }
}
