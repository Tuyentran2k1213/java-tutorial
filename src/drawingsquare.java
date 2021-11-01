import java.util.Scanner; // Import the scanner class
public class drawingsquare {
    public static void main(String[] args) {
    Scanner MYobj = new Scanner(System.in);
    System.out.print("Enter your size of square here: ");
    int size = MYobj.nextInt();
    int number = 1;
    while (number <= size) {
        for (int i = 1; i <= size; i++){
            if (2 <= i && number >= 2 && size > i && number < size){
                System.out.print("   ");
            }
            else{
            System.out.print("*  ");}
        }
        System.out.print("\n");
        number++;
    }
    }
}
