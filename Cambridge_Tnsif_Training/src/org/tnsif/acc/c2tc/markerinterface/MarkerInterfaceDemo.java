package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {
    public static void main(String[]args) {
    	Registerable s = new Student(12,"aadhya",20000,"Java programming");
    	Registerable s1 = new Student(13,"anil",30000,"Java programming");
     
    	 if(s instanceof Registerable)
    	 {
    		 System.out.println("Student is registered for this course");
    	 }
    	 else {
    		 System.out.println("student is not registered");
    	 }
    }
}
