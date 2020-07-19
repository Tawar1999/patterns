
import java.util.*;

class Pattern{
  public static void pattern(int n){
      for(int i = 1 ; i <= n ; i++){
        for(int j = n , k = 1 ; k <= i ; j-- , k++)
         System.out.print(j + " ");

      System.out.println();
      }

  }
  public static void main(String[] args) {
    System.out.print("Enter n....");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pattern(n);
  }
}


// 7
// 7 6 
// 7 6 5
// 7 6 5 4
// 7 6 5 4 3
// 7 6 5 4 3 2 
// 7 6 5 4 3 2 1
