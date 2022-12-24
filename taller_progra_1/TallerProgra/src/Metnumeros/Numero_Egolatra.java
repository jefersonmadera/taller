package Metnumeros;
import java.util.*;
import static java.lang.System.*;

public class Numero_Egolatra {

    public static void main(String[] args) {
        out.println((numeroEgo()));

    }
    private static String numeroEgo () {
        Scanner entrada = new Scanner(in);
        int contador1 = 0;
        double resp;double sum;
        double otro = 0;
        out.println("escriba un numero para verificar si es un numero egolatra");
        double Num = entrada.nextDouble();
        resp = Num;
        double dic = Num;
        while (Math.floor(resp) != 0) {
            resp = resp / 10;
            contador1++;
        }
        while (Math.floor(Num) != 0) {
            sum = Math.floor(Num) % 10;
            otro = otro + (Math.pow(Math.floor(sum), contador1));
            Num = Num / 10;
        }
        String Answer;
        if (dic==otro){
        Answer = "►►►Es un numero egolatra◄◄◄";
        }else {
            Answer = "►►►NO ES UN NUMERO EGOLATRA◄◄◄";
        }
        return Answer;
    }
    }