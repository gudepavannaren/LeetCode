import java.util.*;
class Solution {
    public static double myPow(double x, int n) {
        return Math.pow(x,n);       
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        int b=sc.nextInt();
        System.out.println(myPow(a,b));
    }
}