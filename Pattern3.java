import java.util.*;

class Pattern{
  public static void pattern(int n){
      for(int i = n ; i >= 1 ; i--){
        for(int j = n ; j > n - i ; j--)
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


// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4 
// 5