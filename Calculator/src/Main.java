import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Calculator calk = new Calculator();
        String operation, operTwo = "";


        while (true){

            System.out.print("Enter operation \n  \'+\' \n  \'-\' \n  \'*\' \n  \'/\' \n  \'M\' \nif you want to exit, print - \'exit\'\n >: ");
            operation = sc.next();

            if (!operation.equalsIgnoreCase("M")&&
                    !operation.equalsIgnoreCase("exit")&&
                    !operation.equalsIgnoreCase("+")&&
                    !operation.equalsIgnoreCase("-")&&
                    !operation.equalsIgnoreCase("*")&&
                    !operation.equalsIgnoreCase("/")
                    ){
                System.out.println("      Error:\n  \'" + operation + "\' isn't operation\n");
                continue;
            }

            if (operation.equalsIgnoreCase("M")){
                System.out.print("Enter next operation: ");
                operTwo = sc.next();

                if (!operTwo.equalsIgnoreCase("+")&&
                        !operTwo.equalsIgnoreCase("-")&&
                        !operTwo.equalsIgnoreCase("*")&&
                        !operTwo.equalsIgnoreCase("/")
                        ){
                    System.out.println("      Error:\n  \'"+ operTwo+"\' is not operation\n");
                    continue;
                }
            }

            else if(operation.equalsIgnoreCase("exit"))
            {
                break;
            }


            System.out.print("Enter first number (\'M\' - " + calk.res + " ) \n >: ");
            String firstNum = sc.next();

            if (!firstNum.equalsIgnoreCase("M") && !calk.checkString(firstNum))
            {
                System.out.println("      Error \n\'" + firstNum + "\' is not number or \'M\'\n");
                continue;
            }


            System.out.print("Enter second number (\'M\' - " + calk.res + " ) \n >: ");
            String secNum = sc.next();

            if (!secNum.equalsIgnoreCase("M") && !calk.checkString(secNum)){
                System.out.println("      Error \n\'" + secNum + "\' is not number or \'M\'\n");
                continue;
            }

            if (operation.equalsIgnoreCase("M")){
                System.out.println("Result: " + calk.operWithM(operTwo, firstNum, secNum));
            }

            else if (!operation.equalsIgnoreCase("M")){
                System.out.println("Result: " + calk.operNotM(operation, firstNum, secNum));
            }

            System.out.println();
        }
    }
}