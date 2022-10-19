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
        String string = StringUtils.upperCase(userString);
        System.out.println(string);
        String string1 = StringUtils.lowerCase(userString);
        System.out.println(string1);
        String string2 = StringUtils.reverse(userString);
        System.out.println(string2);
    }
}
