import java.util.ArrayList;
import java.lang.Math;

public class Main {


    static ArrayList<String> listNames = new ArrayList<>();
    public static void main(String args[]){
        findQuadraticSolution(1,1,-1);
    }
    static void findQuadraticSolution(int a,int b, int c){
        double result1 = (((double)(-1*b) + Math.sqrt((Math.pow(b,2)) - (4*a*c))/(double)(2*a)));
        double result2 = (((double)(-1*b) + Math.sqrt(Math.pow(b,2)) - (4*a*c))/(double)(2*a));
        System.out.println(result1);
        System.out.println(result2);
    }
}
