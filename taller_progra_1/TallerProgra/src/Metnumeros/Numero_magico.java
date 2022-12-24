package Metnumeros;

import java.util.Scanner;

public class Numero_magico {

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);

            //numero magico
            System.out.println("ingrese un numero para verificar si es magico ");
            int num = sc.nextInt();

            String numero = String.valueOf(num); //convierto a String
            char[] digitos = numero.toCharArray(); //separo cada digito del numero

            char[] ascendente = digitos.clone();
            char[] descendente = digitos.clone();

            //metodo burbuja para pasar de menor a mayor
            for (int i =0; i<ascendente.length;i++){
                for (int j =0; j<ascendente.length-1;j++){
                    if (ascendente[j]> ascendente[j+1]) {
                        char aux;
                        aux = ascendente[j];
                        ascendente[j] = ascendente[j+1];
                        ascendente[j+1] = aux;
                    }
                }
            }

            //metodo burbuja para pasar de mayor a menor
            for (int i =0; i<descendente.length;i++){
                for (int j =0; j<descendente.length-1;j++){
                    if (descendente[j]< descendente[j+1]) {
                        char aux;
                        aux = descendente[j];
                        descendente[j] = descendente[j+1];
                        descendente[j+1] = aux;
                    }
                }
            }

            //se unifica
            int mayoraMenor = Integer.parseInt(new String(descendente));
            int menoraMayor = Integer.parseInt(new String(ascendente));

            if (mayoraMenor-menoraMayor==num){
                System.out.println("Es un numero magico");
            }else {
                System.out.println("No es un numero magico");
            }

        }
    }


