/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caolanoh.mavenproject1;

/**
 *
 * @author caolanohagan
 */
public class BeerSong {
    public static void main (String [] args) {

        int beerNum = 99;
        String word = "bottles";
        
        while (beerNum > 0){
            
            //set word to singular for one bottle
            if(beerNum == 1 ){
                word = "bottle";
            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum =  beerNum -1;
            
            if (beerNum > 0 ){
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            }else{
               System.out.println("No more bottles of beer on the wall.");
            }
            
        }
}
    
}
