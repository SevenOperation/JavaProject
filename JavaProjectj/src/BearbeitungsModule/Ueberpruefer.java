package BearbeitungsModule;

public class Ueberpruefer {
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
	
	public boolean hausAnlegenUeberpruefen(String preis, String groeße){
		try{
		double preisD = Double.parseDouble(preis);
		double groeßeD = Double.parseDouble(groeße);
		if(preisD > 1 && groeßeD > 10){
			return true;
		}else{
			return false;
		}
		}catch(Exception e){
			return false;
		}
	   }
	
	public boolean loginUberpruefung(String [][] benutzer, String vorname, String nachname){
		if(benutzer != null){
		for(int i = 0; i < benutzer.length; i++){
			if(benutzer[i][0].equals(vorname) && benutzer[i][1].equals(nachname)){
				return true;
			}
		}
		}
		return false;
	}
	
	public boolean wohungLoeschenUeberpruefung(String [][][] wohnungen, int wohnung){
		if(wohnungen != null){
			if(wohnungen[wohnung] != null && wohnungen[wohnung].length == 0){
				return true;
			}
		}
		return false;
	}
}
