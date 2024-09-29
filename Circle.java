import java.util.*;

class Circle{
    public static double computeArea(Float args){
        return (Math.PI*args*args);
    }

    public static double computeCircumference(Float r1,Float r0){
        double out = (computeArea(r0)-computeArea(r1));
        return (out);
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter small circle's radious = ");
        float r1 = scanner.nextFloat();


        System.out.print("Enter large circle's radious = ");
        float r0 = scanner.nextFloat();

        double out = computeCircumference(r1 , r0);
        System.out.print(out);
    }
}