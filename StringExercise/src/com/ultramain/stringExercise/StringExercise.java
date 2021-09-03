package com.ultramain.stringExercise;
import java.io.FileWriter;

public class StringExercise {
//	public class FileWriterExample {  
    public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("F:\\ultramain\\New folder\\assignment.txt");    
          fw.write("Welcome to Java World");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println(" File Written Successful...");    
         System.out.println("------------------------------");
         {
 	        String s1 = "This is String Buffer";
 	 
 	        // s1 is not changed
 	        concat1(s1);
 	        System.out.println("String: " + s1);
 	 
 	        StringBuilder s2 = new StringBuilder("Object");
 	 
 	        // s2 is changed
 	        concat2(s2);
 	        System.out.println("StringBuilder: " + s2);
 	 
 	        StringBuffer s3 = new StringBuffer("Object");
 	 
 	        // s3 is changed
 	        concat3(s3);
 	        System.out.println("StringBuffer: " + s3);
 	    }

    }
    public static void concat1(String s1)
    {
        s1 = s1 + "this is a String Buffer";
    }
 
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append(" this is a String Buffer");
    }
 
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append(" this is a String Buffer");
    }
 
 //   public static void main(String[] args)

}
