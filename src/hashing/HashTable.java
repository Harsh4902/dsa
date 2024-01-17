package hashing;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private int currentSize,maxSize;
    List<String> key;
    List<String> value;

    public HashTable(int capacity){
        currentSize = 0;
        maxSize = capacity;
        key = new ArrayList<>(maxSize);
        value = new ArrayList<>(maxSize);
    }

    public int getSize(){return currentSize;}

    private int hash(String key)
    {
        return key.hashCode() % maxSize;
    }

    public void insert(String key, String val)
    {
        int tmp = hash(key);
        int i = tmp;

        do {
            if (this.key.get(i) == null) {
                this.key.set(i,key);
                this.value.set(i,val);
                currentSize++;
                return;
            }

            if (this.key.get(i).equals(key)) {
                this.value.set(i,val);
                return;
            }

            i = (i + 1) % maxSize;

        }
        while (i != tmp);
    }

    public void remove(String key)
    {
        if (!this.key.contains(key))
            return;

        // Find position key and delete
        int i = hash(key);
        while (!key.equals(this.key.get(i)))
            i = (i + 1) % maxSize;
        this.key.set(i,null);
        this.value.set(i,null);

        // rehash all keys
        for (i = (i + 1) % maxSize; this.key.get(i) != null;
             i = (i + 1) % maxSize) {
            String tmp1 = this.key.get(i), tmp2 = this.value.get(i);
            this.key.set(i,null);
            this.value.set(i,null);
            currentSize--;
            insert(tmp1, tmp2);
        }
        currentSize--;
    }

    public void printHashTable()
    {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
            if (this.key.get(i) != null)
                System.out.println(this.key.get(i) + " " + this.value.get(i));
        System.out.println();
    }

}
