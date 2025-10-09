/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int tama;
        System.out.println("Numero de Calificaciones: ");
        tama = captu.nextInt();
        //CAPTURA
        int cali [] = new int[tama];
        for (int i = 0; i < cali.length; i++){
            System.out.println("Calificacion numero " + (i + 1) + ":");
            cali[i] = captu.nextInt();
        }
        //LECTURA
        for (int i = 0; i < cali.length; i++){
            System.out.println( cali[i] );
            
        }
        //PROMEDIO DEL GRUPO
        //Sumar todas las calificaciones
        int scali = 0;
        for (int i = 0; i < cali.length; i++){
            scali = scali + cali[i];
        }
        System.out.println("acumulado: " + scali);
        double promedio = scali / (double)cali.length;
    }
    
}
