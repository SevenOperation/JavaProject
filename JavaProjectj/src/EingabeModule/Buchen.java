package EingabeModule;

import AusgabeModule.ArraySpeichern;

public class Buchen {
 public static void suchenZeitraum(String zeitraum){
	// warte auf methode zur überpruefung welche frei sind
 }
 
 //Methode zum festlegen einer Buchung schreibt die daten in das wohnungen array
 public static void buchen(String[][][] wohnungen, int wohnung,String zeitraum , String vorname, String nachname){
	  String[][] katalog = ArrayEinlesen.readKatalog();
	 if(wohnungen == null || wohnungen[wohnung] == null && katalog[wohnung] != null){
		  return;
	  }
	     String[][][] buffer = new String [wohnungen.length][][];
	     for(int i = 0; i < wohnungen.length; i++){
	    	 if(i == wohnung){
	    	 buffer[i] = new String[wohnungen[i].length][4];
	    	 for(int x = 0; x < wohnungen[i].length; x++){
		    	   buffer[i][x] = wohnungen[i][x];
		     }
	    	 }
	    	 buffer[i] = wohnungen[i];
	       
	     }
		buffer[wohnung][buffer[wohnung].length][0] = vorname;
		buffer[wohnung][buffer[wohnung].length][1] = nachname;
		buffer[wohnung][buffer[wohnung].length][2] = vorname;
		buffer[wohnung][buffer[wohnung].length][0] = null; //Warte auf methode zum Preisausrechenen
		wohnungen = buffer;
	 
		ArraySpeichern.save(wohnungen);
	 }
}
