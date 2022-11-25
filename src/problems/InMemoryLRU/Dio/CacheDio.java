package problems.InMemoryLRU.Dio;

import problems.InMemoryLRU.Constant.EvictionPolicy;
import problems.InMemoryLRU.Models.Cache;

public class CacheDio {

    public static CacheDio cacheInstance = null;

    private CacheDio(){

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

        if(cache.getDataStore().size() == cache.getSize()){
            System.out.println("cache is full, using LRU Eviction Policy");
            Object getKey = cache.getDataStore().getLast();
            cache.getDataStore().remove(getKey);
            cache.getCacheStore().remove(getKey);
            cache.getDataStore().addFirst(key);
            cache.getCacheStore().put(key, value);
            return true;
        }else{
            cache.getDataStore().addFirst(key);
            cache.getCacheStore().put(key, value);
        }

        return false;
    }

    // get data from the cache
    public Object getData(Object obj){

        if(cache.getCacheStore().containsKey(obj) == true) {
            return cache.getCacheStore().get(obj);
        }else{
            System.out.println("data you are trying to access, are not present.");
            return null;
        }

    }
    // delete date from the cache
    public boolean deleteData(Object obj) {

        if(cache.getCacheStore().containsKey(obj) == true){
            cache.getDataStore().remove(obj);
            cache.getCacheStore().remove(obj);
            System.out.println("object has been deleted successfully");
            return true;
        }else{
            System.out.println("Object not present in cache");
            return false;
        }


    }
    // clear the data into cache
    public boolean clearData(){

        cache.getDataStore().clear();
        cache.getCacheStore().clear();
        System.out.println("cache has been clear successfully");

        return true;
    }



}
