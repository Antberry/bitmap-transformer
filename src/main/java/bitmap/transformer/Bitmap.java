package bitmap.transformer;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Bitmap {
    public static BufferedImage image;

    public static int width;

    public static int height;

    public Bitmap(BufferedImage theImage){
     this.image = theImage;
     this.width = theImage.getWidth();
     this.height = theImage.getHeight();
    }


}
