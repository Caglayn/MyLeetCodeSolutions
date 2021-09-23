package com.caglayan.palindromenumber;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		int cpyX = x;
		int reverseX = 0;
		int tmp = 0;
		
        if(x<0) 
        	return false;
        
        else if(x == 0) 
        	return true;
        
        else {
        	for(;cpyX!=0;) {
        		tmp = cpyX%10;
        		reverseX*=10;
        		reverseX+=tmp;
        		cpyX-=tmp;
        		cpyX/=10;
        	}
        }
        
        if(reverseX == x)
        	return true;
        else
        	return false;
    }
}
