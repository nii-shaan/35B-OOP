package OOPs;

public class ConstructorRevise {
    public static void main(String[] args) {

        // NonParameterizedConstructor np = new NonParameterizedConstructor();
        // System.out.println(np.data2);

        // ParameterizedConstructor pc = new ParameterizedConstructor(10, "Ram2");
        // System.out.println(pc.data2);
        // pc.data2 = "Is changeable";
        // pc.setData1(100);
        // System.out.println(pc.getData1());

        Song songOne = new Song("Song One", 2.5);
        songOne.setId(101);
        songOne.setArtist("ArtistOne");
        songOne.setDuration(4.2);
        songOne.album = "Song One Album";
        songOne.description = "Culpa anim nulla voluptate eiusmod nostrud proident qui voluptate consequat est. Consequat duis voluptate adipisicing Lorem pariatur do cillum fugiat dolor tempor cupidatat aliquip eiusmod. Sunt ex est eiusmod elit esse sint tempor.";

        System.out.println(songOne.getTitle());
        System.out.println("Title: " + songOne.getTitle());
        System.out.println("Duration: " + songOne.getDuration());
        System.out.println("Artists: " + songOne.getArtists());
        System.out.println("Album: " + songOne.album);
        System.out.println("Description: " + songOne.description);

        Song songTwo = new Song("Song Two", 3.0);
        songTwo.setId(102);
        songTwo.setArtist("Artist Two");
        songTwo.setArtist("New Artist Two");
        songTwo.album = "Song One Album";
        songTwo.description = "Elit amet tempor sint non esse quis tempor ut. In anim sint anim ex commodo in qui nulla laboris ex commodo deserunt consectetur elit. Et aliqua fugiat nostrud proident irure do duis nostrud Lorem consectetur minim ipsum ex. Deserunt in do nulla sint commodo laborum dolore commodo cupidatat deserunt qui esse  ";

        System.out.println(songTwo.getTitle());
        System.out.println("Title: " + songTwo.getTitle());
        System.out.println("Duration: " + songTwo.getDuration());
        System.out.println("Artists: " + songTwo.getArtists());
        System.out.println("Album: " + songTwo.album);
        System.out.println("Description: " + songTwo.description);

    }

}

class NonParameterizedConstructor {
    private int data1;
    String data2;

    NonParameterizedConstructor() {
        this.data1 = 10;
        data2 = "Ram";
        System.out.println("Running in obwject creation");
    }
}

class ParameterizedConstructor {
    private int data1;
    String data2;

    public void setData1(int data) {
        this.data1 = data;

    }

    public int getData1() {
        return this.data1;
    }

    ParameterizedConstructor(int data1, String data2) {

        this.data1 = data1;
        this.data2 = data2;

    }

}

/*
 * Task
 * make a class Song
 * make 4 private property id, title, duration and artists
 * make 2 public property album and descrption
 * maek constructor to set title and duration only
 * make setter for id, duration and artist
 * make 2 object of song
 * fill all the attributes
 * change the duration of 1st object
 * change the artists of 2nd object
 * print the followinng for both object
 * 
 * Output
 * Song
 * Title
 * Duration
 * Artists
 * Album
 * Desciription
 * Song 2
 */

class Song {
    private int id;
    private String title;
    private double duration;
    private String artists;
    public String album;
    public String description;

    Song(String title, double duration) {
        this.title = title;
        this.duration = duration;

    }

    public void setId(int id) {
        this.id = id;

    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setArtist(String artists) {
        this.artists = artists;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getArtists() {
        return this.artists;
    }

}