import java.util.*;
/** PROGRAMMKOPF
  * Kundendaten Modul
  *
  * @version 1.0 vom 25.11.2016
  * 
  * Klasse: FS 63
  * Name: Lukas W�stenhagen
  *
  PROGRAMMKOPF ENDE*/

public class Modul_Kundendaten {  
  public static void main(String[] args) {  // Beginn der Hauptfunktion
    int Auswahl;
    int AnzahlKunden = 50;
    int Eintr�ge = 3;
    String Kundendaten[ ][ ] = new String[AnzahlKunden][Eintr�ge]; //Vorname, Nachname, Adresse
    do {
      System.out.println("Bitte W�hlen Sie eine Option aus."); //Schreibt den gegebenen Text
      System.out.println("1. F�r Eingabe neuer Kundendaten");
      System.out.println("2. Zum Ver�ndern von Kundendaten.");
      System.out.println("3. F�r Ausgabe eines bestimmter Kundendaten.");
      System.out.println("4. F�r die Ausgabe aller Kundendaten.");
      System.out.println("5. Zum Beenden des Programms.");
      Auswahl = Tastatur.liesInt(); 
      
      switch (Auswahl) {
        case  1:
          if (Eintr�ge >= AnzahlKunden) {
            System.out.print("Zu viele Eintr�ge.");
          } // end of if
          else {
            int k = 0;
            while (Kundendaten[k][0] != null) {            
              k++;
            } // end of while
            
            for (int i=0;i<3;i++) {
              switch (i) {
                case  0: 
                  System.out.print("Bitte geben Sie den Vornamen ein: ");
                  Kundendaten[k][i] = Tastatur.liesString();
                break;
                case  1: 
                  System.out.print("Bitte geben Sie den Nachnamen ein: ");
                  Kundendaten[k][i] = Tastatur.liesString();
                break;
                case  2: 
                  System.out.print("Bitte geben Sie die Adresse ein: ");
                  Kundendaten[k][i] = Tastatur.liesString();
                break;
                default: 
              
              } // end of switch
            } // end of for
            
            Eintr�ge++;
          } // end of if-else
          break;
        case  2:
          System.out.print("Bitte geben Sie den Datensatz ein den Sie ver�ndern wollen: ");
          int Ausgabewahl2 = Tastatur.liesInt()-1;
          if (Ausgabewahl2 > AnzahlKunden) {
            System.out.print("Datensatz nicht vorhanden.");
           } // end of if
          else {
            if (Kundendaten[Ausgabewahl2][0] != null) {
              for (int i=0;i<3 ;i++ ) {
                System.out.println("\n"+(Ausgabewahl2+1)+". "+Kundendaten[Ausgabewahl2][i]);
              } // end of for
            } // end of if
             
            for (int i=0;i<3;i++) {
              switch (i) {
                case  0: 
                  System.out.print("Bitte geben Sie den Vornamen ein: ");
                  Kundendaten[Ausgabewahl2][i] = Tastatur.liesString();
                break;
                case  1: 
                  System.out.print("Bitte geben Sie den Nachnamen ein: ");
                  Kundendaten[Ausgabewahl2][i] = Tastatur.liesString();
                break;
                case  2: 
                  System.out.print("Bitte geben Sie die Adresse ein: ");
                  Kundendaten[Ausgabewahl2][i] = Tastatur.liesString();
                break;
                default: 
              
              } // end of switch
            } // end of for 
          }
          break;
        case  3:
          System.out.print("Bitte geben Sie den Datensatz ein: ");
          int Ausgabewahl = Tastatur.liesInt()-1;
          if (Ausgabewahl > AnzahlKunden) {
            System.out.print("Datensatz nicht vorhanden.");
           } // end of if
          else {
            for (int i=0;i<3 ;i++ ) {
              System.out.println("\n"+(Ausgabewahl+1)+". "+Kundendaten[Ausgabewahl][i]);
            } // end of for
          } // end of if-else
          break;
        case  4:
          System.out.println();
          for (int t=0;t<AnzahlKunden; t++) {
            if (Kundendaten[t][0] != null) {
              for (int i=0;i<3;i++) {
                System.out.println((t+1)+". "+Kundendaten[t][i]);
              } // end of for
              System.out.println("____________________");
            } // end of if
          } // end of for
          
          break;
        default: 
        System.out.println("\nKeine g�ltige Eingabe!");
      } // end of switch
    } while (Auswahl != 5); // end of do-while
    
    //return Kundendaten;
  } // Ender der Hauptfunktion
} // end of class EAngestellte
