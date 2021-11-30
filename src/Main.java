import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<? extends Employee> list;
        Repository repository = new Repository();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - In luong Waiter \n2 - In luong Kitchen");
        System.out.print("Nhap lua chon: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                list = repository.getWaiterArrayList();
                printList(list);
                break;
            case 2:
                list = repository.getKitchenArrayList();
                printList(list);
                break;
        }
    }

    public static void printList(ArrayList<? extends Employee> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }
}
