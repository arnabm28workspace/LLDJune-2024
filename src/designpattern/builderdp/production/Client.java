package designpattern.builderdp.production;

public class Client {
    public static void main(String[] args) {
        //CASE1.
//        Helper h = new Helper();
//        h.gradYear = 2018;
//        h.name = "yash";
//
//
//        Student s = new Student(h);
//
//        System.out.println(s);
//
//        //CASE2.
//        Helper h2 = new Helper();
//        h2.gradYear = 2023;
//        h2.name = "yash";
//        Student s2 = new Student(h2);
//        System.out.println(s2);


        Student s = Student.getBuilder()
                .setAge(19)
                .setName("Yash")
                .setGradYear(2020)
                .setPhoneNo("329u32932")
                .build();
        System.out.println("Student :  "+s);
    }
}
