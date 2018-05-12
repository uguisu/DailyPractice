/**
 * 93.Restore IP Addresses
 *
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * For example:
 * Given "25525511135",
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 *
 */
package com.github.uguisu.www.algorithm.leetCode.question093;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final String STRING_DOT = ".";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		String input = "010010";

		List<String> output = s.restoreIpAddresses(input);

		for(String i : output) {
			System.out.println(i);
		}
	}

    public List<String> restoreIpAddresses(String s) {

        // check
        if(null == s || (s.length() < 4 || s.length() > 12 )) return new ArrayList<String>();

        // declare return object
        List<String> rtn = getSubIP(s, 4);

        return rtn;
    }

    public ArrayList<String> getSubIP(String subIp, int level) {

    	ArrayList<String> rtn = new ArrayList<String>();

    	if(level == 1) {
    		// The last level
    		if(isValidNumber(subIp)) {
    			rtn.add(subIp);
    		}
    		return rtn;
    	}

    	String headIp = "";
    	String remainedIp = "";
    	int _intLevel = level - 1;

    	for(int i = 0; i < 3 && i < subIp.length(); i++) {
    		// Get head string
    		headIp = subIp.substring(0, i + 1);
    		// Skip inValud IP
    		if(!isValidNumber(headIp)) continue;

    		// Get remained sub-string
    		remainedIp = subIp.substring(i + 1, subIp.length());

    		// split group
    		if(!"".equals(remainedIp) && canSplitToGroup(remainedIp, _intLevel)) {

    			ArrayList<String> wrk = getSubIP(remainedIp, _intLevel);
    			if(null != wrk && 0 != wrk.size()) {
    				rtn.addAll(mergeToList(headIp, wrk));
    			}
    		}
    	}

    	return rtn;
    }

    private ArrayList<String> mergeToList(String preFix, ArrayList<String> list) {

    	ArrayList<String> RTN = new ArrayList<String>();

    	for(String a : list) {
    		RTN.add(preFix + STRING_DOT + a);
    	}

    	return RTN;
    }

    /**
     * Check sub string can be splite to more groups
     * @param remainedIp
     * @param sublevel
     * @return
     */
    private boolean canSplitToGroup(String remainedIp, int sublevel) {
    	return (sublevel * 3 >= remainedIp.length()) ? true : false;
    }

    /**
     * Verify valid value
     */
    private boolean isValidNumber(String strAddressNumber) {
        // For case input = "010010";
        // Some result should be drop because head ZERO will compressed
        if(strAddressNumber.length() > 1 && '0' == strAddressNumber.charAt(0)) {
        	return false;
        } else {
            int intAddressNumber = Integer.valueOf(strAddressNumber);
            return (0 <= intAddressNumber && intAddressNumber <= 255 ) ? true : false;
        }
    }
}
