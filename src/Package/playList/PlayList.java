package Package.playList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase PlayList contiene el submenu y los metodos para la creacion de la playlist
 */

public class PlayList {

    Scanner sc = new Scanner(System.in);
    int option;
    int selectId;
    ArrayList<String> myList = new ArrayList<String>();

    public void menuPlayList() {

        try {
            do {
                System.out.println("::::::::::::::::::::::::::");
                System.out.println(":::: Select a option :::: ");
                System.out.println("1. View available songs");
                System.out.println("2. Choose songs");
                System.out.println("3. Remove last song");
                System.out.println("4. Return");

                option = Integer.valueOf(sc.nextLine());

                switch (option) {
                    case 1:
                        viewSongs();
                        break;
                    case 2:
                        selectSongs();
                        break;
                    case 3:
                        removeSongs();
                        break;
                    case 4:
                        System.out.println(":::: Returning ::::");
                        break;
                    default:
                        System.out.println("Please enter a correct option");
                }

            } while (option != 4);

        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /**
     * Metodo que permite ver las canciones selecionadas en el playList
     */

    public void viewSongs() {
        System.out.println(":::::::::::::::::::::::::");
        MainLibrary.songs.forEach((p) -> {
            System.out.println(p.getId() + ". " + p.getTitle());
        });
        System.out.println(":::::::::::::::::::::::::");
        System.out.println("\n");
    }

    /**
     * Método que permite selecionar las canciones para ingresar a la playlist
     */
    public void selectSongs() {
        System.out.println("select song ID: ");
        selectId = Integer.valueOf(sc.nextLine());

        MainLibrary.songs.forEach((s) -> {
            if (s.getId() == selectId) {
                myList.add(s.getTitle());
            }
        });
        System.out.println("This is my playlist: ");
        System.out.println(myList.toString());
    }

    /**
     * Método que elimina la ultima cancion de la playlist
     */
    public void removeSongs() {
        myList.remove(myList.size()-1);
        System.out.println("This is my playlist: ");
        System.out.println(myList.toString());
    }

}
