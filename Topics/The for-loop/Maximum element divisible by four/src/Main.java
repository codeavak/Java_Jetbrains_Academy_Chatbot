import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s =new Scanner(System.in);
        int howMany=s.nextInt();
        var currentMax=Integer.MIN_VALUE;
        int currentEl=0;
        for(int i=0;i<howMany;i++)
        {currentEl=s.nextInt();
            if(currentEl%4==0&& currentEl>currentMax)
                currentMax=currentEl;}
        System.out.println(currentMax);

    }
}