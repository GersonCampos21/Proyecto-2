
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hewlett Packard
 */
public class Control {

    private FrmJuego interfaz;
    private Mascota mascota;
    private Tiempo tiempo;
    // public void HabilitarComidas();

    public void Curar() {
        if (mascota.isEnfermo()) {
            mascota.SetEnfermo(false);
        } else {
            mascota.SetEnfermo(true);
        }
        if (mascota.getEnergia() <= 10) {
            mascota.AumentarEnergia(20);
        }
        if (mascota.getGanasBaño() >= 90) {
            mascota.DisminuirGanasBaño(20);
        }
        if (mascota.getHambre() >= 90) {
            mascota.DisminuirHambre(20);
        }
        if (mascota.getAburrimiento() >= 90) {
            mascota.DisminuirAburrimiento(20);
        }
    }

    public void MatarMascota() {
        if (mascota.EstarEnfermo() && mascota.isEnfermo() || mascota.getEnergia() == 0 || mascota.getAburrimiento() == 100 || mascota.getGanasBaño() == 100 || mascota.getHambre() == 100) {
            mascota.setVivo(false);
            //Va parte grafica
        }
    }

    private void EtapaMascota() {
        interfaz.getLblMascota().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+mascota.getEtapa()+".gif")));
    }
    
    private void ActualizarLbl(){
        mascota.setNombre(comodin.nombre);
       interfaz.getLblNombre().setText(mascota.getNombre());
    }
    
    public void InicioJuego(){
        this.EtapaMascota();
        this.ActualizarLbl();
    }

    public Control(FrmJuego interfaz, Mascota mascota) {
        this.interfaz = interfaz;
        this.mascota = mascota;
    }

}
