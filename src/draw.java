import java.util.Scanner;  // Import the Scanner class
public class draw {
    public static void main(String[] args) {
     Scanner Myobj = new Scanner(System.in);
     System.out.print("Enter the height of the triangle: ");
     int hight = Myobj.nextInt();
     for (int i = 1; i <= hight; i++){
         for (int j = 1; j <= i; j++){
             System.out.print("*");
         }
         System.out.print("\n");
     }
    }
}
