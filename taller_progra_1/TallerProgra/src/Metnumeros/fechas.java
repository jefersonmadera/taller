package Metnumeros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class fechas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String mesString;
        System.out.println("Ingrese la fecha e formato dd/MM/aaaa");
        String fecha = sc.nextLine();
        try {
            //string a date
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.parse(fecha);

            String[] fechaSeparada = fecha.split("/");
            int mes = Integer.parseInt(fechaSeparada[1]);

            mesString = switch (mes) {
                case 1 -> "Enero";
                case 2 -> "Febrero";
                case 3 -> "Marzo";
                case 4 -> "Abril";
                case 5 -> "Mayo";
                case 6 -> "Junio";
                case 7 -> "Julio";
                case 8 -> "Agosto";
                case 9 -> "Septiembre";
                case 10 -> "Octubre";
                case 11 -> "Noviembre";
                case 12 -> "Diciembre";
                default -> "Invalid month";
            };
            System.out.println(fechaSeparada[0]+" de "+mesString+" de "+fechaSeparada[2]);

        } catch (ParseException e) {
            System.out.println("Error en el formato de la fecha");
        }

    }
}

