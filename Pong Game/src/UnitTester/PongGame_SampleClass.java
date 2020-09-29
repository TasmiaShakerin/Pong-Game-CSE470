package UnitTester;


public class PongGame_SampleClass {
	 public boolean keyPressedUp(String e){
	    	boolean up_pressed=false;
	        if (e.equals("w"))
	        {
	            up_pressed = true;
	        }
	        return up_pressed;
	 }
	 public boolean keyPressedDown(String e){
	    	boolean down_pressed=false;
	        if (e.equals("s"))
	        {
	            down_pressed = true;
	        }
	        return down_pressed;
	 }
	 public boolean keyReleasedUp(String e){
	    	boolean up_pressed=true;
	        if (e.equals("w"))
	        {
	            up_pressed = false;
	        }
	        return up_pressed;
	 }
	 public boolean keyReleasedDown(String e){
	    	boolean down_pressed=true;
	        if (e.equals("s"))
	        {
	        	down_pressed = false;
	        }
	        return down_pressed;
	 }
	 public int SetPaddle_y(int y, String s){
		 int newY = y;
		 if (s.equals("w"))
         {
             newY = y-2;
         }
		 if (s.equals("s"))
         {
             newY = y+2;
         }
	        return newY;
	 }
	 public String ShowMessage(int ball_x) {
		 String message = "";
         if (ball_x == 1 || ball_x == 790)
         {  
             message = "You Lost. Enter your name for the high score list! Restarting soon!";
         }
		 return message;
	 }
	 public int[] addScore(int[] highScoresPanel, int newScore) {
		 for (int i=0; i<10; i++)
	        {
	            if (newScore > highScoresPanel[i])
	            {
	                for (int j=9; j>i; j--)
	                {
	                	highScoresPanel[j] = highScoresPanel[j-1];
	                    
	                }                
	                highScoresPanel[i] = newScore;
	                
	                break;
	            }
	            
	        }
		 for (int i = 0; i < highScoresPanel. length; i++) {
			 System. out. print(highScoresPanel[i] + " ");
		 
		 }
		 return highScoresPanel;
	
	 }
}
