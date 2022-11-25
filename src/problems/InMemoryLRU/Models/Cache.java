package problems.InMemoryLRU.Models;
import java.util.*;
import problems.InMemoryLRU.Constant.EvictionPolicy;

public class Cache {

    private int size;
    private EvictionPolicy evictionPolicy;
    private LinkedList<Object> dataStore;
    private HashMap<Object, Object> cacheStore;

    public Cache(int size, EvictionPolicy evictionPolicy){
        this.size = size;
        this.evictionPolicy = evictionPolicy;
        dataStore = new LinkedList<>();
        cacheStore = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public EvictionPolicy getEvictionPolicy() {
        return evictionPolicy;
    }

    public void setEvictionPolicy(EvictionPolicy evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
    }

    public LinkedList<Object> getDataStore() {
        return dataStore;
    }

    public void setDataStore(LinkedList<Object> dataStore) {
        this.dataStore = dataStore;
    }

    public HashMap<Object, Object> getCacheStore() {
        return cacheStore;
    }

    public void setCacheStore(HashMap<Object, Object> cacheStore) {
        this.cacheStore = cacheStore;
    }
}
