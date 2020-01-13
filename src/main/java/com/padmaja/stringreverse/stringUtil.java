package com.padmaja.stringreverse;
import java.lang.String;

public class stringUtil {


    public static double parser(String   numberAsString) {
        System.out.println(numberAsString);

        double number = Double.parseDouble(numberAsString);
        // System.out.println("number = ",+ number);
        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number= " + number);

        return number;

    }

}
