/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Jeff
 */
public class Validaciones {
    public boolean campoVacio(String texto) {
        return texto.trim().isEmpty();
    }

    
    public boolean esNumero(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean esPositivo(double numero) {
        return numero > 0;
    }
    
    //Metodo a comprobar si la tecla ingresada es de control
    private static boolean esCaracterDeControl(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        return Character.isISOControl(car) || 
               evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE ||
               evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE;
    } 
    
    //Sobrecarga de esNumero destinado para eventos
    public static boolean esNumero(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        return Character.isDigit(car) || esCaracterDeControl(evt);
    } 
}
