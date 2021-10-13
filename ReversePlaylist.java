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

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversePlaylist implements  Iterator<Song> {
    DoublyLinkedNode<Song> curSong;
    
    public ReversePlaylist(DoublyLinkedNode<Song> tail) {
        curSong = tail;
    }
    
    public Song next() throws NoSuchElementException{
        if (curSong == null) {
            throw new NoSuchElementException("Song cannot be null");
        }
        Song songData = curSong.getData();
        curSong = curSong.getPrevious();
        return songData;
    }
    public boolean hasNext() {
        if(curSong == null) {
            return false;
        }
        else {
            return true;
        }
    }
}
