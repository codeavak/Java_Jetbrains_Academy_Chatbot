import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        var scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();

        long result=1;
        for(int i=first;i<second;i++)
            result*=i;
        System.out.println(result);
    }
}