package com.company;

import java.util.*;

public class Lab1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Студент: Бабій Олексій");
        System.out.println("Можлива кількість навчальних годин - 1000.");

        System.out.println("***************************************************");

        System.out.println("Кількість предметів: ");

        int j = scan.nextInt();
        student.setNumberof(j);

        System.out.println("Доступні предмети: ");
        System.out.println("1. Програмування");
        System.out.println("2. ООП");
        System.out.println("3. Алгебра і геометрія");
        System.out.println("4. Економіка");
        System.out.println("5. Англійська");

        int b = 0;

        for (int l = 0; l<j; l++){
            System.out.println("Виберіть предмет "+(l+1)+": ");
            b = scan.nextInt();

            if(b == 1){
                System.out.println("Кількість годин: ");
                student.setP(scan.nextInt());
            }
            else if(b == 2){
                System.out.println("Кількість годин: ");
                student.setO(scan.nextInt());
            }
            else if(b == 3){
                System.out.println("Кількість годин: ");
                student.setA(scan.nextInt());
            }
            else if(b == 4){
                System.out.println("Кількість годин: ");
                student.setE(scan.nextInt());
            }
            else if(b == 5){
                System.out.println("Кількість годин: ");
                student.setEn(scan.nextInt());
            }
            else{
                System.out.println("Error");
                System.exit(0);
            }
        }
    }
}

class Student{
    private int studytime = 1000;
    private int numberof = 0;
    private int p = 0;              // години Програмування
    private int o = 0;              // години ООП
    private int a = 0;              // години Алгебри
    private int e = 0;              // години Економіки
    private int en = 0;             // години Англійської


    public void setNumberof(int numb){
        if (numb<1){
            System.out.println("*** Кількіть предметів повинна бути додатньою! ***");
            System.exit(0);
        }else {
            numberof = numb;
        }
    }


    public void setP(int one){
        p = one;
        if(p>0) {
            System.out.println("Програмування - " + p + "год.");
            studytime = studytime - p;

            if (studytime > -1) {
                System.out.println("Залишилось - " + studytime + "год.");
            } else {
                System.out.println("Увесь час використано!");
                System.exit(0);
            }
        }else{
            System.out.println("Час навчання повинен бути додатнім!");
            System.exit(0);
        }

    }
    public void setO(int two){
        o = two;
        if (o>0) {
            System.out.println("ООП - " + o + "год.");
            studytime = studytime - o;
            if (studytime > -1) {
                System.out.println("Залишилось - " + studytime + "год.");
            } else {
                System.out.println("Увесь час використано!");
                System.exit(0);
            }
        }else{
            System.out.println("Час навчання повинен бути додатнім!");
            System.exit(0);
        }
    }
    public void setA(int tree){
        a = tree;
        if(a>0) {
            System.out.println("Алгебра і геометрія - " + a + "год.");
            studytime = studytime - a;
            if (studytime > -1) {
                System.out.println("Залишилось - " + studytime + "год.");
            } else {
                System.out.println("Увесь час використано!");
                System.exit(0);
            }
        }else{
            System.out.println("Час навчання повинен бути додатнім!");
            System.exit(0);
        }
    }
    public void setE(int four){
        e = four;
        if(e>0) {
            System.out.println("Економіка - " + e + "год.");
            studytime = studytime - e;
            if (studytime > -1) {
                System.out.println("Залишилось - " + studytime + "год.");
            } else {
                System.out.println("Увесь час використано!");
                System.exit(0);
            }
        }else{
            System.out.println("Час навчання повинен бути додатнім!");
            System.exit(0);
        }
    }
    public void setEn(int five){
        en = five;
        if(en>0) {
            System.out.println("Економіка - " + en + "год.");
            studytime = studytime - en;
            if (studytime > -1) {
                System.out.println("Залишилось - " + studytime + "год.");
            } else {
                System.out.println("Увесь час використано!");
                System.exit(0);
            }
        }else{
            System.out.println("Час навчання повинен бути додатнім!");
            System.exit(0);
        }
    }

}



