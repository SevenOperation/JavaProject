package BearbeitungsModule;



//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;



public class UeberpruefungWohnung {



static void UeberpruefungWonhungen(){
String wohn[] =new String [2];
wohn[0]= "12.03.2017-14.03.2017";
wohn[1]= "12.05.2017-15.05.2017";

String aber=wohn[0];

boolean a=false;
//0a=Kontrolle(wohn);
//Ausgabe(a);
datumsValidierung();
}
//Kleine Method zur Datumsvalidierung als hilfestellung #MirwarLangweillig
public static void datumsValidierung(){
	Scanner sc = new Scanner(System.in);
	String d = sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
	sdf.setLenient(false);
	try {
		Date date = sdf.parse(d);
		System.out.println(sdf.parseObject(d));
		if(date.after(new Date())){
		
			System.out.println("Ihre Datum eingabe war richtig");
			date.after(new Date());
		}
		
	} catch (ParseException e) {
		System.out.println("Datum ist nicht richtig");
	}
	
}

public static boolean Kontrolle(String wohn[]){
Scanner sc = new Scanner(System.in);	
String test;
//String datum[]= wohn[0].split("-");
//
//test=datum[1];	
// DateFormat df=new SimpleDateFormat("dd.MM.yyyy");

boolean a=false;
//
System.out.println( "Eingabe Datum");
test=sc.next();



	


for(int i=0;i<wohn.length;i++){
if(wohn[i].equals(test)){
	 a=true;
}

}
return a;
}

public static void Ausgabe(boolean b){
 if(b==false){
	System.out.println("Wohnung sind Frei");
	}else
		System.out.println("Wonhungen sind zu dem angegeben Zeitpunkt belegt");
	
}	
	
}
