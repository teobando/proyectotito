//Datos para reservar un habitacion 
package hotel;

/**
 *
 * @author Tito
 */
public class DatosReservacion {
    //Atribtos 
    private Fecha fecha;
    private Cliente cliente; 
    private Habitacion habitacion;
    
    //Constructor con parametros 
    public DatosReservacion(String nombre, String cedula, String telefono, String numeracion,
            String tipo, String estado, String dia, String mes, String anio) {
        
        //Inicializacion de los onjetos que componen a datos de reervacion. 
        this.fecha = new Fecha(dia,mes,anio);
        this.cliente = new Cliente(nombre,cedula,telefono);
        this.habitacion = new Habitacion(numeracion,tipo,estado);
    }


        
    // Metodos Getters y Setters
    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the habitacion
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }

    /**
     * @param habitacion the habitacion to set
     */
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
  
}
