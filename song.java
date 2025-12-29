

public class song {
    
    private String title;
    private String artist;
    private int duration;
    
    // constructor
    
    public song (String t,String a, int d) 
    {
       title = t;
        artist = a;
       duration = d;
        
    }
        
      public String  getTitle ()
        {
            
         return title;   
            
        }
        public  String  getArtist ()
        {
            
         return artist;   
            
        }
    public int getDuration()
        {
            
         return duration;   
            
        }
        
        
        public String  toString() {
            return title + " by " + artist;
        
        }
        
        
        public static void main ( String []args)

    {
        
        songg sprinter = new song( "sprinter","central cee",229);
        
        System.out.println(sprinter);
        
        
    }
    
    
}
    
}
   
    
    
    
    
    
    
    
    
    
