package br.com.alura.praticandojava.convertendohorarioparaoutrofuso;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaSydney = horaAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Horário atual no sistema: " + horaAtual.format(formatoHora));
        System.out.println("Horário atual em Sydney: " + horaSydney.format(formatoHora));
    }
}
