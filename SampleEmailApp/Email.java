package SampleEmailApp;

import java.util.Scanner;

public class Email {

    Scanner sc = new Scanner(System.in);

    // Properties
    private String Firstname;
    private String LastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength=10;
    private int Mailboxcapacity;
    private String alternateEmail;
    private String alternatePassword;
    private String companySuffix="XYZcorp.com";

    // Constructor
    public Email(String FirstName, String LastName) {

        this.Firstname = FirstName;
        this.LastName = LastName;


        // Department allocating
    this.department=setDepartment();


    // Generating random password
    this.password= RandomPassword(defaultPasswordLength);


    // Email
this.email=this.Firstname.toLowerCase()+this.LastName.toLowerCase()+"@"+department+companySuffix;


    }

    public String info(){
        return "Name :"+this.Firstname+" "+this.LastName+"\nCompany Email :"+this.email+"\nMailbox Capacity: "+this.getMailboxcapacity();
    }

    // setting the mailboxCapacity
    public void setMailboxcapacity(int capacity){
        this.Mailboxcapacity=capacity;
    }
    //getting the mailbox capacity
    public int getMailboxcapacity(){
        return this.Mailboxcapacity;
    }

    //setting the alternateEmail
    public void setalternateEmail(String alternate){
        this.alternateEmail=alternate;
    }

    //getting the alternateEmail
    public String getAlternateEmail(){
        return this.alternateEmail;
    }

    //setting the alternate password

    public void setAlternatePassword(String password){
        this.alternatePassword=password;
    }

    //getting the alternate password

    public String getAlternatePassword(){
        return this.alternatePassword;
    }
    // Generating random password
    private  String RandomPassword(int length){

String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$%@!*^";
char[] pass=new char[length];

for(int i=0;i<length;i++){
    int number =(int) (Math.random()*s.length());
    pass[i]=s.charAt(number);
}

return new String(pass);
    }
    // Department allocation class
    private String setDepartment() {
        System.out.print("Codes for Department\n1. Sales\n2. Development\n3. Accounting\n0. None\nEnter Department Code: ");
        int choice = sc.nextInt();

        return switch (choice) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            default -> "";
        };

    }
}
