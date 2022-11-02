package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Partialexceptionhandling {
	public static void main(String[] args)
    {
        
        System.out.println("program execution strarted..");
        
        String fileName = "d://src//abstractexample//AbstractEx.java";
        
        //Exception Handle in Main Due to "Throws" (Koi bhi exception hoga voh aa jayega niche code sai)
        try
        {
        readFromFile(fileName);
        }
        catch(FileNotFoundException e)
        {
         //e.printStackTrace();    
            System.err.println("remaining handling of exception in main function:There is some issue while opening a file:AbstractEx.java");
        }
        catch(IOException e)
        {
            //e.printStackTrace();
            System.err.println("remaining handling of exception in main function:File opened successfully but there's some issue while reading from a file:AbstractEx.java");
        }
        System.out.println("remaining program of main method executes..");
    }
    
    //handle or declare
    public static void readFromFile(String f) throws FileNotFoundException,IOException
    {
       FileReader fr=null;
        
        try
        {
           fr = new FileReader(f);
        
          //This will not execute if we are having any error above 
          System.out.println("file opened successfully..starting to read from the file");
          System.out.println((char)fr.read());
        
         
        }
        catch(FileNotFoundException e)
        {
            System.err.println("partially handling exception here:readFromFile function:"+e.getMessage());
            
            
           //Yaha hum explicitly exception throw kr rhe hai (Voh handle uppar calling pai ho jayega)
            throw e; //rethrowing the same exception 
            
            //throw new IOException();
            //throw new ArithmeticException();
            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
        
        System.out.println("inside finally..");
        
        
        
        try
        {
            
        System.out.println("checking and attempting to close the file resource..");
        if(fr!=null)    
          fr.close();
          
        }
        catch(IOException e)
        {
            //e.printStackTrace();
            
            System.out.println("problem while closing a file");
            
        }
      }  //end of finally
        
    System.out.println("remaining program of the readFromFile function  after close file continues..");
    }

}
