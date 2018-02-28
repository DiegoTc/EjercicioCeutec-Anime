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
    private static int arraySize = 3;
    private static Animes arregloAnime[] = new Animes[arraySize];
    private static Scanner lea = new Scanner(System.in);

    private static boolean checkArraySize() {
        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i] == null) {
                return true;
            }
        }
        return false;
    }
    
    private static int getArrayPosition(){
        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i] == null) {
                return i;
            }
        }
        return -1;
    }
    

    public static void opcionEstudios() {
        if (checkArraySize() == true) {
            String nombreanime = "";
            String horarioanime = "";
            String estudio = "";
            System.out.println(" Menu de estudio");
            lea.nextLine();
            System.out.println("Ingrese nombre del Anime");
            nombreanime = lea.nextLine();
            boolean timevalidation= false;
            do{
                System.out.println("Ingrese horario del Anime ---  (<inicio-fin>)||<16:00-20:00>");
                horarioanime = lea.nextLine();
                timevalidation = horarioanime.matches("\\d{2}:\\d{2}-\\d{2}:\\d{2}");
                if(timevalidation== false){
                    System.out.println("Formato Incorrecto ---  (<inicio-fin>)||<16:45-20:45>");
                }
                else{
                    
                }
            }while(timevalidation == false);
            System.out.println("Ingrese Estudio creadora del anime");          
            estudio = lea.nextLine();
            Animes anime = new Animes(nombreanime, horarioanime, estudio);
            int posicion = getArrayPosition();
            arregloAnime[posicion] = anime;
        } else {
            System.out.println("Ya no hay horarios disponibles para su anime");
        }

    }
    
    public boolean matches(String regex){
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        System.out.println("\\");
        String horario = "16-dd";
        boolean a;
        a = horario.matches("\\d{2}-\\d{2}");
        do {
            try {
                System.out.println("Menu");
                System.out.println("Opcion #1 --- Estudios");
                System.out.println("Opcion #2 --- Televisora");
                System.out.println("Opcion #3 --- Salir");
                opcion = lea.nextInt();

                switch (opcion) {
                    case 1:
                        opcionEstudios();
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
