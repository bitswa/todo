import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Item> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean still = true;

        do {
            System.out.println("1: add new item \n2: remove item \n3: end program");
            System.out.print("What do you wanna do? (1 - 3): ");
            int userChoose = scan.nextInt();

            if (userChoose >= 1 && userChoose <= 3) {
                if (userChoose == 1) {
                    addItem();
                }
                if (userChoose == 2) {
                    removeItem();
                }
                if (userChoose == 3) {
                    still = false;
                }
                // complete task
                printList();
            }

        } while(still);
    }

    public static void addItem() {
        System.out.print("Item text: ");
        String text = scan.next();

        list.add(new Item(text));
    }

    public static void removeItem() {
        printList();
        System.out.print("Which you would erase? (0 - " + list.size() +"): ");
        int selected = scan.nextInt();

        if (list.get(selected) != null) {
            list.remove(selected);
        }
    }

    public static void printList() {
        System.out.println("\n------- START LIST -------");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i);
            System.out.println(list.get(i).getId() + ": " + list.get(i).getTitle() + " - Completed: " + list.get(i).isCompleted());
        }
        System.out.println("------- END LIST -------\n");
    }
}