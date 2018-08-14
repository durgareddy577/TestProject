package com.durga;

import java.awt.PageAttributes.PrintQualityType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class IdenticalArrays 
  {
	   public static void main(String[] args) 
	   {
		    int a[]=new int[10];
		    for(int i=9;i>=0;i--)
		    {
		    	  a[i]=i+1;
		    }
		    
		    Arrays.sort(a);
		    for(int b:a)
		    {
		    	System.out.println(b);
		    }
		   
	   }

	
	

  }

	


