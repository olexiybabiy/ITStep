import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        IPizzaFactory newYorkPizza = new NewYorkPizza();
        IPizzaFactory chicagoPizza = new ChicagoPizza();

        System.out.println("Your location? \n NewYork \n Chicago");
        String location = scanner.next();
        if (location.equals("newYork") || location.equals("NewYork")){
            System.out.println("Which pizza you order? \n Carbonara  \n Gavai");
            String pizza = scanner.next();
            if (pizza.equals("carbonara") || pizza.equals("Carbonara")){
                newYorkPizza.createPizza("Carbonara");
            }
            else if (pizza.equals("gavai")|| pizza.equals("Gavai")){
                newYorkPizza.createPizza("Gavai");
            }
            else
                System.out.println("Error");

        }
        else if (location.equals("chicago") || location.equals("Chicago")){
            System.out.println("Which pizza you order? \n Carbonara  \n Gavai");
            String pizza = scanner.next();
            if (pizza.equals("carbonara") || pizza.equals("Carbonara")){
                chicagoPizza.createPizza("Carbonara");
            }
            else if (pizza.equals("gavai")|| pizza.equals("Gavai")){
                chicagoPizza.createPizza("Gavai");
            }
            else
                System.out.println("Error");
        }
        else
            System.out.println("Error");

    }
}