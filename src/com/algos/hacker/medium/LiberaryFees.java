package com.algos.hacker.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LiberaryFees {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) 
    {
       // String actualStr = d1+"-"+m1+"-"+y1;
       // String expectedStr = d2+"-"+m2+"-"+y2;
        LocalDate actual = LocalDate.of(y1, m1, d1);
        LocalDate expected = LocalDate.of(y2, m2, d2);;
        //long fine = 0;
        if(actual.isBefore(expected) || actual.isEqual(expected))
            return 0;
        else if(actual.isAfter(expected) && actual.getYear() == expected.getYear() && actual.getMonth().getValue() == expected.getMonth().getValue())
            return 15*(int)ChronoUnit.DAYS.between(expected, actual);

        else if(actual.isAfter(expected) && actual.getYear() == expected.getYear() && actual.getMonth().getValue() > expected.getMonth().getValue())
            return 500*(int)ChronoUnit.DAYS.between(expected, actual);
            
        else if(actual.isAfter(expected) && actual.getYear() > expected.getYear())
            return 10000;
        else
          return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        System.out.println(result);

        scanner.close();
    }
}
