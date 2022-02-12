// Clase hotel
package hotel;

import java.util.ArrayList;

/**
 *
 * @author Tito
 */
public class Hotel {
    //Atributos 
    private String NombreHotel;
    private String Ruc;
    private ArrayList<Habitacion> listaHabitaciones = new ArrayList();
    
    //Constructor vacio y con los atributos inicalizados
    public Hotel() {
        this.NombreHotel=" HOTEL PATRIOTICO";
        this.Ruc="0296537341001";
    }
    public void HotelAdd(String numeracion, String tipo, String estado){
        Habitacion habitacion = new Habitacion (numeracion,tipo,estado);
        listaHabitaciones.add(habitacion);
    }

    /**
     * @return the NombreHotel
     */
    public String getNombreHotel() {
        return NombreHotel;
    }

    /**
     * @param NombreHotel the NombreHotel to set
     */
    public void setNombreHotel(String NombreHotel) {
        this.NombreHotel = NombreHotel;
    }

    /**
     * @return the Ruc
     */
    public String getRuc() {
        return Ruc;
    }

    /**
     * @param Ruc the Ruc to set
     */
    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    /**
     * @return the listaHabitaciones
     */
    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }
    
    
    
}
