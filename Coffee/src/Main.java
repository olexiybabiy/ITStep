import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bavarage b;

        System.out.println("������� ����: \n 1 - ���������\n 2 - ���� \n 3 - ���\n>:");
        boolean exit = true;
        switch (scanner.nextInt()){

            case 1: b = new Americano(); res(b);
                break;
            case 2: b = new Late(); res(b);
                break;
            case 3: b = new Tea(); res(b);
                break;
        }
    }

    public static void res(Bavarage b){
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        System.out.println("������� ������� �� �����:");
        exit = true;
        do {
            System.out.println(" 1 - ������\n 2 - �����\n 3 - �������� ����\n>:");
            switch (scanner.nextInt()) {

                case 1:
                    b = new Milk(b);
                    break;
                case 2:
                    b = new Sugar(b);
                    break;
                case 3: exit = false;
            }
        }while (exit);
        System.out.println("����: "+b.description()+"\n ֳ��: "+b.cost());
    }
}