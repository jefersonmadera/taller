package Metnumeros;
import java.util.Scanner;
public class Factores_primos {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
    int num = entrada.nextInt();
    int contador =0;
        for (int i = 2; i < num; i++) {
        while (num % i == 0) {
            num = num / i;
            contador++;
        }
        if (contador!=0){
            System.out.println(i+"^"+contador);
        }
        contador=0;
        }
}}
