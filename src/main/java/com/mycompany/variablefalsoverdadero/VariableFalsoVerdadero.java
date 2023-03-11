/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.variablefalsoverdadero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VariableFalsoVerdadero {

    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       System.out.print("Contestar de manera correcta las preguntas: \n" );
       System.out.print("Cual de los 2 numero es mayor: \n"); 
        System.out.print(" 5 y 1 ?: \n");
        
       System.out.print("Ingrese numero");
       int numero = sc.nextInt();
       boolean r = validarEntre(numero);
       System.out.println(r);
       
    }
    
    public static boolean validarEntre(int n){
      boolean resultado;
      if (n>=5 && n<=5){
          resultado = true;
          
      }else{
           resultado = false;         
      }
      return resultado;

}