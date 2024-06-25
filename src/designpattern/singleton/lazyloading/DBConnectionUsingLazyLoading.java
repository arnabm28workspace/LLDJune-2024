package designpattern.singleton.lazyloading;

/**
 * Lazy Loading way of creating singleton
 */
public class DBConnectionUsingLazyLoading {
    private static DBConnectionUsingLazyLoading INSTANCE = new DBConnectionUsingLazyLoading();
    private String url;
    private String username;
    private String pwd;

    private DBConnectionUsingLazyLoading() {
    }

    public static DBConnectionUsingLazyLoading createInstance() {
        return INSTANCE;
    }


}
