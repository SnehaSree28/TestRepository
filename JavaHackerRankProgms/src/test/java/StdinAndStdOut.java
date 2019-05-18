import java.util.Scanner;

/**
 * Created by lovel on 26-Apr-19.
 */
public class StdinAndStdOut {

    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double y=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + i);
        System.out.println("First Commit Testing");
        System.out.println("Second Commit Testing");
        System.out.println("Third");
        System.out.println("Fourth");
        System.out.println("Fifth");
        System.out.println("sixth");
    }

}
