package proc.sketches;

import processing.core.PApplet;

public class Screen extends PApplet {
    private static int H = 960, W = 360, SCALE = 30;


    public void settings() {
        size(H, W);

    }

    public void draw() {
        background(0);
        colorMode(HSB);
        for (int row = 0;row<12;row++){
            for (int col = 0; col < 32; col++) {
                fill(((row+col)*10)%255,150,150);
                rect(col*SCALE,row*SCALE,(col+1)*SCALE,(row+1)*SCALE);
            }

        }
        ellipse(mouseX, mouseY, 20, 20);
    }

    public static void main(String... args) {
        PApplet.main("proc.sketches.Screen");
    }

}
