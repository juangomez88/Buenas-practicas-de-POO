package Package.playList;

import java.util.IllegalFormatException;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase UiMenu que representa el menu principal de la aplicación
 */

public class UiMenu {

    public void maiMenu() {

        Scanner sc = new Scanner(System.in);
        FilterGenre fM = new FilterGenre();
        FilterYear fG = new FilterYear();
        FilterByDate fD = new FilterByDate();
        PlayList pL = new PlayList();
        int option;

        MainLibrary library = new MainLibrary();

        try{
            do {

                System.out.println("::::: Select option ::::: ");
                System.out.println("1. View main library");
                System.out.println("2. Add new song");
                System.out.println("3. Create a playlist");
                System.out.println("4. Sort by date");
                System.out.println("5. Sort by length");
                System.out.println("6. Filter library by genre");
                System.out.println("7. Filter library by year");
                System.out.println("8. Leaving");
                System.out.println(":::::::::::::::::::::::::");

                option = Integer.valueOf(sc.nextLine());

                switch (option){
                    case 1:
                        library.viewMusic();
                        break;
                    case 2:
                        library.addSongs();
                        break;
                    case 3:
                        pL.menuPlayList();
                        break;
                    case 4:
                        fD.filterYearSong();
                        break;
                    case 5:
                        fD.filterDurationSong();
                        break;
                    case 6:
                        fM.filterSongs();
                        break;
                    case 7:
                        fG.filterYearSongs();
                        break;
                    case 8:
                        System.out.println(":::: Leaving ::::");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please, select a correct option");
                }

            }while(option != 8);
        }catch (NumberFormatException | IllegalFormatException e){
            System.out.println("Excption capture: " +e);
            maiMenu();
        }
    }
}
