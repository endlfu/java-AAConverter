/**
 * 
 */
package jp.endlfu.image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;

/**
 * @author endlfu
 */
public class StringImageImpl implements StringImage
{

    @Override
    public int[] getPixel()
    {
        return pixel;
    }

    @Override
    public String getString()
    {
        return string;
    }
    
    private int[] convert(String s) throws InterruptedException
    {
        BufferedImage image=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d=image.createGraphics();
        g2d.setBackground(Color.WHITE);
        g2d.clearRect(0,0,w,h);
        g2d.setColor(Color.BLACK);
        g2d.drawString(s,0,0);
        
        PixelGrabber pg = new PixelGrabber(image , 0 , 0 , -1 , -1 , true);
        pg.grabPixels();
        return (int[])pg.getPixels();
    }

    /**
     * @param s
     * @throws InterruptedException
     */
    public StringImageImpl(String s) throws InterruptedException
    {
        this.pixel = convert(s);
        this.string = s;
    }
    
    private final int w = 60;
    private final int h = 20;
    private final int[] pixel;
    private final String string;
}
