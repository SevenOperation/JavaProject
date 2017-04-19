package BearbeitungsModule;


//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;



public class UeberpruefungWohnung {



static void UeberpruefungWonhungen(){
String wohn[] =new String [2];
wohn[0]= "12.03.2017-14.03.2017";
wohn[1]= "12.05.2017-15.05.2017";

String aber=wohn[0];

boolean a=false;
a=Kontrolle(wohn);
Ausgabe(a);
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
