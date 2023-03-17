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
public class EjemploGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipo = new String[7];
        System.out.println("Ingrese el nombre de sus compañeros de equipo:");
        Scanner read = new Scanner(System.in);
        
        for (int i=0; i<7 ; i++) {
            equipo[i] = read.nextLine();
        }
    }
}
