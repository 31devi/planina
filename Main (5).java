import java.util.*;

class Main{
  public static void main(String[]args){
    Scanner kbd= new Scanner(System.in);
    int n=kbd.nextInt();
   int e=(int)Math.pow(2,n)+1;
    System.out.print(e*e);
  }
}