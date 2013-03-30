/**
 * 
 */
package jp.endlfu.image;

import java.util.HashMap;

/**
 * @author endlfu
 */
public class StringImageModelImpl implements StringImageModel
{
    @Override
    public StringImage getStringImage(String s)
    {
        return imageMap.get(s);
    }

    StringImageModelImpl(String s) throws InterruptedException
    {
        // TODO : Še•¶š—ñ‚Åì‚é
        imageMap.put("s", new StringImageImpl(s));
    }
    
    private HashMap<String, StringImage> imageMap = new HashMap<String, StringImage>();
}
