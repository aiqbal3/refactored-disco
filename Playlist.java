//
// Title:           Study Playlist
// Files:           Song, DoublyLinkedNode, SongCollection, Playlist, 
//                  ReversePlaylist

//
// Author:          Adeel Iqbal
// Email:           aiqbal3@wisc.edu

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Playlist implements Iterator<Song> {
    DoublyLinkedNode<Song> curSong;
    
    public Playlist(DoublyLinkedNode<Song> head) {
        curSong = head;
    }
    
    
    public Song next() throws NoSuchElementException{
        if (curSong == null) {
            throw new NoSuchElementException("There is no song.");
        }
        Song curSongData = curSong.getData();
        curSong = curSong.getNext();
        return curSongData;
    }
    
    public boolean hasNext() {
        if (curSong == null) {
            return false;
        }
        else {
            return true;
        }
    }
}
