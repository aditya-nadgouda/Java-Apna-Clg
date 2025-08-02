package PracticeQuestions;

import java.util.Scanner;

public class A07_CountPosNegZeros {
    public static void count (){
        Scanner in = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zer = 0;
        while(true){
            System.out.println("Enter a num : {OR} Type 'exit' to quit");
           String input = in.nextLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            else {
                int num = Integer.parseInt(input);
                if (num > 0){
                    pos++;
                } else if (num<0) {
                    neg++;
                }
                else {
                    zer++;
                }
            }
        }
        System.out.println("Count of Positive number's : " +
                pos+"\nCount of Negative number's : "+
                neg+"\nCount of Zeros : "+zer);
    }
    public static void main(String[] args) {
        count();
    }
}
