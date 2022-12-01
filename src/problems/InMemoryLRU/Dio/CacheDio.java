package problems.InMemoryLRU.Dio;

import problems.InMemoryLRU.Constant.EvictionPolicy;
import problems.InMemoryLRU.Models.Cache;

import java.util.HashMap;
import java.util.LinkedList;

public class CacheDio {

    private LinkedList<Object> dataStore;
    private HashMap<Object, Object> cacheStore;
    public static CacheDio cacheInstance = null;

    private CacheDio(){
        dataStore = new LinkedList<>();
        cacheStore = new HashMap<>();
    }
    //In dio layer we write out actual logic for the functionality;

    public static CacheDio getDioInstace(){

        if(cacheInstance == null){
            cacheInstance = new CacheDio();
        }
        return cacheInstance;
    }

    private Cache cache = null;
    public Cache initialise(int size, EvictionPolicy evictionPolicy){
        cache = new Cache(size, evictionPolicy);
        return cache;
    }

    // put the date to cache
    public boolean insertData(Object key, Object value){

        if(dataStore.size() == cache.getSize()){
            System.out.println("cache is full, using LRU Eviction Policy");
            Object getKey = dataStore.getLast();
            dataStore.remove(getKey);
            cacheStore.remove(getKey);
            dataStore.addFirst(key);
            cacheStore.put(key, value);
            return true;
        }else{
            dataStore.addFirst(key);
            cacheStore.put(key, value);
        }

        return false;
    }

    // get data from the cache
    public Object getData(Object obj){

        if(cacheStore.containsKey(obj) == true) {
            return cacheStore.get(obj);
        }else{
            System.out.println("data you are trying to access, are not present.");
            return null;
        }

    }
    // delete date from the cache
    public boolean deleteData(Object obj) {

        if(cacheStore.containsKey(obj) == true){
            dataStore.remove(obj);
            cacheStore.remove(obj);
            System.out.println("object has been deleted successfully");
            return true;
        }else{
            System.out.println("Object not present in cache");
            return false;
        }


    }
    // clear the data into cache
    public boolean clearData(){

        dataStore.clear();
        cacheStore.clear();
        System.out.println("cache has been clear successfully");

        return true;
    }

    public int getSize(){
        return cacheStore.size();
    }


}
