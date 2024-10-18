package methods;

public class RunClass {
    public static void main(String args[]){
        School sc = new School();
        sc.name = "Bal mandir";
        sc.address = "Nagpur";
        sc.principal = "Dr. Shah";
        sc.studentCount = 300;
        sc.teacherCount = 30;
        System.out.println("Name of school is "+sc.name);
        System.out.println("Address of school is "+ sc.address);
        System.out.println("Name of principal is "+ sc.principal);
        System.out.println("Total students are "+ sc.studentCount);
        System.out.println("Total teachers are "+ sc.teacherCount);
        sc.dispalyResult();

        Student s1 = new Student();
        s1.name ="Rahul";
        s1.age =15;
        s1.play("Cricket");
        s1.eat("Paratha");
        s1.talk("English");

        Student s2 = new Student();
        s2.name ="Rishi";
        s2.age =13;
        s2.play("Football");
        s2.eat("Samosa");
        s2.talk("Hindi");

        Teacher t1 =new Teacher();
        t1.name ="Saumya";
        t1.subject = "Maths";
        t1.teach();

        ClassRoom c1 =new ClassRoom();
        c1.seatCount =30;
        c1.floorNo =3;
        c1.clean();

    }

}
