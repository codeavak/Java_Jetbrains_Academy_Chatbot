import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner=new Scanner(System.in);
        var word=scanner.nextLine();
        var firstNumber=Integer.parseInt(scanner.next());
        var secondNumer=Integer.parseInt(scanner.next());
        System.out.println(word.substring(firstNumber,secondNumer+1));
    }
}