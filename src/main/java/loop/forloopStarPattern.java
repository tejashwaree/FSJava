package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class forloopStarPattern {
    public static void main(String args[]){
    /*    for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        System.out.println("Enter any number between 1-9");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        getdiamondshape(x);
    }

    private static void getdiamondshape(int x) {
        String s = "";
        List<String> st = new ArrayList<String>();
        for(int i=0;i<x;i++){
            for(int j=0;j<x-1-i;j++){
                //System.out.print(" ");
                s = s+" ";
            }
            for(int k=0;k<=i;k++){
                //System.out.print("* ");
                s = s+ "* ";
            }
            //System.out.println();
            st.add(s);
            s = "";
        }
        int l = st.size();
        for(String g: st){
            System.out.println(g);
        }
        for(int j =l-2; j>=0;j--){
            System.out.println(st.get(j));
        }

    }
}
