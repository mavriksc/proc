package proc.sketches;

import processing.core.PApplet;
import processing.core.PImage;
import processing.video.Movie;

public class Screen extends PApplet {
    private static int ROWS = 12, COLS = 32, SCALE = 50;
    private static int H = ROWS * SCALE, W = COLS * SCALE;
    private Movie mov;

    public void settings() {
        size(W, H);

        mov = new Movie(this,"D:\\code\\proc\\src\\main\\java\\proc\\sketches\\data\\vid.mp4");
        mov.play();
        mov.pixelHeight;
        mov.pixelWidth;

    }

    void movieEvent(Movie m){
        m.read();
    }

    public void draw() {
        background(0);
        PImage frame = mov.get();
        frame.resize(32,12);
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int clr = frame.get(col,row);
                fill(clr);
                rect(col * SCALE, row * SCALE, (col + 1) * SCALE, (row + 1) * SCALE);
            }
        }
    }

    public static void main(String... args) {
        System.setProperty("gstreamer.library.path","D:\\code\\proc\\lib\\windows64");
        System.setProperty("gstreamer.plugin.path","D:\\code\\proc\\lib\\windows64\\plugins\\");
        PApplet.main("proc.sketches.Screen");
    }

}
