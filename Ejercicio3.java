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
/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, 
etcétera (hasta 5 dígitos).*/
public class Ejercicio3 {
   public static void main(String[] args){
        System.out.println("Ingrese el tamaño del vector");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
        }
        int cont=0,uno=0,dos=0,tres=0,cuatro=0,cinco=0;
        for (int i = 0; i < n; i++) {
            while (vector[i] > 9) {
                vector[i] = vector[i] / 10;
                cont++;
            }
            cont = cont + 1;
            switch (cont) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
            }
            cont = 0;
        }
        System.out.println("hay : " + uno + " numeros de 1 digito");
        System.out.println("hay : " + dos + " numeros de 2 digito");
        System.out.println("hay : " + tres + " numeros de 3 digito");
        System.out.println("hay : " + cuatro + " numeros de 4 digito");
        System.out.println("hay : " + cinco + " numeros de 5 digito");
    }
}
