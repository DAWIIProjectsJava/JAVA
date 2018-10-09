/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 100005978.joan23
 */
public class Int_data {
    
    //Local variables
    private static int cont=1;
    private static double mark;
    private static double media;
    private static double mediaT;
    
    // Object variables
    static DecimalFormat df = new DecimalFormat("#.00");
    static Scanner keyboard = new Scanner(System.in);
    
    //Task - 
    public static void int_notas (ArrayList<Double> list, String materia, ArrayList<Storage> totalMedia,String nombre_user, ArrayList<Storage_MediasTotal> MMedias) { //<- Local variables
            
            // Loop Variables Reset
            mediaT=0;
            list.clear();
            media=0;
            cont=1;
            
            
            if (!materia.equals("q")) { //Subject checking
                System.out.println("\nIntroducción de notas. Número negativo para salir\n");
            
                do {
                    // Grade assigment in variable mark
                    System.out.println("\tIntroducce la nota " + cont + " de la materia " + materia);
                    mark=keyboard.nextDouble();
                    
                    // End condition checking
                    if (mark>=0) {
                        list.add(mark);
                    }
                    
                    cont++;
                    
                } while (mark>=0);
                
                list.forEach((a) -> { // For each loop. Suma de todas las notas de una materia
                    media+=a;
                });
                media/=list.size(); // Cálculo media real
                
                //Creación de objeto joint con builder con variables y save de nombre de materia, la nota media y nombre de usuario.
                Storage joint = new Storage(nombre_user,media,materia);
                totalMedia.add(joint);
                
                //Muestra de media - Fijación a 2 decimales
                System.out.println("\t RESULTADOS");
                System.out.println("\nMedia de " + materia + ": " + df.format(media));
            
                //Medias de curso y nombre.
                
            }
    }
            
}
