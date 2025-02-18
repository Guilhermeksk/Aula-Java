/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula1;

/**
 *
 * @author lab53
 */
public class Contador {
        int cont;
    
       void zerar(){
        cont = 0;
      
    }     
        void icrementar(){
                
    cont++;

    }

    void decremetar(){
    if (cont >0) cont--;           
    
    }

    void mostrar(){
     System.out.println(cont);           
    }


}