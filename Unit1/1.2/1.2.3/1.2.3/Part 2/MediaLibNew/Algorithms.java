
/**
 * Write a description of class Algorithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Algorithms
{ 
    public static void main(){
       Song[] topTenSongs =  {
            new Song("The Twist",2),
            new Song("Smooth",2),
            new Song("Mack the Knife",2),
            new Song("How do I live",7),
            null,
            new Song("Party rock anthem",4),
            new Song("I gotta feeling",2),
            new Song("Macarena",6),
            new Song("Physical",4),
            new Song("You light up my life",2),
            new Song("Hey Jude",2),
    
                             };
        System.out.println("---Before---");                   
        for (int i = 0; i <= topTenSongs.length -1; i++){
            if (topTenSongs[i] != null) {
                System.out.print("" + i);
                System.out.println("  " + topTenSongs[i].getTitle());
                
            }
            else{
                System.out.print("" + i);
                System.out.println("  null");
            }
        }   
        ///
        ///
      // System.out.println("Best song: " + bestSongs(topTenSongs));
      // System.out.println("Worst song: " + worstSongs(topTenSongs));
      // countSecond(topTenSongs);
       // arrange(topTenSongs, "Macarena");
        insert(topTenSongs, new Song("Time",7),1);
    }
    public static String bestSongs(Song[] topTenSongs){
        int index = 0;
        int bestSoFar = topTenSongs[0].getRate();
        for (int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() < bestSoFar) {
                bestSoFar = topTenSongs[i].getRate();
                index = i;
            }
        }
        return topTenSongs[index].getTitle();
    }    
    public static String worstSongs(Song[] topTenSongs){
        int index = 0;
        int bestSoFar = topTenSongs[0].getRate();
        for (int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() > bestSoFar) {
                bestSoFar = topTenSongs[i].getRate();
                index = i;
            }
        }
        return topTenSongs[index].getTitle();
    }
    /*  public static String countSecond(Song[] topTenSongs){
        int index = 0;
        int bestSoFar = topTenSongs[0].getRate();
        int secondBest = bestSoFar +1 ;
        ArrayList second = new ArrayList();
        for (int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() < bestSoFar) {
                bestSoFar = topTenSongs[i].getRate();
                index = i;
            }
        }
        for(int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() <= secondBest && topTenSongs[i].getRate() > bestSoFar  ) {
                if(topTenSongs[i].getRate() < secondBest){
                    second.clear();
                }    
                secondBest = topTenSongs[i].getRate();
                index = i;
                second.add(topTenSongs[i].getTitle());
                
            }
        }
        String format = second.toString()
        .replace("[", "") 
        .replace("]", "") 
        .trim();     
        return format;
        */    
   
    public static void countSecond(Song[] topTenSongs){
        int bestSoFar = topTenSongs[0].getRate();
        int secondBest = (bestSoFar * 10);
        for (Song secondNum : topTenSongs) {
            if (secondNum.getRate() < bestSoFar) {
                bestSoFar = secondNum.getRate();
            }
        }
        for (Song secondNum : topTenSongs) {
            if (secondNum.getRate() < secondBest && secondNum.getRate() > bestSoFar  ) {
                secondBest = secondNum.getRate();
            }    
        } 
        for (Song secondNum : topTenSongs) {
            if (secondNum.getRate() == secondBest) {
                System.out.println("Second best song(s)" + secondNum.getTitle());
            }
        }
    }
    public static void arrange(Song[] topTenSongs, String title){
        System.out.println("---After---");
        int index1 = 0;
        for (int i = 0; i <= topTenSongs.length -1; i++){
            if(title.equals(topTenSongs[i].getTitle())){
                topTenSongs[i] = null;
            }
        }
        for (int i = 0; i <= topTenSongs.length -1; i++ ){
            if(topTenSongs[i] == null){
                index1 = i;
            }
        }
        for (int index = index1; index <= topTenSongs.length -2; index++ ){
            topTenSongs[index] = topTenSongs[index+1];
        }
        topTenSongs[topTenSongs.length-1] = null;
         for (int i = 0; i <= topTenSongs.length -1; i++){
            if (topTenSongs[i] != null) {
                System.out.print("" + i);
                System.out.println("  " + topTenSongs[i].getTitle());
                
            }
            else{
                System.out.print("" + i);
                System.out.println("  null");
            }
        }
    
    }
        public static void insert(Song[] topTenSongs, Song insert, int index){
        System.out.println("---After---");
        int index1 = 0;
        for (int i = 0; i <= topTenSongs.length -1; i++ ){
            if(topTenSongs[i] == null){
                index1 = i;
            }
        }
        for (int i = index1; i <= topTenSongs.length -2; i++ ){
            topTenSongs[i] = topTenSongs[i+1];
        }
        topTenSongs[topTenSongs.length-1] = null;
        for (int i  = topTenSongs.length - 2;  i >= index; i-- ){
            topTenSongs[i+1] = topTenSongs[i];
        }
        topTenSongs[index] = insert;
         for (int i = 0; i <= topTenSongs.length -1; i++){
            if (topTenSongs[i] != null) {
                System.out.print("" + i);
                System.out.println("  " + topTenSongs[i].getTitle());
                
            }
            else{
                System.out.println("null");
            }
        }
    
    }
}