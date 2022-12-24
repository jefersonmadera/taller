package Metnumeros;

import java.util.Scanner;

public class Borrar_espacios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese una cadena de texto ");
        String texto = entrada.nextLine();
        System.out.println(texto.replace("",""));
    }}