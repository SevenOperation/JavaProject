package BearbeitungsModule;

public class Registrierenuberpruefung {
   public boolean registrierDatenPruefen(String [][] benutzer, String vorname, String nachname){
	   if(benutzer != null){
		   for(int i = 0; i < benutzer.length; i++){
			   if(vorname.equals(benutzer[0]) && nachname.equals(benutzer[1])){
				   return false;
			   }
		   }
		   return true;
	   }
	   return true;
   }
}
