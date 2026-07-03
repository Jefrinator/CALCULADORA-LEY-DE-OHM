package Logica;

public class Calculadora {

    
    public double calcularVoltaje(double corriente, double resistencia) {
        return corriente * resistencia;
    }

    public double calcularCorriente(double voltaje, double resistencia) {
        return voltaje / resistencia;
    }

    
    public double calcularResistencia(double voltaje, double corriente) {
        return voltaje / corriente;
    }
}
