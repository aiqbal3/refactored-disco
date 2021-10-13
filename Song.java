// Title:           Study Playlist
// Files:           Song, DoublyLinkedNode, SongCollection, Playlist, 
//                  ReversePlaylist

//
// Author:          Adeel Iqbal
// Email:           aiqbal3@wisc.edu

public class Song {
    String title;
    String artist;
    /**
     * Initializes a new song with the specified information.
     * @param title - or name of this new song
     * @param artist - or musician who performs this song
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    /**
     * Returns a string representation of this song. This string should be 
     * formatted as follows: "TITLE by ARTIST", where this song's title and 
     * artist are used in place of the TITLE and ARTIST place holders.
     * @Override - overrides toString in class Object
     * @return - string representation of song
     */
    public String toString() {       
        return title.toUpperCase() + " by " + artist.toUpperCase();
    }
    
    /**
     * Returns true when this song's title and artist strings contain the same 
     * contents as the other song's title and artist strings, and false 
     * otherwise. Note that this method takes an Object rather than a Song 
     * argument, so that it Overrides Object.equals(Object). If an object that 
     * is not an instance of Song is ever passed to this method, it should 
     * return false.
     * @Override - equals in class java.lang.Object
     * @param other - Song object to compare this object to
     * @return - true when the two songs have matching title and artist
     */
    public boolean equals(Object other) {
        String song = other.toString();
        if (song.equals(this.toString())) {
            return true;
        }
        return false;
    }

}
