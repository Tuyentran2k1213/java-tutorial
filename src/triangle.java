import java.util.Scanner; //import the scanner class
public class triangle {
    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);
        System.out.print("Input your height's triangle here: ");
        String record = "", result = "";
        int height = Myobj.nextInt();
        for (int number = 1; number <= height; number++){
            String space = " ", num = "";
            for (int i = 1; i <= height-number; i++){
//                System.out.print(" ");
                space += " ";
            }
            for (int j = 1; j <= ( 2 * number - 1); j++){
//                System.out.print(number+" ");
                num += j;
            }
            record = space + num;
            result = record + "\n";
            System.out.print(result);
//            System.out.print("\n");
        }
        for (int number = 1; number <= height; number++){
            for (int i = 1; i <= height-number; i++){
                System.out.print(" ");
            }
            for (int j = 1; j <= ( 2 * number - 1); j++){
                System.out.print(number);
            }
            System.out.print("\n");
        }
    }
}
