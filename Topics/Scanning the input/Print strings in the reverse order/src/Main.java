//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] words=new String[3];
        var myScanner=new Scanner(System.in);
        for(int i=0;i<words.length;i++)
        {
            var nextWord=myScanner.nextLine();
            words[i]=nextWord;
        }
        for(int i=words.length-1;i>=0;i--)
            System.out.println(words[i]);
    }
}