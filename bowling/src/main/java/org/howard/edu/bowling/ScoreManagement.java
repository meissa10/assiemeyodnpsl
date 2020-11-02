package org.howard.edu.bowling;



import java.util.Vector;

public class ScoreManagement {
	
	public ScoreManagement(String input) {
		this.input =input;
	}
	
	/**
	 * returned as final score with the get_score function
	 * returns -1 in case of wrong input
	 */
	private int  score = 0;
	
	
	/**
	 * input string stored in input
	 */
	private String input;
	
	/**
	 * Checks the validity of the input then returns true if its correct or false if it is not
	 * @return
	 */
	public boolean checkInput() {
		int num_frame = 0;
		String num_shot = "";
		for(int i = 0 ; i< input.length() ; i++) {
			if(input.charAt(i) != '-') {
				num_shot+= input.charAt(i);
			}
			else {
				num_frame += 1;
				if(num_shot.length()>2 ||num_shot.length()<1) {
					return false;
				}
				
				for(int  j = 0  ; j<num_shot.length();  j ++) {
					if(num_shot.charAt(0) == 'X') {
						if(j+1<num_shot.length()) {
							if(num_shot.charAt(1) != '-') {
								return false;
							}
						}
						break;
					}
					else {
						if((Character.getNumericValue(num_shot.charAt(1))+Character.getNumericValue(num_shot.charAt(0)))>10) {
							return false;
						}
						break;
						
					}
					
				}
				
				
				
				num_shot = "";	
			}
			
		}
		if(num_frame != 9) {
			return false;
		}
		return true;
	}
	
	
	
	
	/**
	 * compute and returns the total score.
	 * if the input is in the wrong format, returns -1.
	 */
	public int get_score() {
		
		if(!checkInput()) {
			return -1;
		}
		
		
		int frame_count  = 0;
		for( int i = 0; i<input.length(); i++ ) {
			
			if(frame_count  == 9) {
				if(input.charAt(i)=='X') {
					score+=10;
					
					if(input.charAt(i+1)=='X') {
						score+=10;
						if(input.charAt(i+2)=='X') {
							score+=10;
						}
						else {
							score+=  Character.getNumericValue(input.charAt(i+2));
						}
					}
					else {
						score+=  Character.getNumericValue(input.charAt(i+1));
						if(input.charAt(i+2)=='X') {
							score+=10;
						}
						else if(input.charAt(i+2)=='/') {
							score+=  10- Character.getNumericValue(input.charAt(i+1));
						}
						else {
							score+=  Character.getNumericValue(input.charAt(i+2));
						}
						
					}
				}
				else {
					if(input.charAt(i+1)=='/') {
						score+=10;
						if(input.charAt(i+2)=='X') {
							score+=10;
						}
						else {
							score+= Character.getNumericValue(input.charAt(i+2));
						}
					}
					else {
						score+= Character.getNumericValue(input.charAt(i+1)) + Character.getNumericValue(input.charAt(i));
					}
				}
				break;
			}
			if(input.charAt(i) == 'X') {
				score+=10;
				if(input.charAt(i+2) == 'X') {
					score+=10;
					if(input.charAt(i+4) == 'X') {
						score+=10;	
					}
					else {
						score += Character.getNumericValue(input.charAt(i+4));
					}
						
				}
				else{
					score+= Character.getNumericValue(input.charAt(i+2));
					if(input.charAt(i+3) != '/') {
						score+= Character.getNumericValue(input.charAt(i+3));
					}
					else {
						score+= 10- Character.getNumericValue(input.charAt(i+2));
					}
				}
			
				
			}
			else if(input.charAt(i) == '/') {
				continue;
				
			}
			else if( input.charAt(i) == '-') {
				frame_count+=1;
				
			}
			
			else {
				if(input.charAt(i+1)== '/') {
					score+= 10;
					if(input.charAt(i+3)== 'X') {
						score += 10;
					}
					else {
						score += Character.getNumericValue(input.charAt(i+3));
					}
				}
				else {
					score+= Character.getNumericValue(input.charAt(i)) + Character.getNumericValue(input.charAt(i+1));
				}
				
				
				i+=1;
			}
			//System.out.println(score);
		}
		return score;
	}
}