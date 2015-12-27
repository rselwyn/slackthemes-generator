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
	private Color textColor;
	private Color activePresence;
	private Color mentionBadge;

	
	
	public Generator(){
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		menuBGH = new Color(r,g,b);
	}
	
	public Color generateSimilarColor(Color c){
		return null;
	}
	
	
}
