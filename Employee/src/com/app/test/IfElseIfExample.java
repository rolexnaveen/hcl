package com.app.test;

public class IfElseIfExample {  
	public static void main(String[] args) {  
	    int marks = 100;  
	      
	    if(marks<50){  // 65 < 50 false
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60){  // 65 >= 50 true && 65 < 60 false | false
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70){  // 65 >= 60 true && 65 < 70 true | true
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80){  // 65 >= 70 false && 65 < 80 true | false
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  // 65 >= 80 false && 65 < 90 true | false
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100){  // 65 >= 90 false && 65 < 100 true | false
	        System.out.println("A+ grade");  
	    } else{  
	        System.out.println("Invalid!");  
	    }  
	}  
}  
