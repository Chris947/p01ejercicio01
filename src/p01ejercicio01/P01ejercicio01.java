/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingresamos Scanner
        Scanner sc= new Scanner(System.in);
        
        //Ingresando datos
        double a, b, producto =0;
        System.out.print("Ingrese el primer numero");
        a=sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        b=sc.nextDouble();
        System.out.println("");
        
        while(b!=0){
          producto = producto + a;
          b=b-1;
        
    }
        
        System.out.print("El producto entre los dos numeros es: " + producto);
        
       
        
    }
    
}
