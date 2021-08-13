import java.util.Locale;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner=new Scanner(System.in);
        var name=scanner.nextLine();
        if(name.toLowerCase().endsWith("burg"))
            System.out.println(true);
        else 
            System.out.println(false);
    }
}
