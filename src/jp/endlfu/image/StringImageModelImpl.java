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
        // TODO : 各文字列で作る
        imageMap.put("s", new StringImageImpl(s));
    }
    
    private HashMap<String, StringImage> imageMap = new HashMap<String, StringImage>();
}
