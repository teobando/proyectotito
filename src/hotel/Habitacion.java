//Clase que crea las habitaciones y las permite reservar
package hotel;

import java.io.Serializable;

/**
 *
 * @author Tito
 */
public class Habitacion implements Serializable{
    //Atributos 
    private String numeracion;
    private String tipo; 
    private String estado;
    private float costo;
    
    //Contructor 
    public Habitacion(String numeracion, String tipo, String estado) {
        this.numeracion = numeracion;
        this.tipo = tipo;
        this.estado = estado;
        costoHabitacion(); 
    }
     
    private void costoHabitacion(){
        if (this.getTipo().equals("Suit")){
            this.setCosto((float) 60.5);
        }
        if(this.getTipo().equals("Individual")){
            this.setCosto((float) 15.5);
        }
        if(this.getTipo().equals("Matrimonial")){
            this.setCosto((float) 20.8);
        }
        if(this.getTipo().equals("Familiar")){
            this.setCosto((float) 25.8);
        }
           

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

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    

    
    
    
}
