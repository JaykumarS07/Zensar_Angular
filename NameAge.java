import java.rmi.activation.ActivationGroup_Stub;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLongArray;

public class NameAge { 
    public static void main(String[] args){
        System.out.println( "Enter name of the person");
        Scanner myobj = new Scanner(System.in);
        String name = myobj.nextLine();
        System.out.println("Enter the age of that person");
        int age = myobj.nextInt();
        if(age >= 18){
            System.out.println(name + " Is an adult" );}
            else{
                System.out.println(name = "Is not an adult");
            }
        

    }
    
}
