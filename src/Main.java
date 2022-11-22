import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Scanner;

class Customer
{
    int tea=10;
    int coffee=10;
    int snacks=10;
    int idli=8;
    int dosha=6;

    Customer()
    {

    }
    public void tea(int count)
    {
        int prize=count*tea;
    }
    public void coffee(int count)
    {
        int prize=count*coffee;
    }
    public void snacks(int count)
    {
        int prize=count*snacks;
    }
    public void idli(int count)
    {
        int prize=count*idli;
    }
    public void dosha(int count)
    {
        int prize=count*dosha;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> arrCus = new ArrayList<Customer>();
        while (true) {
            System.out.println("Select an option\n1.Generate bill\n2.View all transactions\n3.Exit\n");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 3) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {
            }
            }

    }
}