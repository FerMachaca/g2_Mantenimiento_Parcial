package calculadora;

import static java.lang.Math.sqrt;

/**
 *
 * @authors G2-Mantenimiento de Software
 */
public class Operaciones {
    public double result;
    
    public double suma(double n1, double n2){
        result = n1 + n2;
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
    public double resta(double n1, double n2){
        result = n1 - n2;
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
    public double multiplicacion(double n1, double n2){
        result = n1 * n2;
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
    public double division(double n1, double n2){
        result = n1 / n2;
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
    public double raizCuadrada(double n1){
        result = sqrt(n1);
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
    public double raizCubica(double n1){
        result = Math.cbrt(n1);
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
    public double potenciaCuadrado(double n1){
        result = Math.pow(n1, 2);
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
    
     public double potenciaCubo(double n1){
        result = Math.pow(n1, 3);
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
    }
     
     public double potenciaN(double n1, double n2){
        result = Math.pow(n1, n2);
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
     }
     
     public double porcentaje(double n1){
        result = n1 / 100;
        String formattedResult = String.format("%.2f", result);
        return Double.parseDouble(formattedResult);
     }
}
