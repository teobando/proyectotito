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
    
    //Constructor 
    public DatosReservacion(Fecha fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

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
