/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogovehiculos;
import java.util.Calendar;
/**
 *
 * @author danie
 */
public class EmpresaAlquilerVehiculo {
    private String cif;
    private String nombre;
    private int totalClientes;
    private int totalVehiculos;
    private int totalAlquileres;
    private Cliente clientes[];
    private Vehiculo vehiculos[];
    private VehiculoAlquilado alquileres[];
    
    public EmpresaAlquilerVehiculo(){
    cif = "";
    nombre = "";
    totalClientes = 0;
    totalVehiculos = 0;
    totalAlquileres = 0;
    clientes = new Cliente[50];
    vehiculos = new Vehiculo[50];
    alquileres = new VehiculoAlquilado[100];
         
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }
 
      public void registrarCliente(Cliente cliente){
        this.clientes[this.totalClientes] = cliente;
         this.totalClientes++;
    }
      public void registrarVehiculo(Vehiculo vehiculo){
      this.vehiculos[this.totalVehiculos] = vehiculo;
       this.totalVehiculos++;
      }
      
      public String imprimirClientes(){
       String resultado = "";
          for (int i = 0; i < this.totalClientes ; i++) {
             resultado = resultado +  "Nombre: " + clientes[i].getNombre() + "\n"
            + "Apellidos: " + clientes[i].getApellidos() + "\n"
            + "Nif: " + clientes[i].getNif() + "\n\n";
          }
          return resultado;
      }
      
      public String imprimirVehiculos(){
      String resultado = "";
          for (int i = 0; i < this.totalVehiculos; i++) {
             resultado = resultado + "Matricula: " + vehiculos[i].getMatricula() + "\n"
             + "Modelo: " + vehiculos[i].getModelo() + "\n"
             + "Color: " + vehiculos[i].getColor() + "\n"
             + "Tarifa: " + vehiculos[i].getTarifa() + "\n"
             + "Disponibilidad: " + vehiculos[i].getDisponible() + "\n\n";
          }
      return resultado;
      }
      public Cliente buscarCliente(String nif){
          for (int i = 0; i < this.totalClientes; i++) {
              if((this.clientes[i].nif).equals(nif)){
                return this.clientes[i];
                
              }
             
          }
          
           return null;
      }
      private Vehiculo buscarVehiculo(String matricula){
         Vehiculo encontrar = null;
          for (int i = 0; i < this.getTotalVehiculos(); i++) {
              if(this.vehiculos[i].getMatricula().equals(matricula)){
                encontrar = this.vehiculos[i];
              }
             
          }
           return encontrar;
      }
      
      
      public void alquilarVehiculo(String matricula, String nif, int dias){
      /// VehiculoAlquilado vehiculoC;
         Calendar c = Calendar.getInstance();
         int dia = c.get(Calendar.DAY_OF_MONTH);
          int mes = c.get(Calendar.MONTH);
           int año = c.get(Calendar.YEAR);
            Cliente cliente = buscarCliente(nif);
              Vehiculo vehiculo = buscarVehiculo(matricula);
               if(vehiculo.getDisponible()){
            vehiculo.setDisponible(false);
        this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente, vehiculo, dia, mes, año, dias);
      totalAlquileres++;
         
      }
    }
      public void recibirVehiculo(String matricula){
       Vehiculo vehiculo = buscarVehiculo(matricula);
       if (vehiculo != null){
         vehiculo.setDisponible(true);
       }
      }
      public String mostrarAlquilados(){
       String resultado = "";
          for (int i = 0; i < this.totalAlquileres; i++) {
             resultado += "Nombre del cliente: " + alquileres[i].getCliente().getNombre() + "\n"
             + "Matricula del auto: " + alquileres[i].getVehiculo().getMatricula() + "\n"
             + "Fecha alquiler: " + alquileres[i].getDiaAlquiler() + " - " + alquileres[i].getMesAlquiler() + " - " + alquileres[i].getAñoAlquiler() + "\n"
             + "Total días alquiler: "  + alquileres[i].getTotalDiasAlquiler(); 
          }
          return resultado;
      }
      
}
      
