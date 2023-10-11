// Valida el numero del 1 al 7 ingresado, devuelve el dia de la semana que corresponde

import java.util.Scanner;

public class _p76_DiaSemana {

    public static int diaSemana(int dia) {
        if (dia==1) {System.out.print("El dia 1 es el Lunes");}
        else if (dia==2) {System.out.print("El dia 2 es el Martes");}
        else if (dia==3) {System.out.print("El dia 3 es el Miercoles");}
        else if (dia==4) {System.out.print("El dia 4 es el Jueves");}
        else if (dia==5) {System.out.print("El dia 5 es el Viernes");}
        else if (dia==6) {System.out.print("El dia 6 es el Sabado");}
        else if (dia==7) {System.out.print("El dia 7 es el Domingo");}
        return dia;

    }
    public static void main(String[] args) {
        int dia;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        do{
        System.out.print("Dame un numero del 1 al 7 "); dia = obj.nextInt();
        }while(dia>7);

        diaSemana(dia);
    }
}