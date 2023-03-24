/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag229;

import java.util.Random;

/**
 *
 * @author ap550
 */
public class Craps {
    
    private Random numerosAleatorios= new Random();
    
    private enum Estado{CONTINUA, GANO, PERDIO};
    
    private final static int DOS_UNOS=2;
    private final static int TRES=3;
    private final static int SIETE=7;
    private final static int ONCE=11;
    private final static int DOCE=12;
    
    public void jugar(){
    
        int miPunto=0;
        Estado estadoJuego;
        
        int SumaDeDados = tirarDados();
        
        switch(SumaDeDados){
        
            case SIETE:
            case ONCE:
                estadoJuego= Estado.GANO;
                break;
                
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego = Estado.PERDIO;
                break;
            default:
                estadoJuego = Estado.CONTINUA;
                miPunto = SumaDeDados;
                System.out.printf("El punto es %d\n", miPunto);
                break;
        } //switch
        
        while(estadoJuego ==Estado.CONTINUA){
        
            SumaDeDados = tirarDados();
            
            if(SumaDeDados == SIETE)
                estadoJuego = Estado.PERDIO;
        } //while
        
        if(estadoJuego == Estado.GANO)
            System.out.println("El jugador gana");
        else
            System.out.println("El jugador pierde");
    } //jugar
    
    public int tirarDados(){
    
        int dado1= 1 + numerosAleatorios.nextInt(6);
        int dado2= 1 + numerosAleatorios.nextInt(6);
        
        int suma= dado1 + dado2;
        
        System.out.printf("El jugador tiro %d + %d = %d\n",
                dado1, dado2, suma);
        
        return suma;
    } //tirarDados
} //Craps
