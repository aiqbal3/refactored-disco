// Title:           Study Playlist
// Files:           Song, DoublyLinkedNode, SongCollection, Playlist, 
//                  ReversePlaylist

//
// Author:          Adeel Iqbal
// Email:           aiqbal3@wisc.edu

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
