package exercises;

class Entry {
    Object key;
    Object value;
    Entry next;
    Entry(Object key, Object value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

public class Hashtable {
    private static final int SIZE = 1024;
    private Entry[] table = new Entry[SIZE];

    public void insert(Object key, Object value) {
        if (key == null) {
            throw new IllegalArgumentException("null key not permitted");
        }
        int hc = key.hashCode();
        int index = hc % SIZE;
        // now insert a new Entry object into
        // the "table" array
        Entry e = new Entry(key, value, null);
        // best way: handle two cases separately
        if (table[index] == null) {
            // have not inserted anything yet
            // at that index!
            // all we need to do:
            // create a chain with a single Entry
            // object containing our key and value.
            table[index] = e;
        }
        else if (table[index] != null)
        {
            Entry current = null;
            while(current.next != null){
                current = current.next;
            }
            Entry last = current;
            last.next = new Entry(key,value,null);

        }

    }

    public Object lookup(Object key) {
        return null;
    }
}
