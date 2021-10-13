//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           P07 Study Playlist
// Files:           Song, DoublyLinkedNode, SongCollection, Playlist, 
//                  ReversePlaylist
// Course:          300, Fall, 2019
//
// Author:          Adeel Iqbal
// Email:           aiqbal3@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    (name of your pair programming partner)
// Partner Email:   (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   ___ Write-up states that pair programming is allowed for this assignment.
//   ___ We have both read and understand the course Pair Programming Policy.
//   ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates, 
// strangers, and others do.  If you received no outside help from either type
//  of source, then please explicitly indicate NONE.
//
// Persons:         NONE
// Online Sources:  NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

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
