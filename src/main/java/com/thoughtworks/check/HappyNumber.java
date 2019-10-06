package com.thoughtworks.check;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    private int numberToCheck;
    private List<Integer> nonHappyNumbers= new ArrayList<>();

    public boolean checkNumber(int number)     //isHappyNumber
    {
        if (number == 1) {
            return true;
        }

        int newNumber = this.squareSum(number);  //1

        if(nonHappyNumbers.contains(number))
        {
            return false;
        }

        nonHappyNumbers.add(number);

        return checkNumber(newNumber);
    }

    private int squareSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + this.squareOfNumber(n % 10);  //10==> 0;    0+0   0+1
            n = n / 10;                                  //10==> 1
        }
        return sum;
    }

    private int squareOfNumber(int n) {
        return n * n;
    }

}
