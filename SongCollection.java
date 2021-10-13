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

public class SongCollection {
    private DoublyLinkedNode<Song> head; 
    private DoublyLinkedNode<Song> tail; 
    private boolean playDirectionForward;
    
//    public static void main(String[] args) {
//        SongCollection testSong = new SongCollection();
//        analysisMethodA(testSong);
//        analysisMethodB(testSong);
//        analysisMethodC(testSong);
//    }
    public SongCollection() {
        head = null;
        tail = null;
        playDirectionForward = true;
    }
    
    /**
     * // adds song to the end/tail of this doubly linked list 
     * @param song
     * @throws NullPointerException - when song is null
     */
    public void add(Song song) throws NullPointerException{
        if (song == null) {
            throw new NullPointerException("Song cannot be null.");
        }
        DoublyLinkedNode<Song> newSong= new DoublyLinkedNode<Song>(song);
        if(head == null) {
            head = newSong;
            tail = newSong;
        }
        else {
            tail.setNext(newSong);
            newSong.setPrevious(tail);
            tail = newSong;
        }        
    }
    /**
     * removes and returns song from the front/head of this list
     * @return - song from the front/head of this list
     * @throws NoSuchElementException - when list is empty
     */
    public Song remove() throws NoSuchElementException{
        if (head == null) {
            throw new NoSuchElementException("List is empty.");
        }
        DoublyLinkedNode<Song> songToRemove = head;
        DoublyLinkedNode<Song> updateHead = head.getNext();
        head = updateHead;
        return songToRemove.getData();        
    }
    /**
     * sets play direction
     * @param isForward boolean that tells if is forward
     */
    public void setPlayDirection (boolean isForward) {
        playDirectionForward = isForward;
    }
    
    public Iterator<Song> iterator(){
        if (playDirectionForward == true) {
            return new Playlist(head);
        }
        else {
            return new ReversePlaylist(tail);
        }
    }
/////////////////////////////////////////////////////////////////////////////////// 
// For each of the following big-O time complexity analyses, consider the problem 
// size to be the number of Songs that are stored within the argument songs, when 
// the method is first called.
//
//For analysisMethodA, the big-O time complexity is _____O(3)_______.
//
//For analysisMethodB, the big-O time complexity is _____O(n^2)___.
//
//For analysisMethodC, the big-O time complexity is ________O(n)____.
/////////////////////////////////////////////////////////////////////////////////////
//    public static void analysisMethodA(SongCollection songs) {
//        songs.add(new Song("C is for Cookie.", "Cookie Monster"));
//        songs.add(new Song("Rubber Duckie.", "Ernie"));
//        songs.add(new Song("Elmo's Song.", "Elmo"));
//    }
//
//    public static void analysisMethodB(SongCollection songs) {
//        SongCollection copy = new SongCollection();
//        for (Song song : songs)
//            copy.add(song);
//        for (Song song : copy)
//            System.out.println(song);
//    }
//
//    public static void analysisMethodC(SongCollection songs) {
//        Iterator<Song> playlist = songs.iterator();
//        for (int i = 0; i < 1000; i++)
//            if (playlist.hasNext())
//                System.out.println(playlist.next());
//    }
}
