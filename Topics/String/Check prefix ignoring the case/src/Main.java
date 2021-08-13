import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner=new Scanner(System.in);
        var input=scanner.next();
        if("J".equalsIgnoreCase(input.charAt(0)+""))
            System.out.println(true);
        else System.out.println(false);
    }
}