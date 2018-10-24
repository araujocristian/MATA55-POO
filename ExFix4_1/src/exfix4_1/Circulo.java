package exfix4_1;

import java.lang.Math;
/**
 *
 * @author ime
 */
public class Circulo {
    private double raio;
    private static final double PI = 3.14159;


    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double area(){
        return PI*Math.pow(this.raio, 2);
    }
    
    public double perimetro(){
        return 2*PI*this.raio;
    }
}
