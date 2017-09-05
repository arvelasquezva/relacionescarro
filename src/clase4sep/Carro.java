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
public class Carro {

    private String marca;
    private Llanta[] delantera;
    private Llanta[] trasera;
    private Motor m;

    public Carro(double potencia, String marca){
    Motor motor = new Motor (potencia, marca);
            this.m =motor;}
    public void adicionaLLantasDelanteras (Llanta[] llantas){
            this.delantera=llantas;
    }
    public void adicionaLLantasTraseras (Llanta[] llantas){
        llantas[0].setEje(this.m);
        llantas[1].setEje(this.m);
        this.trasera=llantas;
            this.m.setEje(llantas);
    }
}
