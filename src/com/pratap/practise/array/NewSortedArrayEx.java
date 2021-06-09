package com.pratap.practise.array;

import java.util.Arrays;

public class NewSortedArrayEx{
 public static void main(String[] args){
 
  int[] arrayNumber = {5,2,4,6,1,3};
  int[] sortedArray = sortingArray(arrayNumber);
  System.out.println(Arrays.toString(sortedArray));
  for(int i=0; i < sortedArray.length;i++){
    System.out.println("Sorted array :"+sortedArray[i]);
  }
  System.out.println("This is test");
 }
 
 public static int[] sortingArray(int[] array){
  	int key=0;
  	for(int j=1; j < array.length; j++){
  		key = array[j];
  	    int i = j -1;
  	 	while(i >= 0 && array[i] > key){
  	 		array[i+1] = array[i];
  	 		i = i - 1;
  	 	}
  	 	
  	 	array[i + 1] = key;
  	}
  	return array;
 }
}
