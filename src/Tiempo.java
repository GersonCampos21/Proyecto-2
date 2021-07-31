/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hewlett Packard
 */
public class Tiempo {

    private int Horas;
    private int Minutos;
    private int Segundos;

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        if (Horas >= 0 && Horas <= 23) {
            this.Horas = Horas;
        }
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        if (Minutos >= 0 && Minutos <= 59) {
            this.Minutos = Minutos;
        }
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setSegundos(int Segundos) {
        if (Segundos >= 0 && Segundos <= 59) {
            this.Segundos = Segundos;
        }
    }

    public Tiempo() {
        this(0, 0, 0);
    }

    public Tiempo(int Horas, int Minutos, int Segundos) {
        this.setHoras(Horas);
        this.setMinutos(Minutos);
        this.setSegundos(Segundos);
    }

    public void Avanzar() {
        this.Segundos++;
        if (Segundos > 59) {
            this.Segundos = 0;
            this.Minutos++;
        }
        if (Minutos > 59) {
            this.Minutos = 0;
            this.Horas++;
        }
        if (this.Horas > 23) {
            this.Horas = 0;
        }
    }

    public void Restar() {
        this.Segundos--;
        if (Segundos < 0) {
            this.Segundos = 59;
            this.Minutos--;
        }
        if (Minutos < 0) {
            this.Minutos = 59;
            this.Horas--;
        }
        if (this.Horas < 0) {
            this.Horas = 59;
        }
    }

}
