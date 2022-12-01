package problems.InMemoryLRU.Driver;

import problems.InMemoryLRU.Constant.EvictionPolicy;
import problems.InMemoryLRU.Models.Cache;
import problems.InMemoryLRU.Service.CacheService;

public class Driver {

    public static void main(String args[]){

        CacheService cacheService = CacheService.getCacheServiceInstance();
        Cache cache = cacheService.initialize(5, EvictionPolicy.LRU);
        System.out.println("object of the cache "+cache);

        //inserting data in cache
        cacheService.insetData("deva", "bakare");
        cacheService.insetData("pratik", "bakare");
        cacheService.insetData("kailas", "bakare");
        cacheService.insetData("tanuja", "bakare");
        cacheService.insetData("Indubai", "bakare");

        //adding extra than size, deleting deva bakare
        cacheService.insetData("Shriram", "bakare");
        System.out.println(cacheService.size());

        //deleting data from cache
        cacheService.deleteData("Shriram");
        System.out.println(cacheService.size());

        //getting data from Cache
        System.out.println(cacheService.getData("kailas"));

        //accessing deleted data from cache
        System.out.println(cacheService.getData("deva"));

        cacheService.clearData();
        System.out.println(cacheService.size());

        //output
        /*
            object of the cache problems.InMemoryLRU.Models.Cache@6fadae5d
            cache is full, using LRU Eviction Policy
            5
            object has been deleted successfully
            4
            bakare
            data you are trying to access, are not present.
            null
            cache has been clear successfully
0
        * */
    }

}
