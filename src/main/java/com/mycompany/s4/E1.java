package com.mycompany.s4;

import java.util.Scanner;

/**
 *MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL PRIMARIA Y SECUNDARIA
 */
public class E1 {

    public static void main(String[] args) {
        int [][] matriz=new  int [10][10];
        int sumP=0,sumS=0,cont=9;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese el numero en la posicion {"+i+"}{"+j+"} : ");
                matriz[i][j]=(int) (Math.random()*100);
                System.out.println(" "+matriz[i][j]);
                if(i==j)
                    sumP=sumP+matriz[i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            sumS=matriz[i][cont]+sumS;
            cont--;
        }
        System.out.println("Diagonal Principal : "+sumP);
        System.out.println("Diagonal Secundaria : "+sumS);
    }
}
