//
// Title:           Study Playlist
// Files:           Song, DoublyLinkedNode, SongCollection, Playlist, 
//                  ReversePlaylist
//
// Author:          Adeel Iqbal
// Email:           aiqbal3@wisc.edu

public class DoublyLinkedNode<T> {
    private DoublyLinkedNode<T> pNode;
    private DoublyLinkedNode<T> newNode;
    private T nodeData;
    /**
     * Initialize a new node with the specified data, and null next and previous 
     * reference.
     * @param data - to be stored within this node
     * @throws IllegalArgumentException - when data is a null reference
     */
    public DoublyLinkedNode(T data) throws IllegalArgumentException{
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }
        nodeData = data;
        pNode = null;
        newNode = null; 
    }
    /**
     * Initializes a new node with the specified information.
     * @param previous - node, which comes before this node in a doubly linked 
     * list
     * @param data - to be stored within this node
     * @param next - node, which comes after this node in a doubly linked list
     * @throws IllegalArgumentException - when data is a null reference
     */
    public DoublyLinkedNode(DoublyLinkedNode<T> previous, T data, 
        DoublyLinkedNode<T> next) throws IllegalArgumentException{
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }
        nodeData = data;
        pNode = previous;
        newNode = next;      
    }
    
    /**
     * Accessor method for this node's data.
     * @return - the data stored within this node
     */
    public T getData() {
        return nodeData;       
    }
    /**
     * Accessor method for this node's next node reference.
     * @return - reference to the node that comes after this one in the list, or 
     * null when this is the last node in that list
     */
    public DoublyLinkedNode<T> getNext(){
        return newNode;       
    }
    
    /**
     * Mutator method for this node's next node reference.
     * @param next - node, which comes after this node in a doubly linked list
     */
    public void setNext(DoublyLinkedNode<T> next) {
        newNode = next;
    }
    
    /**
     * Accessor method for this node's previous node reference.
     * @return reference - to the node that comes before this one in the list or 
     * null when this is the first node in that list
     */
    public DoublyLinkedNode<T> getPrevious() {
        return pNode;      
    }
    /**
     * Mutator method for this node's previous node reference.
     * @param previous - node, which comes before this node in a doubly linked 
     * list
     */
    public void setPrevious(DoublyLinkedNode<T> previous) {
        pNode = previous;
    }
}
