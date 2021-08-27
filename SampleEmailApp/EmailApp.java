package SampleEmailApp;

public class EmailApp {

    public static void main(String[] args) {
     Email newmail=new Email("Gokula","Krishnan");
     newmail.setMailboxcapacity(5000);
     System.out.println(newmail.info());

    }
}
