//Clase que crea las habitaciones y las permite reservar
package hotel;

/**
 *
 * @author Tito
 */
public class Habitacion {
    //Atributos 
    private String numeracion;
    private String tipo; 
    private String estado;
    //Contructor 

    public Habitacion(String numeracion, String tipo, String estado) {
        this.numeracion = numeracion;
        this.tipo = tipo;
        this.estado = estado;
    }
    
    // Metodos getter y setter

    /**
     * @return the numeracion
     */
    public String getNumeracion() {
        return numeracion;
    }

    /**
     * @param numeracion the numeracion to set
     */
    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    
    
    
}
