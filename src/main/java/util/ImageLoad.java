package util;

import processing.core.PImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ImageLoad {
    public static PImage getImage(String url){
        BufferedImage image = null;
        try {
            image = ImageIO.read(Objects.requireNonNull(ImageLoad.class.getClassLoader().getResourceAsStream(url)));
        } catch (IOException e) {
            System.out.println("UNABLE TO LOAD IMAGE!!");
            e.printStackTrace();
        }
        return new PImage(image);
    }
}
