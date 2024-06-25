package designpattern.builderdp.production;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batchName;
    private long id;
    private int gradYear;
    private String phoneNo;

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    private Student(StudentBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

    static class StudentBuilder {
        public String name;
        public int age;
        public double psp;
        public String univName;
        public String batchName;
        public long id;
        public int gradYear;
        public String phoneNo;

        public Student build() {
            // here all your validations will go.....
            if (this.gradYear > 2022) {
                System.out.println("Returning exception....");
                throw new IllegalArgumentException();
            }

            // call the constructor.
            return new Student(this);
        }


        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public StudentBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }
        public StudentBuilder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public StudentBuilder setId(long id) {
            this.id = id;
            return this;
        }
        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public StudentBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
    }
}
