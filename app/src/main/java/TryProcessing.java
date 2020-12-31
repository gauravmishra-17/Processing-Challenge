import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public static float START1 = 1;
    public static float START2 = 1;
    public static float START3 = 1;
    public static float START4 = 1;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        ellipse(START1, HEIGHT / 5, 10, 10);
        ellipse(START2, 2 * HEIGHT / 5, 10, 10);
        ellipse(START3, 3 * HEIGHT / 5, 10, 10);
        ellipse(START4, 4 * HEIGHT / 5, 10, 10);
        START1 += 1;
        START2 += 2;
        START3 += 3;
        START4 += 4;

    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }
}
