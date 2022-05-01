package Package.playList;

import java.util.Comparator;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase CompareYear, implementa la interface Comparator de Java, la uso para definir los criterios por los cuales
 * realizo el filtro de las canciones por año
 */

public class CompareYear implements Comparator<MainLibrary> {

    @Override
    public int compare(MainLibrary song1, MainLibrary song2) {
        if(song1.getYear() < song2.getYear()) {
            return -1;
        }else if(song1.getYear() < song2.getYear()) {
            return 0;
        }else
            return 1;
    }
}
