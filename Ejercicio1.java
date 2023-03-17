/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author SFC
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector;
        vector = new int[100];

        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }

        for (int i = 99; i > -1; i--) {
            System.out.println("[" + vector[i] + "]");
        }

    }
}
