import java.util.Scanner; // Import the scanner class
public class pyramiddrawing {
    public static void main(String[] args) {
        Scanner mYobj = new Scanner(System.in);
        System.out.print("Type your pyramid's height here: ");
        int height = mYobj.nextInt();
        String result = "", record = "";
        int line = 1;
        while (line <= height) {
            String space = "", character = "";
            for (int i = height-line; i >= 1; i--){
                space += "  ";
            }
            for (int j = 1; j <= (2*line - 1); j++){
                character += "* ";
            }
            record = space + character + "\n";
            result += record;
            line++;
        }
        System.out.print(result);
    }
}
