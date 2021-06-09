package com.pratap.practise.string;


public class UrlifyTest{
	public static void main(String[] args){
		  String str = "Mr John Smith        ";
		  
	        // Prints the replaced string
	        removeSpaces(str.toCharArray(), str.trim().length());
	    }


	public static void removeSpaces(char[] str,int trueLenght){
       int numberOfSpaces = countOfChar(str,0,trueLenght, ' ');
       //System.out.println("Number of spaces ======> "+numberOfSpaces);
       //System.out.println("TrueLength======>"+trueLenght);
       int newIndex = trueLenght - 1 + numberOfSpaces * 2;
       //System.out.println("newIndex ---->"+(newIndex+1));
       
       if(newIndex + 1 < str.length) str[newIndex + 1] = '\0';
      // System.out.println("Starting if loop------");
      // System.out.println(str.length);
       	
       for (int oldIndex = trueLenght - 1; oldIndex >= 0; oldIndex-- ) {
       		if (str[oldIndex] == ' ') {
       			str[newIndex] = '0';
       			str[newIndex - 1] = '2';
       			str[newIndex - 2] = '%';
       			newIndex = newIndex - 3;
       		} else {
       			str[newIndex] = str[oldIndex];
       			newIndex--;
       		}
       	}
	System.out.println(str);
	}

	public static int countOfChar(char[] str, int start, int end, int target){
		int count = 0;
		for (int i=start; i < end; i++ ) {
			if (str[i] == target) {
				count ++;
			}
		}
		return count;
	} 
}