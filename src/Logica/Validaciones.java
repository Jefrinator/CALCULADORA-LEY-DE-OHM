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
}
