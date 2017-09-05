/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4sep;

/**
 *
 * @author Estudiante
 */
public class Motor {
   private double potencia;
   private String marca;
   private Llanta[] eje;

    public Motor(double potencia, String marca) {
        this.potencia = potencia;
        this.marca = marca;
    }
   

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getMarca() {
        return marca;
    }

    public Llanta[] getEje() {
        return eje;
    }

    public void setEje(Llanta[] eje) {
        this.eje = eje;
    }
   
}
