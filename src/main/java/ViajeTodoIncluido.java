


import java.util.Date;
/**
 *
 * @author Daniel Navia - Carlos Muñoz - Adrian Torres 
 * 
 */
public class ViajeTodoIncluido extends Viaje {

    public ViajeTodoIncluido(String string, String string1, int i, Date date, Date date1) {
        super(string, string1, i, date, date1);
    }

    @Override
    public String descripcion() {
        return "Viaje todo incluido";
    }
}

