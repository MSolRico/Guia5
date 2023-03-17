/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Ejercicio6PorMi {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumafilas = 0, sumacolumnas = 0, sumadiagonal = 0, cont = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingresa un valor para la matriz del 1 al 9");
                int num = leer.nextInt();
                if ((num > 0) && (num <= 9)) {
                    matriz[i][j] = num;
                } else {
                    System.out.println("El numero ingresado no esta dentro del intervalo");
                    j--;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            sumafilas = 0;
            sumacolumnas = 0;
            for (int j = 0; j < 3; j++) {
                sumafilas += matriz[i][j];
                sumacolumnas += matriz[j][i];
                if (i == j) {
                    sumadiagonal += matriz[i][j];
                }
            }
            if (sumafilas == sumacolumnas) {
                cont++;
            }
        }

        if ((cont == 3) && (sumacolumnas == sumadiagonal)) {
            System.out.println("es un cuadrado magico");
        } else {
            System.out.println("no es un cuadrado magico");
        }
    }
}

