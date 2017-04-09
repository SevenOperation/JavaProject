package Hauptprogramm;

import EingabeModule.ArrayEinlesen;
import EingabeModule.Benutzer;
import EingabeModule.Buchen;
import EingabeModule.Wohnung;

public class Start {
 public static void main(String args[]){
	 String[][] benutzer = ArrayEinlesen.readBenutzer();
	 benutzer = Benutzer.benutzerRegistrieren(benutzer, "Seven", "Operation", "Schloﬂstrasse 7");
	 String[][] katalog = ArrayEinlesen.readKatalog();
	 katalog = Wohnung.wohnungAnlegen(katalog, "180", "Kleines 1 Familien Haus", "23", "leckmichamarsch.png");
	 String[][][] wohnungen = null;
	 Buchen.buchen(wohnungen, 0, "23.8.2017", benutzer[0][0], benutzer[0][1]);
 }
}
