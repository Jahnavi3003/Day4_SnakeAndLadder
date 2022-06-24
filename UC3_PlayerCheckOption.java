package com.snakeandladder;
import java.util.Random;

public class UC3_PlayerCheckOption {
	public static final int NoPlay=0;
	public static final int Ladder=1;
	public static final int Snake=0;
	public static final int Position=0;
	
    public static int Dieroll() {
    	  int min = 1, max = 6;
		  int d=(int)(Math.random()*6 + 1);
		  System.out.println(d);
		  return d;
	}
    public class position {
    	int Position =0;
    }
 
    public static void main(String[] args) {
	 System.out.println("Enter your option:");
	 int pos = (int) Position.new position(); 
	 
	 int d=(int)(Math.random()*3);
	 switch (d) {
	 case 0:
		 System.out.println("Player position is" + pos);
		 break;
	 case 1:
		 pos = pos + Dieroll();
		 System.out.println("Player position is" + pos);
		 break;
	 case 2:
		 pos = pos - Dieroll();
		 System.out.println("Player position is" + pos);
	default:
		System.out.println("Invalid value");
	 } 
		  
 }
}

