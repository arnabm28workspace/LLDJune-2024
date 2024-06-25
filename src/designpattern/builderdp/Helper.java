package designpattern.builderdp;

public class Helper {
    public String name;
    public int age;
    public double psp;
    public String univName;
    public String batchName;
    public long id;
    public int gradYear;
    public String phoneNo;

    public Helper() {
    }

    public Helper(String name, int age, double psp, String univName, String batchName, long id, int gradYear, String phoneNo) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.univName = univName;
        this.batchName = batchName;
        this.id = id;
        this.gradYear = gradYear;
        this.phoneNo = phoneNo;
    }
}
