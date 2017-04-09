package EingabeModule;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ArrayEinlesen {
	public static String[][] readBenutzer(){
		 ObjectInputStream is;
		 String [][] benutzerarray = null;
	     try {
	         is = new ObjectInputStream(new FileInputStream("benutzer.txt"));
	         if(is.readObject() != null){
	         benutzerarray = (String[][]) is.readObject();
	         }
	         is.close();
	         return benutzerarray;

	     }
	     catch (FileNotFoundException e1) {
	         e1.printStackTrace();
	         return null;
	     }
	     catch (IOException e1) {
	         //e1.printStackTrace();
	         return null;
	     }
	     catch (ClassNotFoundException e) {
	         e.printStackTrace();
	         return null;
	     }
	    
	  }
	 public static String[][][] readWohnungen(){
		 ObjectInputStream is;
		 String [][][] wohungsarray;
	     try {
	         is = new ObjectInputStream(new FileInputStream("wohnungen.txt"));
	         wohungsarray = (String[][][]) is.readObject();
	         is.close();
	         return wohungsarray;

	     }
	     catch (FileNotFoundException e1) {
	         e1.printStackTrace();
	         return null;
	     }
	     catch (IOException e1) {
	         e1.printStackTrace();
	         return null;
	     }
	     catch (ClassNotFoundException e) {
	         e.printStackTrace();
	         return null;
	     }
	  } 
	
	 public static String[][] readKatalog(){
		 ObjectInputStream is;
		 String [][] katalogArray;
	     try {
	         is = new ObjectInputStream(new FileInputStream("katalog.txt"));
	         katalogArray = (String[][]) is.readObject();
	         is.close();
	         return katalogArray;

	     }
	     catch (FileNotFoundException e1) {
	         e1.printStackTrace();
	         return null;
	     }
	     catch (IOException e1) {
	         e1.printStackTrace();
	         return null;
	     }
	     catch (ClassNotFoundException e) {
	         e.printStackTrace();
	         return null;
	     }
	  } 
	
	
}
