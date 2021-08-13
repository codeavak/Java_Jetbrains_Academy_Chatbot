import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var first = scanner.nextLine().replace(" ", "");
        var second = scanner.nextLine().replace(" ", "");
        if (first.equals(second)) {
            System.out.println(true); 
            }
        else {
             System.out.println(false); 
             }
    }
}
