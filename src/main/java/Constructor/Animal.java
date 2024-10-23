package Constructor;

public class Animal {
    public String name;
    public int id;


    //simple constructor
//    public Animal(){
//        System.out.println("I am animal");
//    }

//constructor with parameters
    public Animal(String name, int id){
        //assigning value to class instance variable from constructor parameter
//        name = name; //here left side is instance var and right side is constructor var, both are same thats why it is considered as same instance var and will give null as value
//        //here left side is instance var and right side is constructor var, both are same thats why it is considered as same instance var and will give 0 as value
//        id = id;

        //to avoid this we can use constructor var as different var name
//        name= animalName;
//        id = ids;


        //if you dont want to use other var , want to use same var name as instance var the we have to use "this" keyword
        this.name = name;
        this.id = id;
    }


    public void getDetails(){
        System.out.println("Name is "+name+ " and id is "+id);
    }
}
