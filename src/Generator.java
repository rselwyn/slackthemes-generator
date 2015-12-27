import java.util.ArrayList;
import java.util.Random;

public class Generator {
	
	//Number generator
	private Random rand = new Random();
	private int[] columnBG = new int[3];
	private int[] menuBGH = new int[3];
	private int[] activeItem = new int[3];
	private int[] activeItemText = new int[3];
	private int[] hoverItem = new int[3];
	private int[] textColor = new int[3];
	private int[] activePresence = new int[3];
	private int[] mentionBadge = new int[3];

	
	
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
