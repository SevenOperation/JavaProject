package BerechnungsModule;

import EingabeModule.ArrayEinlesen;

public class Datumdifferenz {
	
	public static String statistik(int wohn){
		double monatstage = (double)365 / 12;
		
		double gebuchtetage;
		String [][][] wohnungen = ArrayEinlesen.readWohnungen();
		for (int i = 0; i < wohnungen[wohn].length; i++){
		String [] zeitraum = wohnungen[wohn][i][3].split("-");
		String [] datum1 = zeitraum[0].split("\\.");
		String [] datum2 = zeitraum[1].split("\\.");
		if(datum1[1].equals(datum2[1])){
		gebuchtetage = Integer.parseInt(datum2[0]) - Integer.parseInt(datum1[0]);
		}else{
		 gebuchtetage = Double.parseDouble(datum2[0]) - (Double.parseDouble(datum1[0]) - monatstage);
		}
		return "" + gebuchtetage / 365 * 100;
		}
		return null; 
				
	}

}
