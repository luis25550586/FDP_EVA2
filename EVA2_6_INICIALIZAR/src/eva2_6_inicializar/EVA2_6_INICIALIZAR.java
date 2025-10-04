/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_inicializar;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_6_INICIALIZAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diaSem[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Sabado", "domingo"};
        Scanner captu = new Scanner (System.in);
        int dia;
        System.out.println("Dia de la semana (0-6): ");
        dia = captu.nextInt();
        System.out.println(diaSem[dia]);
    }
    
}
