package com.EndieFirstProje;

public class Song {
   
private String title;
private String artist;
private String album;
   private String genre;


    
    public Song (String title,String artist,String album, String genre ) {
    
   this.title = title;
    this.artist = artist;
     this.album = album;
    this.genre = genre;
   
    
    
}

    
   public String getTitle() {
      
      return title;
   }
    
    public String getArtist() {
      
      return artist;
   }
   
   public String getAlbum() {
      
      return album;
   }
    
    public String getGenre() {
      
      return genre;
   }
   
   
   
   public void displayInfo () {
      
      System.out.println( " title " + title);
      System.out.println( " artist " + artist);
      System.out.println( " album " + album);
      System.out.println( " genre " + genre);
      
      
      
      
      
   }
   
   
   
   
   
   
   
   
   
    
    
    
    
    
    
} 
    
    

