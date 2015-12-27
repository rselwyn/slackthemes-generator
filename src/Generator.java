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
	private Color menuBGH;
	private Color activeItem;
	private Color activeItemText;; //Text should always be white
	private Color hoverItem;
	private Color textColor;
	private Color activePresence;
	private Color mentionBadge;

	
	
	//Constructor if no restrictions on color
	public Generator(){

	}
	
}
