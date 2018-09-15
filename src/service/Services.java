package service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class Services {
    private Services(){};//静态方法，禁止实例化

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "def";

    //Provider Register API
    public static void registerDefaultProvider(Provider provider){
        providers.put(DEFAULT_PROVIDER_NAME, provider);
    }
    public static void registerProvider(String name, Provider provider){
        providers.put(name, provider);
    }

    //Service access API
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name){
        Provider provider = providers.get(name);
        if(provider == null){
            throw new IllegalArgumentException("No provider registered with name ;"+name);
        }
        return provider.newServide();
    }
}
