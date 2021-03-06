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
                "Turn blue.jpg", 2014, "Turn Blue es el octavo ??lbum de estudio de la banda \n" +
                "estadounidense de rock The Black Keys. Coproducido por Danger Mouse junto con la banda, fue lanzado el\n" +
                " 12 de mayo de 2014 por Nonesuch Records. Danger Mouse contribuy?? como coautor en cada una de las once\n " +
                "canciones.\n"));
        songs.add(new MainLibrary("The black keys", "Lonely Boy", 2, 3.13, "Blues Rock",
                "El camino.jpg", 2011, "El Camino es el s??ptimo ??lbum de estudio de la banda\n " +
                "estadounidense de rock The Black Keys. Fue coproducido por Danger Mouse y la banda, y fue lanzado el\n " +
                "6 de diciembre de 2011, a trav??s de Nonesuch Records. El ??lbum est?? influido por g??neros populares en\n " +
                "las d??cadas de 1950 y 1970, como el rock and roll, el glam rock, el rockabilly, el surf rock y el soul.\n" +
                "Danger Mouse contribuy?? como coautor en cada una de las once canciones.\n"));
        songs.add(new MainLibrary("Natalia LaFourcade","Hasta la Raiz",3,3.41,"Pop",
                "Hasta la Raiz.jpg",2015,"Hasta la ra??z es el sexto ??lbum de estudio de la cantante\n" +
                "mexicana Natalia Lafourcade. Sony Music Latin lo lanz?? al mercado el 17 de marzo de 2015. Despu??s del\n " +
                "??xito de su anterior ??lbum, Mujer divina, un homenaje al cantante y compositor mexicano Agust??n Lara,\n" +
                " Lafourcade decidi?? grabar un disco con composiciones originales; luego de pasar tres a??os escribi??ndolas\n " +
                "y andar en busca de inspiraci??n en diferentes ciudades, obtuvo como resultado canciones que expresan\n" +
                "sentimientos muy personales con respecto al amor. Natalia produjo el ??lbum, con la ayuda del m??sico\n" +
                "argentino Cachorro L??pez y el artista mexicano Leonel Garc??a.\n"));
        songs.add(new MainLibrary("A perfect Circle","Mer de Noms",4,4.07,"Rock",
                "Mer de noms",2000,"Mer de Noms (Franc??s \"mar de nombres\") es el primer ??lbum de\n" +
                " estudio de la banda de rock alternativo A Perfect Circle; este sali?? en versi??n disco compacto el 23\n " +
                "de mayo de 2000, posteriormente se imprimi?? una versi??n de colecci??n en vinil. El t??tulo significa\n" +
                "???Mar de Nombres??? en franc??s. Fue certificado como platino por la RIAA el 31 de octubre de 2000.\n" +
                "Entr?? en la Billboard 200 en la posici??n N?? 4 con 188 000 copias vendidas solo en Estados Unidos en\n" +
                "la primera semana desde el lanzamiento. El primer sencillo que se desprendi?? de este disco\n " +
                "fue \"Judith\", seguido por \"3 Libras\"\n"));
        songs.add(new MainLibrary("Audioslave","Like a Stone",5,4.53,"Rock",
                "Audiolave (2002).jpg",2002,"Audioslave es el t??tulo del ??lbum debut de estudio\n" +
                "hom??nimo grabado por el supergrupo estadounidense de rock alternativo Audioslave, Fue lanzado al\n" +
                "mercado por las empresas discogr??ficas Epic Records e Interscope Records el 18 de noviembre de 2002 en\n" +
                " el Reino Unido y un d??a despu??s en los Estados Unidos. La m??sica desplegada en la grabaci??n\n" +
                "guarda un parecido caracter??stico con la de Rage Against the Machine (grupo en el que estaban tres de\n " +
                "los cuatro miembros de Audioslave), mezclado con la caracter??stica voz de Chris Cornell, exvocalista\n" +
                "de Soundgarden.\n"));
        songs.add(new MainLibrary("Counting Crows","Mr. Jones",6,4.33,"Alternative Rock",
                "Films About Ghost.jpg",2003,"Films About Ghosts (The Best of...) es un ??lbum\n" +
                "recopilatorio de la banda estadounidense derock Counting Crows . Fue lanzado por Geffen Records el 2 de\n" +
                " noviembre de 2003. El ??lbum contiene canciones de todos sus ??lbumes de estudio. El ??lbum toma su\n" +
                " nombre de una l??nea de la Canci??n de cuna de la Sra. Potter : \" Si los sue??os son como pel??culas,\n" +
                " entonces los recuerdos son pel??culas sobre fantasmas \"\n"));
        songs.add(new MainLibrary("Fito Paez","Cadaver Exquisito",7,5.37,"Rock en espa??ol",
                "Euforia",1996,"Euforia es el primer disco grabado en vivo por el m??sico Fito P??ez.\n" +
                " Data del a??o 1996. Al contrario de todos los m??sicos argentinos que hasta all?? hab??an grabado sus trabajos\n " +
                "ac??sticos para la cadena MTV, Fito P??ez lo realiz?? en forma independiente en los estudios de televisi??n argentina Telefe.\n" +
                "Cuenta con canciones que fueron ??xitos del autor y tres temas in??ditos (??Dar es dar??, ??Cad??ver exquisito??\n " +
                "y ??Tus regalos deber??an de llegar??) adaptados todos a un estilo ??nico.\n"));
        songs.add(new MainLibrary("Jack White","Lazzaretto",8,3.38,"Alternative Rock",
                "Lazaretto.jpg",2014,"Lazaretto es el segundo ??lbum de estudio de Jack White.\n" +
                " Fue lanzado el 10 de junio de 2014, por Third Man Records en colaboraci??n con XL Recordings y Columbia\n" +
                " Records. Lazaretto, seg??n coment?? White a un medio especializado en m??sica, Lazaretto est?? inspirado\n" +
                " en una colecci??n de relatos, poemas y canciones que escribi?? cuando ten??a 19 a??os y encontr?? a??os\n " +
                "despu??s en su casa, decidi?? trabajar sobre ellos y el resultado fue este ??lbum.\n"));
        songs.add(new MainLibrary("Kings of Leon","Sex on Fire",9,3.26,"Rock",
                "Only by the night",2008,"Only by the Night es el cuarto ??lbum de estudio del grupo\n " +
                "de rock alternativo estadounidense Kings of Leon, sacado a la venta mundialmente durante el mes de septiembre\n" +
                " de 2008. El ??lbum, nominado al Grammy fue comenzado por el grupo pocos d??as despu??s de sacar su\n" +
                "anterior ??lbum, Because of the Times. Fue grabado por los productores Angelo Petraglia y Jacquire King\n" +
                " durante febrero de 2008 en los Blackbird Studios de Nashville. Hasta la fecha el ??lbum ha vendido m??s\n" +
                " de 6 millones de copias, el cual ha sido certificado con el Disco de Platino en los Estados Unidos.\n"));
        songs.add(new MainLibrary("Metallica","Astronomy",10,6.38,"Hard Rock",
                "Garage Inc.jpg",1998,"Garage Inc. es un ??lbum de versiones del grupo estadounidense\n" +
                " Metallica, realizado en homenaje a las bandas que marcaron sus ra??ces, publicado el 24 de noviembre\n" +
                " de 1998. Est?? ??ntegramente conformado por versiones, incluyendo todas aquellas que Metallica hab??a\n " +
                "grabado hasta esa fecha.\n"));
        songs.add(new MainLibrary("Oasis","Stand by me",11,5.56,"Indie Rock",
                "Be here now.jpg",1997,"Be Here Now es el tercer ??lbum de estudio de la banda\n " +
                "inglesa Oasis, lanzado en agosto de 1997. El disco tuvo una alta anticipaci??n por los cr??ticos de\n" +
                " m??sica y los seguidores despu??s del ??xito mundial de la banda con su debut de 1994 Definitely Maybe y\n" +
                " su ??lbum posterior de 1995 (What's the Story) Morning Glory?. Su pre-lanzamiento lo llev?? a una\n" +
                "considerable promoci??n y publicidad en la prensa musical y popular. En ese punto, Oasis estaba en el\n " +
                "tope de su fama, y Be Here Now se convirti?? en el ??lbum vendido m??s r??pidamente en la historia musical\n " +
                "de Reino Unido, donde se vendieron m??s de 520,000 copias en su primer d??a de lanzamiento, y m??s de\n " +
                "tres millones en las tres siguientes semanas. A la fecha, el ??lbum ha vendido alrededor de 18 millones\n " +
                "de copias en todo el mundo.\n"));
        songs.add(new MainLibrary("Sublime","Take it or leave it",12,3.52,"Pop/Rock",
                "Yours Truly - Sublime with Rome.jpg",2011,"Yours Truly es el ??lbum debut del grupo\n" +
                "de rock Sublime con Rome, que fue lanzado el 12 de julio de 2011. Es el primer ??lbum desde que el\n " +
                "Sublime original se disolvi?? en 1996, debido a la muerte del vocalista y guitarrista Bradley Nowell.\n " +
                "Seg??n las notas de presentaci??n, el ??lbum est?? dedicado a ??l. Tras la ruptura, sus miembros\n " +
                "supervivientes Eric Wilson y Bud Gaugh reformaron Sublime en 2009 casi por accidente, con Rome Ramirez\n " +
                "sustituyendo a Nowell. Sin embargo, el grupo no pudo utilizar el nombre Sublime por motivos legales,\n " +
                "lo que dio lugar al nacimiento de Sublime with Rome. Tras embarcarse en su primera gira por Estados\n " +
                "Unidos en 2010, Sublime with Rome firm?? con el sello discogr??fico Fueled by Ramen y se puso a trabajar\n" +
                " en su primer ??lbum de estudio de larga duraci??n. El guitarrista Paul Leary de Butthole Surfers, que\n" +
                " coprodujo el ??ltimo ??lbum hom??nimo de Sublime, lo produjo.\n"));
        songs.add(new MainLibrary("The Strokes","The adults ara talking",13,5.09, "Indie Rock",
                "The New Abnormal.jpg",2019,"The New Abnormal ???en espa??ol: La nueva anormalidad ???\n " +
                "es el sexto ??lbum de estudio de la banda de garage rock estadounidense The Strokes. Fue lanzado el 10 de\n" +
                " abril de 2020 en todas las plataformas y pa??ses. Este ??lbum sali?? a la venta tras siete a??os sin un\n" +
                " ??lbum de estudio, ya que \"Future Present Past\" es un EP publicado en 2016\n"));
        songs.add(new MainLibrary("Twenty One Pilots","Shy away",14,2.55,"Indie Rock",
                "Scaled and Icy.jpg",2021,"Scaled And Icy es el sexto ??lbum de larga duraci??n y\n" +
                " cuarto ??lbum de estudio del d??o estadounidense Twenty One Pilots publicado el 21 de mayo de 2021 a\n " +
                "trav??s de Fueled by Ramen y Elektra. El t??tulo del ??lbum es un anagrama de ??Clancy is Dead??, una\n " +
                "referencia a un personaje de su anterior ??lbum, Trench. El 19 de noviembre de 2021 se lanz?? una versi??n\n" +
                " livestream del ??lbum para celebrar su medio aniversario.\n"));
        songs.add(new MainLibrary(" Stereophonics","Do Ya Feel My Love?",15,3.57,
                "Rock","Oochya!.jpg",2022,"ochya! es el duod??cimo ??lbum de estudio del grupo\n" +
                " de rock gal??s Stereophonics, publicado el 4 de marzo de 2022 por Ignition Records. Est?? previsto que\n " +
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
