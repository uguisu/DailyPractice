package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question007;

public class Solution {

    public int reverse(int x) {

        int rtn = 0;
        boolean isNegative = (x <= 0);
        x = (isNegative)? x * -1 : x;
        int pow = (int) Math.log10(x);
        // maxInt = 9
        int maxInt = (int) Math.log10(Integer.MAX_VALUE);
        int wrkSplitNumber = 0;
        int loopCount = 0;

        while (x > 0) {
            wrkSplitNumber = x % 10;
            rtn = (rtn * 10) + wrkSplitNumber;
            x /= 10;

            if(pow == maxInt && loopCount == maxInt - 1) {
                // 输入数字的位数和最大值相同时才有可能溢出，在计算最后一位之前进行检查
                if(rtn > Integer.MAX_VALUE / 10)
                    return 0;
            }

            loopCount++;
        }

        rtn = (isNegative)? rtn * -1 : rtn;

        return rtn;
    }
}
