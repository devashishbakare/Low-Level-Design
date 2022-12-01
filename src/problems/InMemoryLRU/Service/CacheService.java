package problems.InMemoryLRU.Service;

import problems.InMemoryLRU.Constant.EvictionPolicy;
import problems.InMemoryLRU.Dio.CacheDio;
import problems.InMemoryLRU.Models.Cache;

import javax.sql.rowset.CachedRowSet;

public class CacheService {


    private static CacheService cacheServiceInstance = null;

    private CacheService(){

    }

    public static CacheService getCacheServiceInstance(){

        if(cacheServiceInstance == null){
            cacheServiceInstance = new CacheService();
        }
        return cacheServiceInstance;

    }

    CacheDio cacheDio =  CacheDio.getDioInstace();

    public Cache initialize(int size, EvictionPolicy evictionPolicy){
        return cacheDio.initialise(size, evictionPolicy);
    }

    public boolean insetData(Object key, Object value){
        return cacheDio.insertData(key, value);
    }

    public Object getData(Object key){
        return cacheDio.getData(key);
    }

    public boolean deleteData(Object key){
        return cacheDio.deleteData(key);
    }

    public boolean clearData(){
        return cacheDio.clearData();
    }

    public int size(){
        return cacheDio.getSize();
    }

}
