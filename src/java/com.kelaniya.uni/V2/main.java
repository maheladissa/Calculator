package com.kelaniya.uni.V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException {

        //Make sure to validate arguments
        if (args.length == 0) {
            System.out.println("Please provide an argument");
            return;
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide a valid argument");
            return;
        }
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:/Users/Mahela/Documents/Software Construction/Calculator/src/numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));
        double result = 0;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        }

        System.out.println(result);

    }
}
