package linkedin_java;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    public static void main(String[] args) {
        int points=10;
        Scanner sc= new Scanner(System.in);
        System.out.println("Want to double or leave, enter yes or no");
        String chance=sc.nextLine();
        if(chance.equals("yes")){
            System.out.println("//random funct");
            Random random = new Random();
            boolean randomBool = random.nextBoolean();
            if(randomBool==true){
                points=points*2;
            }
            else{
                points=0;
            }

        }
            System.out.println("your points are "+points);
    }
}
