/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01taubaniqued;

/**
 *
 * @author TAU
 */
public class Ex01TauBaniqued {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //self introduction
        String name = "Marky Miguel C. Baniqued";
        int age = 15;
        String hobbies = "Drawing, playing games (such as Wild Rift, Valorant, and maybe Genshin), and talking to friends!";
        
        //academic information
        int yrsPisay = 4;
        String secPisay = "10 - Tau";
        String faveSub = "ADTech";
        
        //goals and aspirations
        double csGrade = 1.75;
        String csExpect = "To have fun with the subject and learn enough to maybe consider it as a possible career path.";
        String pisayExpect = "To (hopefully) pass with flying colors, and score a boyfriend EME SHSHSH.";
        
        System.out.print ("Self Introduction");
        System.out.printf ("%nName: %s", name);
        System.out.printf ("%nAge: %s", age);
        System.out.printf ("%nHobbies: %s", hobbies);
        
        System.out.printf ("%n%nAcademic Information");
        System.out.printf ("%nYears in Pisay: %s", yrsPisay);
        System.out.printf ("%nSection: %s", secPisay);
        System.out.printf ("%nFavorite Subject %s", faveSub);
        
        System.out.printf ("%n%nGoals and Expectations");
        System.out.printf ("%nExpected CS Grade: %s", csGrade);
        System.out.printf ("%nCS Expectations: %s", csExpect);
        System.out.printf ("%nPisay Expectations: %s", pisayExpect);
        
        System.out.printf ("%n%nYears without Pisay (so far): %s", age - yrsPisay);
        System.out.printf ("%n", name);
        
    }
    
}
