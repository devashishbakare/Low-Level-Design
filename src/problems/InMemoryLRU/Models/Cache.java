package problems.InMemoryLRU.Models;
import java.util.*;
import problems.InMemoryLRU.Constant.EvictionPolicy;

public class Cache {

    private int size;
    private EvictionPolicy evictionPolicy;


    public Cache(int size, EvictionPolicy evictionPolicy) {
        this.size = size;
        this.evictionPolicy = evictionPolicy;

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
}

