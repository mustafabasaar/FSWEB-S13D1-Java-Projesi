import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(false, 23));
        System.out.println(shouldWakeUp(true, 21));
        System.out.println("-----------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("-----------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 32));
        System.out.println(isCatPlaying(true, 38));
        System.out.println("-----------------------");
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter width:");
            double width =scanner.nextDouble();
            System.out.println("enter height:");
            double height =scanner.nextDouble();
            System.out.println("area of rectangle:" + area(width,height));
        }
        catch(Exception ex){
            System.out.println("Invalid Input");
        }
        try{
            System.out.println("-----------------------");
            System.out.println("enter radius:");
            double radius =scanner.nextDouble();
            System.out.println("area of circle:"+area(radius));
        }
        catch(Exception ex){
            System.out.println("Invalid Input");
        }
    }

public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        if (hourOfDay <0 || hourOfDay >23){
            return false;
        }
        return isBarking && (hourOfDay < 8 || hourOfDay>=20);
     }

    public static boolean hasTeen(int num1,int num2,int num3){
        if((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isCatPlaying(boolean isSummer,int heat){
        if((heat >= 25 && heat <= 35)) {
            return true;
        }
        else if ((heat>35) && (isSummer)) {
            return true;
        }
        else{
            return false;
        }
    }

        public static double area(double num1, double num2) {
            if (num1 < 0 || num2 < 0) {
                return -1;
            } else {
                return num1 * num2;
            }
        }

    public static double area(double radius) {
        if (radius < 0 ) {
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}