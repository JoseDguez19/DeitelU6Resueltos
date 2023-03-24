/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag225;

import java.util.Random;

/**
 *
 * @author ap550
 */
public class EnterosAleatorios {
    
    public static void main(String[] args) {
        
        Random numerosAleatorios = new Random();
        int cara;
        
        for(int contador=1; contador<=20; contador++){
        
            cara =1 + numerosAleatorios.nextInt(6);
            System.out.printf("%d ", cara);
            
            if(contador %5 ==0)
                System.out.println("");
        }
    }
}
