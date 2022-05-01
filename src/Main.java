import Package.playList.MainLibrary;
import Package.playList.UiMenu;

/**
 * Programa administrador de listas de canciones
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 */


public class Main {
    public static void main(String[] args) {
        MainLibrary init = new MainLibrary();
        UiMenu menu = new UiMenu();

        init.mainMusiclibrary();
        menu.maiMenu();

    }
}
