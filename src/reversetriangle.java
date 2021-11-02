import java.util.Scanner; //Import the scanner class
public class reversetriangle {
    public static void main(String[] args){
        Scanner Myobj = new Scanner(System.in);
        System.out.print("type your number here: ");
        int number = Myobj.nextInt();
        int count = 1, num = number;
            while(count <= number) {
                    for (int i = number; i >= 1; i--) {
                        System.out.print("*");
                    }
                System.out.print("\n");
                number--;
            }
        count = 2;
            while(count <= num){
                    for (int j = 1; j <=count; j++) {
                        System.out.print("*");
                    }
                System.out.print("\n");
                count++;
            }
    }
}
