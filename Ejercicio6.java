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
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int[][] matriz=new int[3][3];
        int sumafilas=0,sumacolumnas=0,sumadiagonal=0,total=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingresa un valor para la matriz");
                int num = leer.nextInt();
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==0){
                    sumafilas+=matriz[i][j];
                    sumacolumnas+=matriz[j][i];
                }
                if(i==j){
                    sumadiagonal+=matriz[i][j];
                }
                total+=matriz[i][j];
            }
        }
        total=total/3;
        int sumatotal=sumafilas+sumadiagonal+sumacolumnas+total;
        if(sumatotal==60){
            System.out.println("es un cuadrado magico");
        }else{
            System.out.println("no es un cuadrado magico");
        }
    }
}
