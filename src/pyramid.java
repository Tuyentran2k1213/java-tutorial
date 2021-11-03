import java.util.Scanner; //import the java scanner class
public class pyramid {
    public static void main(String[] args){
        Scanner myobJ = new Scanner(System.in);
        System.out.print("Enter your half hight: ");
        int HEIGHT = myobJ.nextInt();
        String record = "", result = "", space = "", character = "";
        for (int line = 1; line <= HEIGHT; line++) {
            space = ""; character = "";
            for (int n = 1; n < line; n++) {
//                space += " ";
                System.out.print(" ");
            }
            for (int m = HEIGHT * 2 - 1 ; m >= (2 * line - 1); m--) {
//                character += "*";
                System.out.print("*");
            }
//            record = space + character + "\n";
//            result += record;
            System.out.print("\n");
        }
        for (int line = 1; line <= HEIGHT; line++){
//            space = ""; character = "";
            for (int i = 1; i < HEIGHT - line - 1; i++){
//                space += " ";
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * line - 2); j++){
//                character += "*";
                System.out.print("*");
            }
//            record = space + character + "\n";
//            result += record;
            System.out.print("\n");
        }
    }
}
