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
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int[][] matriz=new int[3][3];
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Escribe un valor para la matriz");
                int num=leer.nextInt();
                matriz[i][j]=num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==-matriz[j][i]){
                    cont++;
                }
            }
        }
        if(cont==9){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
}
