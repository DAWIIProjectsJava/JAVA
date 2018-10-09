/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author 100005978.joan23
 */
public class Int_mat {
    //Local Variable
    private static String mat;
    
    //Object Variable
    static Scanner keyboard = new Scanner(System.in);
    
    //Constructor
    public Int_mat() {
        
    }
    
    //Función que devuelve el nombre de la materia
    public static String int_mat() {
        
        //Subject assigment in variable mat.
        System.out.println("Introduce la materia de la que quieres obtener la media - Pulsa q para salir ");
        mat = keyboard.next();
        return mat;
    }
}
