package Package.playList;

import java.util.Collections;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase FilterByDate, clase que contiene los metodos para realizar el filtro por fecha
 */

public class FilterByDate extends ListMusic {

    private int option;
    private String title;
    private int id;
    private String artist;
    private double duration;
    private String genre;
    private String cover;
    private int year;
    private String description;

    public FilterByDate(String title, String artist, int id, double duration, String genre, String cover, int year, String description) {
        super(title, artist, id, duration, genre, cover, year, description);
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.year = year;
        this.description = description;
    }

    public FilterByDate() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Metodo que Collections, y sort con CompareYear(Implementación de la interfaces comparator)
     */

    public void filterYearSong() {
        Collections.sort(MainLibrary.songs, new CompareYear());
        MainLibrary.songs.forEach((p)->{
            System.out.println("Year: "+p.getYear()+" --- Artis: "+p.getArtist()+" --- Title: "+p.getTitle());
        });
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\n");
    }

    public void filterDurationSong() {
        Collections.sort(MainLibrary.songs, new CompareDuration());
        MainLibrary.songs.forEach((p)->{
            System.out.println("Duration: "+p.getDuration()+" --- Artist: "+p.getArtist()+" --- Title:"+p.getTitle());
        });
    }
}
