/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag233;

/**
 *
 * @author ap550
 */
public class Alcance {
    
    private int x=1;
    
    public void iniciar(){
    
        int x=5;
        
        System.out.printf("La local x del metodo iniciar es %d\n", x);
        
        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();
        
        System.out.printf("\nLa x local en el metodo iniciar es %d\n", x);
        
    } //iniciar
    
    public void usarVariableLocal(){
    
        int x=25;
        
        System.out.printf(
                "\nLa x local al entrar al metodo usarVariableLocal es %d\n", x );
        ++x;
        System.out.printf(
                "La x local antes de salir del metodo usarVariableLocal es %d\n", x);
    } //VariableLocal
    
    public void usarCampo(){
    
        System.out.printf(
                "\nEl campo x al entrar al metodo usarCampo es %d\n", x);
        x *= 10;
        System.out.printf(
                "El campo x antes de salir del metodo usarCampo es %d\n", x);
    } //Campo
}
