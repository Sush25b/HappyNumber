package com.thoughtworks.check;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    private int numberToCheck;
    List<Integer> nonHappyNumbers= new ArrayList<>();

    public boolean checkNumber(int number)     //check for number hapy or not
    {
        if (number == 1) {
            return true;
        }

        int isHappyNum = this.squareSum(number);

        if(nonHappyNumbers.contains(number))
        {
            return false;
        }

        if(isHappyNum!=1)
        {
            nonHappyNumbers.add(number);
        }

        return this.checkNumber(isHappyNum);
    }

    public int squareSum(int n) {                          //n=10
        int sum = 0;
        while (n != 0) {
            sum = sum + this.squareOfNumber(n % 10);  //10==> 0;    0+0   0+1
            n = n / 10;                                  //10==> 1
        }
        return sum;
    }

    public int squareOfNumber(int n) {
        return n * n;
    }

}
