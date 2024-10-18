package conditional;

public class switchcase {
    public static void main(String [] args){
        int age = 20;
        //getSwitchcase(age);
        getSwitch2("Male");
    }
    /* datatypes for switch case
    * float, double, long, boolean : not allowd
    * int, char, short, byte, String : allowed
    * if wlse block is used for some condition, or range
    * switch block used when specific values are there to check
    * */
    private static void getSwitch2(String male) {
        switch (male){
            case "Male" :
                System.out.println("Gender is male");
                break;

            case "Female":
                System.out.println("Gender is female");
                break;
                default :
                    System.out.println("Please provide correct input");
                    break;

            }
        }


    private static void getSwitchcase(int age) {
        switch(age){
            case 18: {
                System.out.println("You are an adult");
                break;
            }
            case 60: {
                System.out.println("You are a senior citizen");
                break;
            }
            default:{
                System.out.println("You are young");
            }
        }
    }
}

