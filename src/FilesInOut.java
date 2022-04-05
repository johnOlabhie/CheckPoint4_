import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.
    	File input = new File("C:\\Users\\johno_9297evi\\OneDrive\\Documents\\CSCU9A3\\Practical_1\\Checkpoint4\\src\\input.txt");
    	File inputm = new File("inputm.txt");
        File output = new File("output.txt");
    	
        
        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.
      
        try {
    	      File myObj = new File("C:\\Users\\johno_9297evi\\OneDrive\\Documents\\CSCU9A3\\Practical_1\\Checkpoint4\\src\\input.txt");
    	      Scanner myReader = new Scanner(myObj);  
    	      while (myReader.hasNextLine()) {
    	        String data = myReader.nextLine();
    	        
    	        System.out.println(data);
    	      }myReader.close();
    	    } catch (FileNotFoundException e) {
    	        System.out.println("An error occurred.");
    	        e.printStackTrace();
    	      } 
        
        
        
            
        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.
        
        PrintWriter writer1 =null;      
        try {
			writer1 = new PrintWriter(new File("C:\\Users\\johno_9297evi\\OneDrive\\Documents\\CSCU9A3\\Practical_1\\Checkpoint4\\src\\input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        writer1.write("C:\\Users\\johno_9297evi\\OneDrive\\Documents\\CSCU9A3\\Practical_1\\Checkpoint4\\output.txt");                                                   
                        writer1.flush();  
        writer1.close();  
        

    }// main
    
} // FilesInOut
