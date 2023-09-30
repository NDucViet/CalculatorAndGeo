package Calculator;

public class Main {
    public static void main(String[] args) {
        //loop until user want to exit
        Manager manager = new Manager();
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.superlativeEquation();
                    break;
                case 2:
                    manager.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}
