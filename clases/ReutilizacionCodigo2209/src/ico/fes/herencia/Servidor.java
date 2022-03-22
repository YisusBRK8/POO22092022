/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import asus.com.Computadora;
import reutilizacioncodigo2209.ico.fes.componentes.Monitor;
import reutilizacioncodigo2209.ico.fes.componentes.Mouse;
import reutilizacioncodigo2209.ico.fes.componentes.Procesador;
import reutilizacioncodigo2209.ico.fes.componentes.Teclado;

/**
 *
 * @author jesgm
 */
public class Servidor extends Computadora{
     private int numeroFuentePoder;
    private int numeroTarjetasRed;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(int numeroFuentePoder, int numeroTarjetasRed, int tipoRaid) {
        this.numeroFuentePoder = numeroFuentePoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuentePoder, int numeroTarjetasRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentePoder = numeroFuentePoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuentePoder() {
        return numeroFuentePoder;
    }

    public void setNumeroFuentePoder(int numeroFuentePoder) {
        this.numeroFuentePoder = numeroFuentePoder;
    }

    public int getNumeroTarjetasRed() {
        return numeroTarjetasRed;
    }

    public void setNumeroTarjetasRed(int numeroTarjetasRed) {
        this.numeroTarjetasRed = numeroTarjetasRed;
    }

    @Override
    public String toString() {
        return super.toString() +"Servidor{" + "numeroFuentePoder=" + numeroFuentePoder + ", numeroTarjetasRed=" + numeroTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
}
}