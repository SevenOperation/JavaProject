package BearbeitungsModule;

import java.util.Scanner;

public class UeberpruefungWohnung {



static void UeberpruefungWonhungen(){
String wohn[] =new String [2];
wohn[0]= "12.3.2017";
wohn[1]= "12.5.2017";
boolean a=false;
a=Kontrolle(wohn);
Ausgabe(a);
}

public static boolean Kontrolle(String wohn[]){
String test;
boolean a=false;
Scanner sc = new Scanner(System.in);		
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
