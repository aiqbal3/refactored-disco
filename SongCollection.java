// Title:           Study Playlist
// Files:           Song, DoublyLinkedNode, SongCollection, Playlist, 
//                  ReversePlaylist

//
// Author:          Adeel Iqbal
// Email:           aiqbal3@wisc.edu

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
