//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var formData=new String[5];
        var scanner=new Scanner(System.in);
        for(int i=0;i<formData.length;i++)
            formData[i]=scanner.next();
        System.out.println(String.format(
                "The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.",
                formData[0],formData[4]));

    }
}