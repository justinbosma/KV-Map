package kvmap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 
 * @author Justin Bosma Username: jbosma0
 * @version 5/20/14
 * @param <K>
 * @param <V>
 */
public class EmptyMap<K, V> extends KVMap<K, V> {
    /**
     * Constructor for empty map
     */
    EmptyMap() {
        //nothing in here
    }

    /**
     * Is the map empty?
     * @return true if emptyMap
     */
    public boolean isEmpty() {
        return true;
    }
    /**
     * Creates new instance of Assign
     * @param k key to be stored of type k
     * @param v value to be stored  
     * @return new assign
     */
    public KVMap<K, V> assign(K k, V v) {
        return new Assign<K, V>(k, v, this);
    }
    /**
     * Number of elements in map
     * @return number of elements
     */
    public int size() {
        return 0;
    }
    /**
     * Does map contain key?
     * @param k key
     * @return true if map contains key
     */
    public boolean containsKey(K k) {
        return false;
    }
    /**
     * Does map contain value?
     * @param v value
     * @return true if map contains value
     */
    public boolean containsValue(V v) {
        return false;
    }
    /**
     * retrieve value from map
     * @param k key
     * @return value associated with key. If non existent throws exception
     */
    public V get(K k) throws RuntimeException {
        throw new RuntimeException("Key not in map");
    }
    /**
     * overridden equals method
     * @param o object
     * @return true if maps contain same elements
     */
    public boolean equals(Object o) {
        return (o instanceof EmptyMap || o instanceof EmptyNode);
    }
    /**
     * returns rest of KVMap
     * @return rest of KVMap if any
     */
    protected KVMap<K, V> getRest() {
        return this;
    }


    /**
     * overridden hashCode method
     * @return 1
     */
    public int hashCode() {
        return 1;
    }
    /**
     * helper function for iterator
     * makes arraylist of keys
     * @param a ArrayList
     * @return ArrayList
     */
    public ArrayList<K> doer(ArrayList<K> a) {
        return a;
    }
    /**
     * Creates new iterator over collection
     * @return new KVMapIterator
     */
    public Iterator<K> iterator() {
        return new KVMapIterator<K>(this.doer(new ArrayList<K>()));
    }
    /**
     * Creates new iterator over collection with comparator
     * @param c comparator
     * @return new KVMapIterator
     */
    public Iterator<K> iterator(Comparator<? super K> c) {
        return new KVMapIterator<K>(c, this.doer(new ArrayList<K>()));
    }
}
