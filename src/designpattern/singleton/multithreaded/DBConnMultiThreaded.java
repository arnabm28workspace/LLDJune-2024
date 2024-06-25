package designpattern.singleton.multithreaded;

import designpattern.singleton.DBConnection;

import java.io.Serializable;

public class DBConnMultiThreaded {
    private static DBConnMultiThreaded INSTANCE = null;
    private String url;
    private String username;
    private String pwd;

    private DBConnMultiThreaded() {
    }


    /**
     * Best way to create Singleon in Multithreaded env.
     * This included - Double check locking.
     *
     * @return
     */

    public static DBConnMultiThreaded createInstance() {
        // First time check.
        if (INSTANCE == null) {
            synchronized (DBConnMultiThreaded.class) {
                // This is the 2nd time you are checking.
                if (INSTANCE == null) {
                    return INSTANCE = new DBConnMultiThreaded();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * Also has some problems --- when you use advanced concepts.
     *
     * (1)This method will FAIL to create  a singleton - When you are doing SERIALIZATION
     * OR DESERIALIZATION...
     *
     *
     * Multiple Objects will still be created by your JVM.
     *
     * (2) There are some ways in java to create advanced users in java which can change the scope
     * of constructor in Runtime using Reflection conepts.
     *
     *
     *
     * BEST OG WAY --> To use ENUMS.
     *  WHY -- ENUMS is best way : SEARCH BY SELF.
     */
}
