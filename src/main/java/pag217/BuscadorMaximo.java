/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag217;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class BuscadorMaximo {
    
    public void DeterminarMaximo(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print(
                "Escriba tres valores de punto flotante, separados por espacios:  ");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        
        double resultado = maximo(n1, n2, n3);
        
        System.out.println("El maximo es: " +resultado);
    
    }
    
    public double maximo(double x, double y, double z){
        
        double ValorMaximo =x;
        
        if(y>ValorMaximo)
            ValorMaximo =y;
        
        if(z>ValorMaximo)    
            ValorMaximo=z;
        
        return ValorMaximo;    
    
    }
}
