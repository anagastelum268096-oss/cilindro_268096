/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

public class Cilindro {
    private double radio;
    private double altura;

  
    public Cilindro(double radio, double altura) {
        if (radio < 0 || altura < 0) {
            throw new IllegalArgumentException("Radio y altura deben ser >= 0");
        }
        this.radio = radio;
        this.altura = altura;
    }

    public double area() {
        return 2 * Math.PI * radio * (altura + radio);
    }

    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return "Cilindro(" + radio + ", " + altura + ")";
    }
}

