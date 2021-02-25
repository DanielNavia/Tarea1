import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Daniel Navia - Carlos Muñoz - Adrian Torres 
 * 
 */
public class ClienteMain {

    public static List<Viaje> viajes = new ArrayList();

    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();
    }

    public static void leerViajes() 
    {
        try 
        {
             Viaje viaje = new ViajeFamiliar(10, "Popayan", "Bogota", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
            viajes.add(viaje);
            Viaje viaje1 = new ViajeIncentivo("Emtel","Popayan", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
            viajes.add(viaje1);
            Viaje viaje2 = new ViajeIndividual("Popayan", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("21/07/2019"));
            viajes.add(viaje2);        
            Viaje viaje3 = new ViajeTodoIncluido("Popayan", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);
            
            
        } catch (ParseException ex) 
        {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static void mostrarViajes() 
    {   
        for (Viaje viaje : viajes) 
        {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Descripcion: " + viaje.descripcion());
            System.out.println("Cualquier metodo: " + viaje.cualquierMetodo());
            System.out.println("Cualquier metodo2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }
    }
}
