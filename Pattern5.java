import java.util.*;

class Pattern{
  public static void pattern(int n){
      for(int i = 7 ; i >= 1 ; i--){
        for(int j = i ; j >= 1 ; j--)
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

// 7 6 5 4 3 2 1
// 6 5 4 3 2 1
// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1
