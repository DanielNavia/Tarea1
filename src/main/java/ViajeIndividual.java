import java.util.Date;
/**
 *
 * @author Daniel Navia - Carlos Muñoz - Adrian Torres 
 * 
 */
public class ViajeIndividual extends Viaje {

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    // Constructor
    @Override
    public String descripcion() {
        return "Viaje individual";
    }
}


