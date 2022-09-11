/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01taubaniqued;

/**
 *
 * @author boy
 */
public class Ex01TauBaniqued {

    public static void main(String[] args) {
        //self introduction
        String name = "Marky Miguel C. Baniqued";
        String faveGame = "Wild Rift";
        String wrMains = "Sona and Orianna";
        
        //sona stats
        int totalMatch1 = 84;
        double winRate1 = 64.3;
        int mastery1 = 4;
        
        //orianna stats
        int totalMatch2 = 84;
        double winRate2 = 54.8;
        int mastery2 = 4;
        
        System.out.print ("Self Introduction");
        System.out.printf ("%nName: %s", name);
        System.out.printf ("%nFavorite Game: %s", faveGame);
        System.out.printf ("%nWild Rift Mains: %s", wrMains);
        
        System.out.printf ("%n%nSona Stats");
        System.out.printf ("%nTotal Matches: %s", totalMatch1);
        System.out.printf ("%nWin Rate: %s", winRate1);
        System.out.print ("%");
        System.out.printf ("%nMastery Level: %s", mastery1);
        
        System.out.printf ("%n%nOrianna Stats");
        System.out.printf ("%nTotal Matches: %s", totalMatch2);
        System.out.printf ("%nWin Rate: %s", winRate2);
        System.out.print ("%");
        System.out.printf ("%nMastery Level: %s", mastery2);
        
        System.out.printf ("%n%nHow much more matches do I have with Sona than with Orianna?: %s", 
        totalMatch1 - totalMatch2);
        System.out.printf ("%nIs my Sona Win Rate higher than my Orianna's?: %s", winRate1 > winRate2);
        System.out.printf ("%nIs my Sona Mastery Level higher than my Orianna's?: %s", mastery1 > mastery2);
    }
}
