/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *991638866
*/
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * Edited by Brandon Bennie
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit(" Diamonds");
        
        Card rand = new Card("Hrts", 11); 
        rand.setSuit("Hearts");
        System.out.println(rand);
        
        Card rand2 = new Card("Dim", 3);
        rand2.setSuit("Clubs");
        System.out.print(rand2);
        
        
    }
}
