package Package.playList;

import java.util.Comparator;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase que implementa la interface Comparator de Java, la uso para definir los criterios por los cuales
 * hago la coparación para filtar las canciones por duración
 */

public class CompareDuration implements Comparator<MainLibrary> {
    @Override
    public int compare(MainLibrary song1, MainLibrary song2) {
        if(song1.getDuration() < song2.getDuration()) {
            return -1;
        }else if(song1.getDuration() < song2.getDuration()) {
            return 0;
        }else
            return 1;
    }
}
