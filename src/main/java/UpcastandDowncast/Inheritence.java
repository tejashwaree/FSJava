package UpcastandDowncast;

public class Inheritence {

    public static void main(String args[]) {
        //simple child class object
        Chrome c1 = new Chrome();

        // ** Upcast- coverting child to parent
        Browser b1 = new Chrome();
        //here b1 can access only parent class methods as it is converted to parent
        b1.openUrls();
        //b1.click();// compile error


        // ** Downcast - converting parent to child
        //Chrome c2 = new Browser(); // deafult downcast - complie error
        //Chrome c3 = (Chrome) new Browser();// specific downcast- it will not show compile error but it will through
        //runtime exception

        //Downcast is not allowed in java but in one scenario it can be allowed
        // where child class ti upcast to parent then that parent can be downcasted to that child
        //lets's try
        Browser b2 = new Chrome(); //upcast
        Chrome c4 = (Chrome) new Browser(); // downcast

        //upcasting happens in primitive data types
        // byte short int long
        //float double
        //char
        //boolean

        int a =10;
        byte b = (byte) a; // downcasting, risk of loosing some value

        int c =10;
        float d = c; // upcasting - converting int to float allowed
    }
}
