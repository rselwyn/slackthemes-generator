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
	
	
	/*
	 * Constructor if restrictions on the colors
	 * @param	rlow: The low value of the range for the red value
	 * @param	rhigh: The high value of the range for the red value
	 * @param	glow: The low value of the range for the green value
	 * @param	ghigh: The high value of the range for the green value
	 * @param	blow: The low value of the range for the blue value
	 * @param	glow: The high value of the range for the blue value
	 */
	public Generator(int rlow, int rhigh, int glow, int ghigh, int blow, int bhigh){

		
	}
	
	public int generateValidValue(int lowRange, int highRange){
		return rand.nextInt(highRange-lowRange)+lowRange;
	}
	
}
