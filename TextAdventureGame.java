import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself in a dark forest. You hear strange noises all around you.");
        System.out.println("You have three paths ahead of you: left, right, and straight.");
        System.out.print("Which path do you choose? (left/right/straight): ");
        
        String choice = scanner.nextLine().toLowerCase();
        switch (choice) {
            case "left":
                leftPath();
                break;
            case "right":
                rightPath();
                break;
            case "straight":
                straightPath();
                break;
            default:
                System.out.println("Invalid choice. Please choose left, right, or straight.");
        }
    }

    public static void leftPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You chose the left path. You encounter a river blocking your way.");
        System.out.print("Do you swim across or find another way? (swim/find): ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("swim")) {
            System.out.println("You bravely swim across the river and reach the other side safely.");
            System.out.println("You find a hidden treasure chest and gain valuable items!");
        } else if (choice.equals("find")) {
            System.out.println("You search for another way and discover a bridge to cross the river.");
            System.out.println("You safely cross the river and continue your journey.");
        } else {
            System.out.println("Invalid choice. Please choose swim or find.");
        }
    }

    public static void rightPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You chose the right path. You see a cave entrance.");
        System.out.print("Do you enter the cave or continue on the path? (enter/continue): ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("enter")) {
            System.out.println("You cautiously enter the cave and find a hidden treasure!");
            System.out.println("Congratulations! You are rich beyond your wildest dreams.");
        } else if (choice.equals("continue")) {
            System.out.println("You decide to continue on the path and encounter a friendly traveler.");
            System.out.println("The traveler gives you valuable advice for your journey.");
        } else {
            System.out.println("Invalid choice. Please choose enter or continue.");
        }
    }

    public static void straightPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You chose the straight path. You come across a dark forest.");
        System.out.print("Do you explore the forest or find another path? (explore/find): ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("explore")) {
            System.out.println("You bravely explore the forest and find hidden treasures!");
            System.out.println("You also encounter dangerous creatures but manage to escape unscathed.");
        } else if (choice.equals("find")) {
            System.out.println("You decide to find another path and avoid the forest altogether.");
            System.out.println("You continue on a different path and encounter a beautiful meadow.");
        } else {
            System.out.println("Invalid choice. Please choose explore or find.");
        }
    }
}
