/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import hotel.Habitacion;
import java.io.*;

/**
 *
 * @author Tito
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion("01","Suit","Disponible");
        Habitacion habitacion2 = new Habitacion("02","Suit","Disponible");
        // TODO code application logic here
            final String NOMBRE_ARCHIVO ="habitaciones.bin";
//            try{
//                OutputStream os= new FileOutputStream(NOMBRE_ARCHIVO);
//                ObjectOutputStream oos = new ObjectOutputStream(os);
//                oos.writeObject(habitacion1); 
//                oos.writeObject(habitacion2);
//                oos.close();
//            }catch(Exception e){
//                System.err.println("Error"+e.getMessage());
//            }
//            System.out.println("");
//        Lectura de objetos 
        try{
            InputStream is = new FileInputStream(NOMBRE_ARCHIVO);
            ObjectInputStream ois = new ObjectInputStream(is);
            
            Habitacion habitacion = (Habitacion) ois.readObject();
            
            System.out.println("Numero: "+habitacion.getNumeracion());
            System.out.println("Estado: "+habitacion.getEstado());
            System.out.println("Tipo: "+habitacion.getTipo());
            
            System.out.println("");
            
            habitacion=(Habitacion) ois.readObject();
            System.out.println("Numero: "+habitacion.getNumeracion());
            System.out.println("Estado: "+habitacion.getEstado());
            System.out.println("Tipo: "+habitacion.getTipo());
        }catch(Exception e){
            System.err.println("Error"+e.getMessage());
        }
    }
    
}
