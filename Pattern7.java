
import java.util.*;

class Pattern{
  public static void pattern(int n){
      for(int i = 1 ; i <= n ; i++){
    for(int j = 1  ; j <= i * 2 - 1; j++ ){
          if(j <= i)
          	System.out.print(j + " ");
          else
          	System.out.print(i - (j - i) + " ");
             
    }

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



// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
// 1 2 3 4 5 6 5 4 3 2 1
// 1 2 3 4 5 6 7 6 5 4 3 2 1