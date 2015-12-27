import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Generator {
	
	//Number generator
	private Random rand = new Random();
	
	/*
	 * Each of these arrays corresponds to one of the fields for slack
	 */
	private Color columnBG;
	//menuBGH and activeItem will always be the same
	private Color menuBGH;
	private Color activeItem;
	private Color activeItemText = new Color(0,0,0); //Text should always be white
	private Color hoverItem;
	private Color textColor = new Color(0,0,0);
	private Color activePresence;
	private Color mentionBadge;

	
	
	public Generator(){
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		columnBG = new Color(r,g,b);
		activeItem = menuBGH = mentionBadge = generateSimilarColor(columnBG);
		
	}
	
	public Color generateSimilarColor(Color c){
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		
		//Normalize the color (mix)
		r = (r + c.getRed()) / 2;
        g = (g + c.getGreen()) / 2;
        b = (b + c.getBlue()) / 2;
        
        return new Color(r,g,b);

	}
	
	
}
