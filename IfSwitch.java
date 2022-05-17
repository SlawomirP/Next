package javaUdemy;

public class IfSwitch {
    public static void main(String[] args){

        // Zad - sprawdzić czy liczba jest parzysta

        int number = 4;
        boolean isEven = even(number);

        System.out.println("Is the number " + number + " even?");
        if (isEven == true){
            System.out.println("Yes, it is.");
        } else {
            System.out.println("No, it isn't.");
        }
    }
    public static boolean even (int a){
        return a % 2 == 0;
    }
}
