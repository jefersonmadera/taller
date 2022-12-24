package Metnumeros;
import java.util.*;
public class Roman_Numbers {
    private int input;
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Roman_Numbers Romanos = new Roman_Numbers ();

        for(int i=0; i<10; i++) {
            System.out.println("DIGITE UN NUMERO ROMANO");
            String entry=leer.nextLine();
            Romanos.Numerous_ROMANO(entry.toUpperCase());
            System.out.print("decimal numeric  ");
            System.out.print(Romanos.getInput() + "\n");
        }
        System.out.println("♫♫♫♫");

    }

    public static int romanValue(char converter) {
        return switch (converter) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public void Numerous_ROMANO(String input) {
        boolean control=false; boolean rests=false;
        int primer = 0; int decimal = 0;
        int [] almanac1 = {0,0,0};
        int [] almanac2 = {0,0,0,0};
        int INITIO=1;

        for(int i=input.length()-1; i>=0; i--) {
            int actual = romanValue(input.charAt(i));


            if(actual==0) {
                control=true;
            }

            if(actual<primer) {

                if(actual/5==1 || actual/5==10 || actual/5==100){
                    System.out.println(i);
                    System.out.println("ERROR");
                    control=true;
                }

                if(primer!=actual*5 && primer!=actual*10 && (actual==1 || actual==10 || actual==100) ){
                    System.out.println("ERROR ");
                    control=true;
                }

                if(primer!=decimal) {
                    control=true;
                }

                if(rests) {
                    System.out.println("ERROR");
                    control=true;
                }
                rests=true;

                decimal -= actual;
            }else{

                if(actual==primer) {

                    for(int j=0; j<almanac2.length; j++) {
                        if(actual == INITIO) {
                            almanac2[j]+=1;
                        }else {
                            INITIO*=10;
                        }
                    }
                    INITIO=1;

                    if(rests) {
                        System.out.println("ERROR");
                        control=true;
                    }}
                for(int j=0; j<almanac1.length; j++) {
                    if(actual== 5*INITIO ) {
                        almanac1[j]+=1;
                    }else {
                        INITIO*=10;
                    }
                }
                INITIO=1;

                decimal += actual;
            }
            primer=actual;
        }
        if(almanac2[0]==3 || almanac2[1]==3 || almanac2[2]==3 || almanac2[3]==3 || almanac1[0]==2 || almanac1[1]==2 || almanac1[2]==2) {
            System.out.println("ERROR");
            control=true;
        }
        if(control) {
            decimal=0;
        }
        this.input=decimal;
    }
    public int getInput() {
        return input;
    }}