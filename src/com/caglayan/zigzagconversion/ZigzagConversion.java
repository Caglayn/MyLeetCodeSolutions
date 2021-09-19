package com.caglayan.zigzagconversion;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int stepSize = (numRows-1)*2;
        String result = "";
    	
        if(numRows == 1) {
        	return s;
        }
        else if(s.length()<=numRows) {
        	return s;
        }
        else {
        	for(int i = 0 ; i!=-1 ; i++) {
    			if((i*stepSize)<s.length()) {
    				result += s.charAt(i*stepSize);
    			}
    			else {
    				i=-1;
    				break;
    			}
        	}
        	
        	for(int i = 1; i<(numRows-1) ; i++) {
        		int halfStep = stepSize - 2*i;
        		result += s.charAt(i);
        		for(int j = i; j!=-1 ; ) {
        			j+=halfStep;
        			if(j<s.length()) {
        				result+=s.charAt(j);
        			}
        			else {
        				j=-1;
        				break;
        			}
        			j+=(2*i);
        			if(j<s.length()) {
        				result+=s.charAt(j);
        			}
        			else {
        				j=-1;
        				break;
        			}
        		}
        	}
        	

        	for(int i = 0 ; i!=-1 ; i++ ) {
        		if(((numRows-1)+i*stepSize)<s.length()) {
        			result+=s.charAt((numRows-1)+i*stepSize);
        		}
        		else {
        			i=-1;
        			break;
        		}
        	}
        	
        }
        
    	return result;
    }
}
