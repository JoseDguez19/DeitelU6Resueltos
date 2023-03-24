/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag254;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class Eesfera {
        
        public void determinarVolumenEsfera(){
        
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Escriba el radio de la esfera: ");
                double radio = entrada.nextDouble();
                
            System.out.printf("El volumen es %f\n", volumenEsfera(radio)); 
            
        }
        
        public double volumenEsfera(double radio){
        
            double volumen = (4.0 / 3.0)* Math.PI * Math.pow(radio, 3);
            return volumen;
        }
}
