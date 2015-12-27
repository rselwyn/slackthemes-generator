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
		activePresence = generateBrighterColor(activeItem, (float) .25);
		hoverItem = generateBrighterColor(columnBG, (float) -.25);
		
		System.out.print("#"+Integer.toHexString(columnBG.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(menuBGH.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(activeItem.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(activeItemText.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(hoverItem.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(textColor.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(activePresence.getRGB()).substring(2)+",");
		System.out.print("#"+Integer.toHexString(mentionBadge.getRGB()).substring(2)+"");
		
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
	
	public Color generateBrighterColor(Color c, float percentBrighter){
		//Generate the values percentBrighter percent brighter
		int r = (int) ((int) c.getRed() * (1+percentBrighter));
		int g = (int) ((int) c.getGreen() * (1+percentBrighter));
		int b = (int) ((int) c.getBlue() * (1+percentBrighter));
		return new Color(colorMax(r),colorMax(g),colorMax(b));
	}
	
	public int colorMax(int val){
		if (val>255) return 255;
		return val;
	}
	
	
}
