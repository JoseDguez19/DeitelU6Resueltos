/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pag238;

import javax.swing.JFrame;
/**
 *
 * @author ap550
 */
public class PruebaDibujarCaraSonriente {
    
    public static void main(String[] args) {
        
        DibujarCaraSonriente panel = new DibujarCaraSonriente();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(230, 250);
        aplicacion.setVisible(true);
    }
}
