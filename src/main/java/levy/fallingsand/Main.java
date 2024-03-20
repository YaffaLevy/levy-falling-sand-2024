package levy.fallingsand;

public class Main {

    public static void main(String[] args) {
        Sand sand = new Sand(50, 10);
        sand.randomSand(50);

        SandComponent sandComponent = new SandComponent(sand);
        sandComponent.initializeGui();
    }

}




