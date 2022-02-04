/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

/**
 *
 * @author Tito
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotel = new Hotel();
        hotel.HotelAdd("02", "Suit");
        hotel.HotelAdd("03", "Matrimonial");
        for (int i=0; i<hotel.getListaHabitaciones().size();i++){
            System.out.println(hotel.getListaHabitaciones().get(i).getTipo());
        }
    }
    
}
