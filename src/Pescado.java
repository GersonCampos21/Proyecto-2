/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hewlett Packard
 */
public class Pescado extends Alimentos{

    public Pescado() {
        this.Energy=25;
        this.Satisfaccion=25;
        this.TiempoCarga= new Tiempo(0,1,30);

    }
    
    public Tiempo getTiempoCarga() {
        return TiempoCarga;
    }

    public int getEnergy() {
        return Energy;
    }

    public int getSatisfaccion() {
        return Satisfaccion;
    }
    
}
