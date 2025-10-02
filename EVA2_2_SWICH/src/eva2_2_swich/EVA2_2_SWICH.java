/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_swich;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_2_SWICH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SWICH --> OPCION MULTIPLE
        int dia;
         Scanner captu = new Scanner(System.in);
         System.out.println("Numero del dia de la semana: ");
         dia = captu.nextInt();
        /* if (dia == 1){
             System.out.println("Domingo");    
         }else if(dia == 2){
           System.out.println("Lunes");  
         }else if(dia == 3){
          System.out.println("Martes");   
         }else if(dia == 4){
          System.out.println("Miercoles");   
         }else if(dia == 5){
          System.out.println("Jueves");   
         }else if(dia == 6){
          System.out.println("Viernes");   
         }else if(dia == 7){
          System.out.println("Domingo");   
         }else{
             System.out.println("Tu respuesta no es valida escoja entre 1-7");
         }*/
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;// FIN DEL CASO DE SWICH
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:// 
                System.out.println("Numero incorrecto");
    }
    }
    
}
