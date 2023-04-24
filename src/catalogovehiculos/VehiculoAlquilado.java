/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogovehiculos;

/**
 *
 * @author danie
 */

public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;
    
    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalAlquiler){
    this.cliente = cliente;
    this.vehiculo = vehiculo;
    this.diaAlquiler = diaAlquiler;
    this.mesAlquiler = mesAlquiler;
    this.añoAlquiler = añoAlquiler;
    this.totalDiasAlquiler = totalAlquiler;
    
    
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    } 

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public int getAñoAlquiler() {
        return añoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    
           
}
