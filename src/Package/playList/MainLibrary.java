package Package.playList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase MainLIbrary
 */

public class MainLibrary extends ListMusic {

    Scanner sc = new Scanner(System.in);

    private String title;
    private int id;
    private String artist;
    private double duration;
    private String genre;
    private String cover;
    private int year;
    private String description;

    public static ArrayList<MainLibrary> songs = new ArrayList<>();

    /**
     * Metodo MainLibrary Crea una instancia de la clase
     * @param artist
     * @param title
     * @param id
     * @param duration
     * @param genre
     * @param cover
     * @param year
     * @param description
     */
    public MainLibrary(String artist, String title, int id, double duration, String genre, String cover, int year, String description) {
        super(artist, title, id, duration, genre, cover, year, description);
        this.title = title;
        this.id = id;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.year = year;
        this.description = description;
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

    public static ArrayList<MainLibrary> getSongs() {
        return songs;
    }

    public static void setSongs(ArrayList<MainLibrary> songs) {
        MainLibrary.songs = songs;
    }

    /**
     * Metodo que crea la libreria de canciones inicial
     */
    public void mainMusiclibrary() {
        songs.add(new MainLibrary("The black keys", "Fever", 1, 4.06, "Alternative Rock",
                "Turn blue.jpg", 2014, "Turn Blue es el octavo álbum de estudio de la banda \n" +
                "estadounidense de rock The Black Keys. Coproducido por Danger Mouse junto con la banda, fue lanzado el\n" +
                " 12 de mayo de 2014 por Nonesuch Records. Danger Mouse contribuyó como coautor en cada una de las once\n " +
                "canciones.\n"));
        songs.add(new MainLibrary("The black keys", "Lonely Boy", 2, 3.13, "Blues Rock",
                "El camino.jpg", 2011, "El Camino es el séptimo álbum de estudio de la banda\n " +
                "estadounidense de rock The Black Keys. Fue coproducido por Danger Mouse y la banda, y fue lanzado el\n " +
                "6 de diciembre de 2011, a través de Nonesuch Records. El álbum está influido por géneros populares en\n " +
                "las décadas de 1950 y 1970, como el rock and roll, el glam rock, el rockabilly, el surf rock y el soul.\n" +
                "Danger Mouse contribuyó como coautor en cada una de las once canciones.\n"));
        songs.add(new MainLibrary("Natalia LaFourcade","Hasta la Raiz",3,3.41,"Pop",
                "Hasta la Raiz.jpg",2015,"Hasta la raíz es el sexto álbum de estudio de la cantante\n" +
                "mexicana Natalia Lafourcade. Sony Music Latin lo lanzó al mercado el 17 de marzo de 2015. Después del\n " +
                "éxito de su anterior álbum, Mujer divina, un homenaje al cantante y compositor mexicano Agustín Lara,\n" +
                " Lafourcade decidió grabar un disco con composiciones originales; luego de pasar tres años escribiéndolas\n " +
                "y andar en busca de inspiración en diferentes ciudades, obtuvo como resultado canciones que expresan\n" +
                "sentimientos muy personales con respecto al amor. Natalia produjo el álbum, con la ayuda del músico\n" +
                "argentino Cachorro López y el artista mexicano Leonel García.\n"));
        songs.add(new MainLibrary("A perfect Circle","Mer de Noms",4,4.07,"Rock",
                "Mer de noms",2000,"Mer de Noms (Francés \"mar de nombres\") es el primer álbum de\n" +
                " estudio de la banda de rock alternativo A Perfect Circle; este salió en versión disco compacto el 23\n " +
                "de mayo de 2000, posteriormente se imprimió una versión de colección en vinil. El título significa\n" +
                "“Mar de Nombres” en francés. Fue certificado como platino por la RIAA el 31 de octubre de 2000.\n" +
                "Entró en la Billboard 200 en la posición N° 4 con 188 000 copias vendidas solo en Estados Unidos en\n" +
                "la primera semana desde el lanzamiento. El primer sencillo que se desprendió de este disco\n " +
                "fue \"Judith\", seguido por \"3 Libras\"\n"));
        songs.add(new MainLibrary("Audioslave","Like a Stone",5,4.53,"Rock",
                "Audiolave (2002).jpg",2002,"Audioslave es el título del álbum debut de estudio\n" +
                "homónimo grabado por el supergrupo estadounidense de rock alternativo Audioslave, Fue lanzado al\n" +
                "mercado por las empresas discográficas Epic Records e Interscope Records el 18 de noviembre de 2002 en\n" +
                " el Reino Unido y un día después en los Estados Unidos. La música desplegada en la grabación\n" +
                "guarda un parecido característico con la de Rage Against the Machine (grupo en el que estaban tres de\n " +
                "los cuatro miembros de Audioslave), mezclado con la característica voz de Chris Cornell, exvocalista\n" +
                "de Soundgarden.\n"));
        songs.add(new MainLibrary("Counting Crows","Mr. Jones",6,4.33,"Alternative Rock",
                "Films About Ghost.jpg",2003,"Films About Ghosts (The Best of...) es un álbum\n" +
                "recopilatorio de la banda estadounidense derock Counting Crows . Fue lanzado por Geffen Records el 2 de\n" +
                " noviembre de 2003. El álbum contiene canciones de todos sus álbumes de estudio. El álbum toma su\n" +
                " nombre de una línea de la Canción de cuna de la Sra. Potter : \" Si los sueños son como películas,\n" +
                " entonces los recuerdos son películas sobre fantasmas \"\n"));
        songs.add(new MainLibrary("Fito Paez","Cadaver Exquisito",7,5.37,"Rock en español",
                "Euforia",1996,"Euforia es el primer disco grabado en vivo por el músico Fito Páez.\n" +
                " Data del año 1996. Al contrario de todos los músicos argentinos que hasta allí habían grabado sus trabajos\n " +
                "acústicos para la cadena MTV, Fito Páez lo realizó en forma independiente en los estudios de televisión argentina Telefe.\n" +
                "Cuenta con canciones que fueron éxitos del autor y tres temas inéditos («Dar es dar», «Cadáver exquisito»\n " +
                "y «Tus regalos deberían de llegar») adaptados todos a un estilo único.\n"));
        songs.add(new MainLibrary("Jack White","Lazzaretto",8,3.38,"Alternative Rock",
                "Lazaretto.jpg",2014,"Lazaretto es el segundo álbum de estudio de Jack White.\n" +
                " Fue lanzado el 10 de junio de 2014, por Third Man Records en colaboración con XL Recordings y Columbia\n" +
                " Records. Lazaretto, según comentó White a un medio especializado en música, Lazaretto está inspirado\n" +
                " en una colección de relatos, poemas y canciones que escribió cuando tenía 19 años y encontró años\n " +
                "después en su casa, decidió trabajar sobre ellos y el resultado fue este álbum.\n"));
        songs.add(new MainLibrary("Kings of Leon","Sex on Fire",9,3.26,"Rock",
                "Only by the night",2008,"Only by the Night es el cuarto álbum de estudio del grupo\n " +
                "de rock alternativo estadounidense Kings of Leon, sacado a la venta mundialmente durante el mes de septiembre\n" +
                " de 2008. El álbum, nominado al Grammy fue comenzado por el grupo pocos días después de sacar su\n" +
                "anterior álbum, Because of the Times. Fue grabado por los productores Angelo Petraglia y Jacquire King\n" +
                " durante febrero de 2008 en los Blackbird Studios de Nashville. Hasta la fecha el álbum ha vendido más\n" +
                " de 6 millones de copias, el cual ha sido certificado con el Disco de Platino en los Estados Unidos.\n"));
        songs.add(new MainLibrary("Metallica","Astronomy",10,6.38,"Hard Rock",
                "Garage Inc.jpg",1998,"Garage Inc. es un álbum de versiones del grupo estadounidense\n" +
                " Metallica, realizado en homenaje a las bandas que marcaron sus raíces, publicado el 24 de noviembre\n" +
                " de 1998. Está íntegramente conformado por versiones, incluyendo todas aquellas que Metallica había\n " +
                "grabado hasta esa fecha.\n"));
        songs.add(new MainLibrary("Oasis","Stand by me",11,5.56,"Indie Rock",
                "Be here now.jpg",1997,"Be Here Now es el tercer álbum de estudio de la banda\n " +
                "inglesa Oasis, lanzado en agosto de 1997. El disco tuvo una alta anticipación por los críticos de\n" +
                " música y los seguidores después del éxito mundial de la banda con su debut de 1994 Definitely Maybe y\n" +
                " su álbum posterior de 1995 (What's the Story) Morning Glory?. Su pre-lanzamiento lo llevó a una\n" +
                "considerable promoción y publicidad en la prensa musical y popular. En ese punto, Oasis estaba en el\n " +
                "tope de su fama, y Be Here Now se convirtió en el álbum vendido más rápidamente en la historia musical\n " +
                "de Reino Unido, donde se vendieron más de 520,000 copias en su primer día de lanzamiento, y más de\n " +
                "tres millones en las tres siguientes semanas. A la fecha, el álbum ha vendido alrededor de 18 millones\n " +
                "de copias en todo el mundo.\n"));
        songs.add(new MainLibrary("Sublime","Take it or leave it",12,3.52,"Pop/Rock",
                "Yours Truly - Sublime with Rome.jpg",2011,"Yours Truly es el álbum debut del grupo\n" +
                "de rock Sublime con Rome, que fue lanzado el 12 de julio de 2011. Es el primer álbum desde que el\n " +
                "Sublime original se disolvió en 1996, debido a la muerte del vocalista y guitarrista Bradley Nowell.\n " +
                "Según las notas de presentación, el álbum está dedicado a él. Tras la ruptura, sus miembros\n " +
                "supervivientes Eric Wilson y Bud Gaugh reformaron Sublime en 2009 casi por accidente, con Rome Ramirez\n " +
                "sustituyendo a Nowell. Sin embargo, el grupo no pudo utilizar el nombre Sublime por motivos legales,\n " +
                "lo que dio lugar al nacimiento de Sublime with Rome. Tras embarcarse en su primera gira por Estados\n " +
                "Unidos en 2010, Sublime with Rome firmó con el sello discográfico Fueled by Ramen y se puso a trabajar\n" +
                " en su primer álbum de estudio de larga duración. El guitarrista Paul Leary de Butthole Surfers, que\n" +
                " coprodujo el último álbum homónimo de Sublime, lo produjo.\n"));
        songs.add(new MainLibrary("The Strokes","The adults ara talking",13,5.09, "Indie Rock",
                "The New Abnormal.jpg",2019,"The New Abnormal —en español: La nueva anormalidad —\n " +
                "es el sexto álbum de estudio de la banda de garage rock estadounidense The Strokes. Fue lanzado el 10 de\n" +
                " abril de 2020 en todas las plataformas y países. Este álbum salió a la venta tras siete años sin un\n" +
                " álbum de estudio, ya que \"Future Present Past\" es un EP publicado en 2016\n"));
        songs.add(new MainLibrary("Twenty One Pilots","Shy away",14,2.55,"Indie Rock",
                "Scaled and Icy.jpg",2021,"Scaled And Icy es el sexto álbum de larga duración y\n" +
                " cuarto álbum de estudio del dúo estadounidense Twenty One Pilots publicado el 21 de mayo de 2021 a\n " +
                "través de Fueled by Ramen y Elektra. El título del álbum es un anagrama de «Clancy is Dead», una\n " +
                "referencia a un personaje de su anterior álbum, Trench. El 19 de noviembre de 2021 se lanzó una versión\n" +
                " livestream del álbum para celebrar su medio aniversario.\n"));
        songs.add(new MainLibrary(" Stereophonics","Do Ya Feel My Love?",15,3.57,
                "Rock","Oochya!.jpg",2022,"ochya! es el duodécimo álbum de estudio del grupo\n" +
                " de rock galés Stereophonics, publicado el 4 de marzo de 2022 por Ignition Records. Está previsto que\n " +
                "sea apoyado por una gira de conciertos en 2022.\n"));
    }

    public MainLibrary() {
        super();
    }

    public void addSongs() {

        id = songs.size() + 1;

        System.out.println("Enter song title: ");
        this.title = sc.nextLine();
        System.out.println("Enter Artist: ");
        this.artist = sc.nextLine();
        System.out.println("Enter length of song: ");
        this.duration = Double.valueOf(sc.nextLine());
        System.out.println("Enter genre: ");
        this.genre = sc.nextLine();
        System.out.println("Enter song year: ");
        this.year = Integer.valueOf(sc.nextLine());
        System.out.println("Enter cover: ");
        this.cover = sc.nextLine();
        System.out.println("Enter song description: ");
        this.description = sc.nextLine();

        songs.add(new MainLibrary(artist,title,id,duration,genre,cover,year,description));
    }

    public void viewMusic() {
        songs.forEach((p) -> {
            System.out.println("Id: "+p.id +". " + " Song title: ------>"+ p.title +"\n"  + "Artist: " + p.artist+"\n"+
                    "Length of song: "+p.duration+"\n" + "Genre: "+p.genre+"\n"+"Year of th song: "+p.year+"\n"+
                    "Cover: "+ p.cover+"\n" + "Description: "+p.description+"\n");
            System.out.println("\n");
        });
    }
}
