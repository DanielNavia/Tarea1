
import java.util.Date;
/**
 *
 * @author Daniel Navia - Carlos Muñoz - Adrian Torres 
 * 
 */
public class ViajeFamiliar extends Viaje 
{
    
    private int familia;

    public ViajeFamiliar(int familia, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    public String getOrigen() 
    {
        return origen;
    }

    public void setOrigen(String origen)
    {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    //Constructor getters and setters
    @Override
    public String descripcion() {
        return "Viaje para disfrutar en familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Metodo implementado en viaje familiar";
    }
}
