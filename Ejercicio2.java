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
public class Ejercicio2 {
    public static void main(String[] args){
        int n;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        n = read.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99 + 1);

        }
        System.out.println("Ingrese un numero entero a buscar, entre 1 y 99");

        Boolean bandera = false;
        int x = read.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == vector[i]) {
                System.out.println("El valor " + x + " se encuentra en " + i);
                bandera = true;
            }

        }
        if (bandera == false) {
            System.out.println("El valor buscado no se encuentra dentro del vector");
        }

    }
}
