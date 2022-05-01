package Package.playList;

import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase FilterGenre, contiene el submenu para filtar por genero las canciones de la lista principal
 */

public class FilterGenre {
    Scanner sc = new Scanner(System.in);
    MainLibrary listMusic = new MainLibrary();
    int option;

    public void filterSongs() {


        System.out.println("Search by Genre: ");
        System.out.println(":::::::::::::::::: ");

        try {
            do {
                System.out.println("1. Alternative Rock");
                System.out.println("2. Blues Rock");
                System.out.println("3. Pop");
                System.out.println("4. Rock");
                System.out.println("5. Rock/pop");
                System.out.println("6. Rock en español");
                System.out.println("7. Hard Rock");
                System.out.println("8. Indie Rock");
                System.out.println("9. Return to main menu");

                option = Integer.valueOf(sc.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Alternative Rock");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Alternative Rock") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("Blues Rock");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Blues Rock") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Pop");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Pop") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("Rock");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Rock") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("Rock/pop");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Rock/pop") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 6:
                        System.out.println("Rock en español");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.forEach((p) -> {
                            if (p.getGenre() == "Rock en español") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 7:
                        System.out.println("Hard Rock");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Hard Rock") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 8:
                        System.out.println("Indie Rock");
                        System.out.println("::::::::::::::::");
                        listMusic.songs.stream().forEach((p) -> {
                            if (p.getGenre() == "Indie Rock") {
                                System.out.println("Artist: " + p.getArtist() + " --- Title: " + p.getTitle() + " --- Duration: " + p.getDuration());
                            }
                        });
                        System.out.println(":::::::::::::::::");
                        System.out.println("\n");
                        break;
                    case 9:
                        System.out.println(":::: returning ::::");
                        break;
                    default:
                        System.out.println("Please, select a correct option");
                }

            } while (option != 9);
        } catch (NumberFormatException e) {
            throw e;
        }

    }
}
