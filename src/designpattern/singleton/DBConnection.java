package designpattern.singleton;

public class DBConnection {
    private static DBConnection INSTANCE = null;
    private String url;
    private String username;
    private String pwd;

    private DBConnection() {
    }

    public static DBConnection createInstance() {
        if (INSTANCE == null) {
            return INSTANCE = new DBConnection();
        }
        return INSTANCE;
    }


}
