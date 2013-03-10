package jp.endlfu.image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/**
 * @author endlfu
 *
 * IMG to AA Converter
 */
public class AAConverterImpl implements AAConverter
{
    @Override
    public String asciiArt()
    {
        return null;
    }

    private String createAsciiArt(final BufferedImage img)
    {
        final Graphics2D g = img.createGraphics();
        int w = img.getWidth();
        int h = img.getHeight();
        return null;
    }

    private int toGray(int col)
    {
        final Color c = new Color(col);
        final double d = (double)(2*c.getRed()+4*c.getGreen()+c.getBlue())/7d;
        final int a = c.getAlpha();
        return new Color((int)d, (int)d, (int)d, a).getRGB();
    }
    
    /**
     * @param img 
     */
    public AAConverterImpl(BufferedImage img)
    {
        for (int iy = 0; iy < img.getHeight(); iy++) {
            for (int ix = 0; ix < img.getWidth(); ix++) {
                int col = img.getRGB(ix, iy);
                img.setRGB(ix, iy, toGray(col));
            }
        }

        gray = null;
    }
    
    private final int gray[][];
}
