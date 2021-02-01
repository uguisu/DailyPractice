package com.github.uguisu.www.algorithm.leetCode.question008;

class Solution {

    public int myAtoi(String s) {
        // verify
        if(null == s || "".equals(s.trim()))
            return 0;
        // trim
        s = s.trim();

        // change to array
        char[] sAry = s.toCharArray();

        boolean isPositiveValue = true;
        int PLUS = 43;
        int NEGATIVE = 45;
        int ZERO = 48;
        int NIGHT = 57;

        int rtn = 0;
        int last = 0;
        int start = 0;

        if(PLUS == sAry[start] || NEGATIVE == sAry[start]) {
            isPositiveValue = (PLUS == sAry[start]);
            start += 1;
        }

        // skip all zero in the left
        for(int i = start; i < sAry.length; i++) {
            if(ZERO != sAry[i]) {
                start = i;
                break;
            }
        }

        char _wch;
        for(int i = start; i < sAry.length; i++) {

            _wch = sAry[i];

            if(ZERO <= _wch && _wch <= NIGHT) {
                last = rtn;
                rtn = Character.getNumericValue(_wch) + rtn * 10;
                // check if Out of Memory
                if(last != rtn / 10)
                    return (isPositiveValue) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                // stop loop
                break;
            }

        }
        return (isPositiveValue) ? rtn : rtn * -1;
    }
}
