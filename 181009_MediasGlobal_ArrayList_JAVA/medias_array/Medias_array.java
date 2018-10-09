/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medias_array;

import java.util.ArrayList;
import java.util.Scanner;
import methods.Int_data;
import methods.Int_mat;
import methods.Storage;
import methods.Storage_MediasTotal;


/**
 *
 * @author 100005978.joan23
 */
public class Medias_array {
    //Local Variables
    private static String name;
    private static String topic;
    private static double mediaT;
    private static int cont;
    
    //Object Variables
    static ArrayList<Double> vector = new ArrayList();
    static ArrayList<Storage> vectorMedia = new ArrayList();
    static ArrayList<Storage_MediasTotal> vector_MedT = new ArrayList();
    static Scanner keyboard = new Scanner(System.in);
    
    //Constructor
    public Medias_array() {
    }
    
    //Program: main csll
    public static void main(String[] args) {
        
        do {// Loop do...while - Name checking
            mediaT=0;
            cont=0;
            System.out.println("Introduce tu nombre - Tecla q para salir");
            name = keyboard.next(); //Variable name = User Name
            
            
            if (!name.equals("q")) { // Conditional if - Depending name.
                do { //True branch - name!=q
                    topic = Int_mat.int_mat(); // Int_mat.java calling - 
                    if (!name.equals("q") || !topic.equals("q")) {
                        //max_mat= Int_cant.int_cant();
                        Int_data.int_notas(vector,topic,vectorMedia,name,vector_MedT);
                        vector.clear();
                    } else { // False branch - name=q
                        break;
                    }
                } while (!topic.equals("q")); //End - Subject checking
                for (Storage b: vectorMedia) {
                    if (b.getUser()==name) {
                        cont++;
                        mediaT += b.getNotamedia();
                    }
                    
                }
                mediaT/=cont;
                Storage_MediasTotal save_med = new Storage_MediasTotal(name,mediaT);
                vector_MedT.add(save_med);
            }
            
            
            
        } while (!name.equals("q")); // End - Name checking
        
        //For each loop - Memory Writing - Nombre,Materia,Nota media de materia
        System.out.println("\t HISTORIAL");
        for (Storage a:vectorMedia) {
            System.out.println(a.getUser() + "\t\t" + a.getMateria() + "\t\t" + a.getNotamedia());
        }
        
        System.out.println("\n\n\t HISTORIAL CURSO");
        for (Storage_MediasTotal c:vector_MedT) {
            System.out.println(c.getName_user() + "\t" + c.getMed_curso());
        }
        
        
        
        //ArrayList<Double> vector = new ArrayList();
        
        
        
    
    }
    
    /*public static void int_notas (ArrayList<Double> list, String materia) {
            
            //double mark;
            //int cont=1;
            //double media=0;
            
            System.out.println("\nIntroducción de notas. Número negativo para salir\n");
            do {
                
                System.out.println("\tIntroducce la nota " + cont + " de la materia " + materia);
                mark=keyboard.nextDouble();
                if (mark>=0) {
                    list.add(mark);
                }
                cont++;
            } while (mark>=0);
//            list.forEach((a) -> {
            for ( Double a:list ) {
                media+=a;
            }
            media/=list.size(); // media=media/list.size();
            System.out.println("\nMedia de " + materia + ": " + df.format(media));
    }*/

    //Función que devuelve la cantidad de materias
    /*public static int int_cant() {
        //int cant;
        
        System.out.println("Introduce la cantidad de materias de las que quieres obtener la media: ");
        cant = keyboard.nextInt();
        return cant;
    }*/
    
    //Función que devuelve el nombre de la materia
    /*public static String int_mat() {
        //String mat;
        
        System.out.println("Introduce la materia de la que quieres obtener la media: ");
        mat = keyboard.next();
        return mat;
    }*/
    
}
    
 