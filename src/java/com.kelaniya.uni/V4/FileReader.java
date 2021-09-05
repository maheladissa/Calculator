package com.kelaniya.uni.V4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public Double[] getNumbers() throws IOException {
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:/Users/Mahela/Documents/Software Construction/Calculator/src/numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};















    }
}
