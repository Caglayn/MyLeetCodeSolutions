package com.caglayan.logestcommonprefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String tmp = "";
        Boolean isSame = true;
        
        for(int i = 0; i<strs[0].length();i++) {
        	
        	if(!isSame)
        		break;
        	else {
        		Boolean isOk = false;
        		for(int k = 0; k<strs.length; k++) {
        			if(i >= strs[k].length()) {
        				isOk = true;
        				break;
        			}
        		}
        		if(isOk)
        			break;
        	}
        	
        	tmp += strs[0].charAt(i);
        	
        	for(int j = 1; j<strs.length;j++) {
        		if(strs[j].charAt(i) != strs[0].charAt(i)) {
        			isSame = false;
        			break;
        		}
        	}
        	
        	if(isSame) {
        		if(result.length()<tmp.length())
        			result = tmp;
        	}
//        	else {
//        		isSame = true;
//        		tmp = "";
//        	}
        }
        
        return result;
    }
}
