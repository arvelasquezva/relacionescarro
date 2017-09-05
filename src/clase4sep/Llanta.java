/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4sep;


public class Llanta {
    private double diametro;
    private String marca;
    private Motor eje;

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Llanta(double diametro, String marca) {
        this.diametro = diametro;
        this.marca = marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setEje(Motor eje) {
        this.eje = eje;
    }
    
}
