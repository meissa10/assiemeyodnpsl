package lsp_midterm;

import java.util.*;


public class SongsDatabase {
	
	
	private Map<String, Set<String>> genreMap = new HashMap<String, Set<String>>();
	
    public void addSong(String genre, String songTitle) {
        
    	if(genreMap.containsKey(genre)){
    		
    		
            genreMap.get(genre).add(songTitle);
            
            
        }
    	
    	else{
            
            Set<String> newGenre = new HashSet<String>();
            
            newGenre.add(songTitle);
            
            genreMap.put(genre,newGenre);
            
            
        }
    }
    
    
    
    
    public Set<String> getSongs(String genre) {
    	
    	return genreMap.get(genre);
        
    }
    
    
    
    public String getGenreOfSong(String songTitle) {
    	
    	 for (Map.Entry<String, Set<String>> song:genreMap.entrySet()) {
    		 
             
             if(song.getValue().contains(songTitle)){
            	 
            	 
                 return song.getKey();
                 
             }
         
         }

         return " No Genre was found";
       
    	
    }
}

