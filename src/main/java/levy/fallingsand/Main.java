package levy.fallingsand;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sand sand = new Sand(50, 10);
        sand.randomSand(50);

        SandComponent sandComponent = new SandComponent(sand);
        sandComponent.initializeGUI();

        while (true) {
            System.out.println(sand);
            System.out.println("Press Enter to make sand fall");
            scanner.nextLine();
            sand.fall();
            sandComponent.repaint();
        }
    }
}





