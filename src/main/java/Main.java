import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String test =  StringUtils.upperCase("lowertoupper");
        System.out.println(test);
        System.out.println("enter an input to check if it's a number");
        Scanner scandy = new Scanner(System.in);
        String userInput = scandy.nextLine();
        Boolean isNumeric = StringUtils.isNumeric(userInput);
        System.out.println(isNumeric);
        System.out.println("enter a string");
        String userString = scandy.nextLine();
        String swapstring = StringUtils.swapCase(userString);
        System.out.println("input cases are swapped: "+swapstring);
        String reversestring = StringUtils.reverse(userString);
        System.out.println("input is reversed: "+reversestring);
        System.out.println("hello");
        System.out.println("hello");
    }
}
