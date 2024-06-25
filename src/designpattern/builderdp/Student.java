package designpattern.builderdp;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batchName;
    private long id;
    private int gradYear;
    private String phoneNo;

    public Student(Helper h) {
        this.age = h.age;
        this.psp = h.psp;
        this.name = h.name;

        if (h.gradYear > 2022) {
            System.out.println("Returning exception....");
            throw new IllegalArgumentException();
        }
    }

}
