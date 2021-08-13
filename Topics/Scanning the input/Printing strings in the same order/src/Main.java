import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String[] words=new String[4];
        var myScanner=new Scanner(System.in);
        for(int i=0;i<words.length;i++)
        {
            var nextWord=myScanner.next();
            words[i]=nextWord;
        }
        for(int i=0;i<words.length;i++)
            System.out.println(words[i]);
    }
}