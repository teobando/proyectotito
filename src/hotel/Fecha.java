//Clase para crear fechas de reservación
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Tito
 */
public class Fecha {
    //Atributos 
    private int dia;
    private int mes;
    private int anio;
    
    //Contructor 
    public Fecha(String dia, String mes, String anio) {
        this.dia = Integer.parseInt(dia);
        this.mes = Integer.parseInt(mes);
        this.anio = Integer.parseInt(anio);  
    }
    
    @Override
    public String toString() {
        return this.getDia()+"/"+this.getMes()+"/"+this.getAnio();
    }
    
    //Metofos Getter y setter. 
    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
