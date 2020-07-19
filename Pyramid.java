import java.util.*;

class Pattern{

  
  public static void pattern(int n){
     for(int i = 1 ; i <= n ; i++){
       // for spaces
     	for(int j = 1 ; j <= n - i ; j++)
     		System.out.print(" ");
     	// stars

     	for(int k = 1 ; k <= i ; k++){
     		System.out.print("* ");
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




//     * 
//    * *
//   * * * 
//  * * * *
// * * * * *