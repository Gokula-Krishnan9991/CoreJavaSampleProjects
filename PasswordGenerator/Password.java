package PasswordGenerator;

import java.util.Scanner;
class PasswordGen {

    public static String passwordGenerator(String[] arr, int length) {
        for(int i=0;i<arr.length;i++){
            String passcode="";
            for(int j=0;j<length;j++){
                passcode=passcode+randomGenerator();
            }
            arr[i]= passcode;
        }
        if(length<=4)
            return "weak";
        else if(length<=8)
            return "Medium password";
        else
            return "strong password";
    }


    public static char randomGenerator() {

        // Generating the random number and typecast to the integer

        // here we include alphabets(both Lower and upper) ,numbers and special characters

        // Alphabet range for Lower/Upper-->65-90/97-122
        // Range for numbers -->48-57
        //Range for special characters -->(32-47/58-64/91-96/123-126)

        // Adding all these we get 88 so multiplying with 88 we can get different combinations
        int random = (int) (Math.random() * 88);

        if (random <= 9 && random >= 0) {
            // returning char value of the number
            int num = random + 48;// as number range is 48-57 //48-0=48
            return (char) (num);
        } else if (random <= 35 && random >= 10) {
            int num = random + 55;// as number range is 65-90//65-10=55
            return (char) (num);
        } else if (random >= 97 && random <= 122) {
            int num = random + 61; //97-36=61
            return (char) (num);
        } else {
          return (char)random;
        }
    }
}

    public class Password {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter how many passwords that you need to generate");
            int a = sc.nextInt();
            System.out.println("Enter the length of the password");
            int b = sc.nextInt();
            String[] arr = new String[a];

           String strength= PasswordGen.passwordGenerator(arr, b);// Changes made in the formal parameter reflect back to actual parameter for reference

            for(String j:arr){
                System.out.println(j);
            }
            System.out.println(strength);
        }
    }
