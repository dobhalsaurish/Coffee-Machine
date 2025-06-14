import java.util.Scanner;

public class CoffeeMachine_Main {

    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        while(true){
            System.out.println("\nWelcome to the Coffee machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice =userInput.nextInt();

            switch (choice){
                case 1:
                    String espressoName="Espresso";
                    double espressoPrice=2.50;

                    System.out.print("What roast would you like? (light,medium,dark): ");
                    String espressoRoast=userInput.next();

                    System.out.print("How many servings would you like: ");
                    int numberOfShots=userInput.nextInt();

                    Espresso espresso=new Espresso(espressoName,espressoRoast,espressoPrice,numberOfShots);
                    System.out.println();
                    espresso.grindBeans();
                    espresso.brewCoffee();
                    espresso.coffeeInfo();
                    espresso.printEspressoDetails();
                    System.out.println();
                    System.out.println("****************");
                    System.out.println();
                    break;

                case 2:
                    String latteName="Latte";
                    double lattePrice=3.50;

                    System.out.print("What roast would you like? (light,medium,dark): ");
                    String latteRoast=userInput.next();

                    System.out.print("What milk type would you like? (whole,oat,almond,skim): ");
                    String milkType=userInput.next();

                    System.out.print("Would you like syrup? (yes/no): ");
                    String syrupWanted=userInput.next();

                    String syrupFlavor="None";

                    if(syrupWanted.equalsIgnoreCase("yes")){
                        System.out.print("Which flavor would you like? (vanilla,hazelnut,caramel): ");
                        syrupFlavor=userInput.next();
                    }

                    Latte latte=new Latte(latteName,latteRoast,lattePrice,milkType,syrupFlavor);
                    System.out.println();
                    latte.grindBeans();
                    latte.brewCoffee();
                    latte.coffeeInfo();
                    latte.printLatteDetails();
                    System.out.println();
                    System.out.println("****************");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Thankyou for using Coffee machine.");
                    return;

                default:
                    System.out.println("Invalid choice. Enter again");

            }
        }
    }

}
