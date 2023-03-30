public class Song {
    String title;
    String artist;
    String length;
    String composer;

    public Song(String title, String artist,String length, String composer){
        this.title = title;
        this.artist = artist;
        this.length= length;
        this.composer = composer;
    }
    public Boolean artistComposer(){
        if(artist == composer){
            return true;
        }
        else{
            return false;
        }
    }

    Song  peaceofmusic = new Song("halo", "beyonce", "261 second", "Ryan Tedder");

    public static  void swap(){
        
    }
    
}
