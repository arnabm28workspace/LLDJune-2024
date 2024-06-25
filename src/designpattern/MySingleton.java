package designpattern;

public enum MySingleton {
    INSTANCE;

    private MySingleton() {

    }

    public void printHello(){
        System.out.println(
                "hello!!"
        );
    }
}
