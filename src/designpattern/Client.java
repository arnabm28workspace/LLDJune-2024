package designpattern;

import designpattern.singleton.DBConnection;

public class Client {
    public static void main(String[] args) {
        DBConnection db = DBConnection.createInstance();
        DBConnection db_2 = DBConnection.createInstance();

        System.out.println(db);
        System.out.println(db_2);
    }
}
