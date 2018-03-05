package com.company;

public class Lab3 {

    public static void main(String [] args) {
        Bank[] banks = new Bank[]{
                new AlphaBank(), new Pumb(), new PrivatBank()
        };
        for (int i = 0; i < banks.length; i++){
                System.out.println("************************************");
                System.out.println("Назва банку: "+ banks[i].Name());
                System.out.println("Депозит: "+ banks[i].Deposit());
                System.out.println("З відсотком: "+ banks[i].WithDraw());
                System.out.println("************************************");
        }
    }
}

abstract class Bank{
    public abstract double Deposit();
    public abstract double WithDraw();
    public abstract String Name();
}

class AlphaBank extends Bank{
    private String name = "AlphaBank";
    private double depositPercentage = 0.05d;
    private double withDrawPercentage = 0.10d;
    private double balance = 3000.0d;

    public double Deposit(){
        return balance;
    }

    public double WithDraw() {
        return balance * withDrawPercentage;
    }

    public String Name() {
        return name;
    }


}

class Pumb extends Bank{
    private String name = "Pumb";
    private double depositPercentage = 0.06d;
    private double withDrawPercentage = 0.12d;
    private double balance = 2000.0d;

    public double Deposit(){
        return balance;
    }

    public double WithDraw() {
        return balance * withDrawPercentage;
    }

    public String Name() {
        return name;
    }
}

class PrivatBank extends Bank{
    private String name = "PrivatBank";
    private double depositPercentage = 0.07d;
    private double withDrawPercentage = 0.15d;
    private double balance = 1000.0d;

    public double Deposit(){
        return balance;
    }

    public double WithDraw() {
        return balance * withDrawPercentage;
    }

    public String Name() {
        return name;
    }


}


