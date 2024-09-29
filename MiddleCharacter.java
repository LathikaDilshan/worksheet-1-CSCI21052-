import java.util.*;

class MiddleCharacter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter odd length word = ");
        String inputWord = scanner.next();

        while(inputWord.length()%2==0){
            System.out.println("your input is wrong");
            System.out.print("Enter odd length word = ");
            inputWord = scanner.next();
        }
        System.out.println(inputWord.charAt((inputWord.length())/2));
    }
}