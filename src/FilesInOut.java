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
			writer1 = new PrintWriter(new File("C:\\Users\\johno_9297evi\\OneDrive\\Documents\\CSCU9A3\\Practical_1\\Checkpoint4\\src\\output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        writer1.write("allison wesley 28011990\r\n"
        		+ "peter smith 05071992\r\n"
        		+ "sophie brown 08071980\r\n"
        		+ "emily wilson 01111976\r\n"
        		+ "jack thomson 04101981\r\n"
        		+ "olivia robertson 12021995\r\n"
        		+ "lewis campbell 24101983\r\n"
        		+ "daniel stewart 06091998\r\n"
        		+ "lucy scott 08122003\r\n"
        		+ "isla murray 26072000\r\n"
        		+ "james clark 31101087\r\n"
        		+ "lily mitchell 08051999\r\n"
        		+ "harry gray 22081978\r\n"
        		+ "amelia young 18041988");                                                   
                        writer1.flush();  
        writer1.close();  
        

    }// main
    
} // FilesInOut
