import java.util.*;

class Question3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your length in centimetres = ");
        int length = scanner.nextInt();
        double lengthInInch = length/ 2.54 ;
        int lengthFeet = (int) lengthInInch / 12 ;
        double remainingInches = lengthInInch % 12 ;
        System.out.println(lengthFeet +" feet and "+ String.format("%.2f",remainingInches) + " Inches");
    }
}