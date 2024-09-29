import java.util.*;

class Quetion2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name = ");
        String fullName = scanner.nextLine();
        String[] nameArray = fullName.split(" ");
        System.out.print(nameArray[2]+","+nameArray[0]+" "+nameArray[1].charAt(0)+".");
    }
}