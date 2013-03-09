package jp.endlfu.image;

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
        final ColorModel colorModel = img.getColorModel();
        return null;
    }

    /**
     * @param img 
     */
    public AAConverterImpl(BufferedImage img)
    {
        this.img = img;
    }
    
    private BufferedImage img;
}
