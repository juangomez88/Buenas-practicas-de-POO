package Package.playList;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase abstracta ListMusic, la utilizo como clase padre de mi aplicación
 */

public abstract class ListMusic  {

    private String artist;
    private String title;
    private int id;
    private double duration;
    private String genre;
    private String cover;
    private int year;
    private String description;

    public ListMusic(String title, String artist, int id, double duration, String genre, String cover, int year, String description) {
        this.artist = artist;
        this.title = title;
        this.id = id;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.year = year;
        this.description = description;
    }

    public ListMusic() {

    }

}
