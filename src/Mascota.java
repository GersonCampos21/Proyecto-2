/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hewlett Packard
 */
public class Mascota {
    private boolean Vivo;
    private int Edad;
    private int Energia;
    private int Hambre;
    private int GanasBaño;
    private boolean Enfermo;
    private int Aburrimiento;
    private String Etapa;
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        if(!Nombre.isBlank()){
          this.Nombre = Nombre;
        }
    }

    public boolean isVivo() {
        return Vivo;
    }

    public void setVivo(boolean Vivo) {
        this.Vivo = Vivo;
    }
    

    public String getEtapa() {
        return Etapa;
    }

    public int getEdad() {
        return Edad;
    }

    public int getEnergia() {
        return Energia;
    }

    public int getHambre() {
        return Hambre;
    }

    public int getGanasBaño() {
        return GanasBaño;
    }

    public boolean isEnfermo() {
        return Enfermo;
    }
    
     public void SetEnfermo(boolean enfer) {
        this.Enfermo=enfer;
    }


    public int getAburrimiento() {
        return Aburrimiento;
    }

    public void AumentarAburrimiento(int Aburrimiento) {
        this.Aburrimiento += Aburrimiento;
        validaAumento(this.Aburrimiento);
    }

    public void DisminuirAburrimiento(int Aburrimiento) {
        this.Aburrimiento -= Aburrimiento;
        validaDisminucion(this.Aburrimiento);
    }
    public void AumentarEnergia(int Energia) {
        this.Energia+= Energia;
        validaAumento(this.Energia);
    }

    public void DisminuirEnergia(int Energia) {
        this.Energia -= Energia;
        validaDisminucion(this.Energia);
    }
    public void AumentarHambre(int Hambre) {
        this.Hambre += Hambre;
        validaAumento(this.Hambre);
    }

    public void DisminuirHambre(int Hambre) {
        this.Hambre-= Hambre;
        validaDisminucion(this.Hambre);
    }
    public void AumentarGanasBaño(int GanasBaño) {
        this.GanasBaño += GanasBaño;
        validaAumento(this.GanasBaño);
    }
    public void DisminuirGanasBaño(int GanasBaño) {
        this.GanasBaño -= GanasBaño;
        validaAumento(this.GanasBaño);
    }


    public void CambiarEstados(Tiempo tiemp) {
        if (tiemp.getSegundos() % 5 == 0) {
            this.DisminuirEnergia(1);
            this.AumentarAburrimiento(1);
            this.AumentarGanasBaño(1);
            this.AumentarHambre(1);
        }
        this.Enfermo=EstarEnfermo();
    }
    
     public boolean EstarEnfermo() {
        return this.Aburrimiento >= 90 || this.GanasBaño >= 90 || this.Hambre >= 90||this.Energia <= 10;      
    }

    public void AumentarEdad(Tiempo tiemp) {
        if (tiemp.getMinutos() == 3) {
            this.Edad++;
        }
        if (this.Edad > 3) {
            this.Edad = 0;
        }
    }


    public void CambiarEtapa() {
        if (this.Edad == 0) {
            this.Etapa = "Huevo";
        } else if (this.Edad == 1) {
            this.Etapa = "Bebe";
        } else if (this.Edad == 2) {
            this.Etapa = "Joven";
        } else if (this.Edad == 3) {
            this.Etapa = "Adulto";
        }
    }

    public Mascota() {
        this.Nombre="Charmander";
        this.Vivo=true;
        this.Edad = 0;
        this.Energia = 100;
        this.Hambre = 0;
        this.GanasBaño = 0;
        this.Enfermo = false;
        this.Aburrimiento = 0;
        this.Etapa="Huevo";
    }

    private void validaAumento(int Aburrimiento) {
        if (Aburrimiento > 100) {
            Aburrimiento = 100;
        }
    }

    private void validaDisminucion(int Aburrimiento) {
        if (Aburrimiento < 0) {
            Aburrimiento = 0;
        }
    }
}
