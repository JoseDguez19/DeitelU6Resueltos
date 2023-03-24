/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag236;

/**
 *
 * @author ap550
 */
public class SobrecargaMetodos {
    
    public void probarMetodosSobrecargados(){
    
        System.out.printf( "El cuadrado del entero 7 es %d\n", cuadrado( 7 ) );
 System.out.printf( "El cuadrado del double 7.5 es %f\n", cuadrado( 7.5 ) );
    } //probarMetodosSobrecargados
    
    public int cuadrado( int valorInt ){
        
System.out.printf( "\nSe llamo a cuadrado con argumento int: %d\n",
                    valorInt );

 return valorInt * valorInt;
 } //metodo int
    
    public double cuadrado( double valorDouble ){
        
 System.out.printf( "\nSe llamo a cuadrado con argumento double: %f\n",
         valorDouble );
 
 return valorDouble * valorDouble;
 }
}
