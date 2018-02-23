/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class Anime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner lea = new Scanner(System.in);
        String nombreanime="";
        String horarioanime="";
        String estudio="";

        do {
            try {
                System.out.println("Menu");
                System.out.println("Opcion #1 --- Estudios");
                System.out.println("Opcion #2 --- Televisonra");
                System.out.println("Opcion #3 --- Salir");
                opcion = lea.nextInt();
                
                switch (opcion){
                        case 1:
                            System.out.println(" Menu de estudio");
                            System.out.println("Ingrese nombre del Anime");
                            System.out.println("Ingrese horario del Anime ---  (<inicio-fin>)||<16-20>");
                            System.out.println("Ingrese Estudio creadora del anime");
                            nombreanime = lea.nextLine();
                            horarioanime = lea.nextLine();
                            estudio = lea.nextLine();
                            break;
                        
                        case 2:
                            break;
                        
                        case 3:    
                            break;
                            
                        default:
                            System.out.println("Opcion no valida");
                }
                
            } catch (Exception ex) {
                lea.nextLine();
                System.out.println("Ingreso un valor no numerico");
            }
        } while (opcion != 3);

    }

}
