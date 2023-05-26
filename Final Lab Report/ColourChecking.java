import java.awt.Color;
public class ColourChecking {
    public static void main(String[] args) {
        int red = 193;
        int green = 255;
        int blue = 183;

        Color color = new Color(red, green, blue);

        float[] hsbValues = Color.RGBtoHSB(red, green, blue, null);
        float hue = hsbValues[0];
        float saturation = hsbValues[1];
        float brightness = hsbValues[2];

        System.out.println("Hue: " + hue);
        System.out.println("Saturation: " + saturation);
        System.out.println("Brightness: " + brightness);
    }
}