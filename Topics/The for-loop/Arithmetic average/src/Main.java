import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        // put your code here
        var s=new Scanner(System.in);
        var first=s.nextInt();
        var second=s.nextInt();

        double count=0;
        double sum=0;

        for(int i=first;i<=second;i++)
            if(i%3==0)
            {count++;sum+=i;}
        if(count!=0)
            System.out.println(sum/count);
        else throw new Exception("No numbers to work with!");
    }
}