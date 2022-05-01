package Package.playList;

import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase FilterYear esta clase tiene el submenu del comportamiento para filtrar las canciones por años
 */

public class FilterYear {

    Scanner sc = new Scanner(System.in);
    int findYear;
    MainLibrary listMusic = new MainLibrary();
    int option;

    public void filterYearSongs() {

        try{
            do {

                System.out.println("1. Search by year: ");
                System.out.println("2. Return to main menu");
                System.out.println(":::::::::::::::::");

                option = Integer.valueOf(sc.nextLine());

                switch (option){
                    case 1:
                        System.out.println("Enter the year of search: ");
                        findYear = Integer.valueOf(sc.nextLine());

                        listMusic.songs.stream().forEach((p)->{
                            if(findYear == p.getYear()) {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        break;
                    case 2:
                        System.out.println(":::::Returning :::::");
                        break;
                    default:
                        System.out.println("Please, enter a correct option");
                }
            }while(option !=2);
        }catch(NumberFormatException e){
            throw e;
        }
    }

}
