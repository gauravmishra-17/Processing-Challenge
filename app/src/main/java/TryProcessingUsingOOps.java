import processing.core.PApplet;

public class TryProcessingUsingOOps extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public static final int RANK_1 = 1;
    public static final int RANK_2 = 2;
    public static final int RANK_3 = 3;
    public static final int RANK_4 = 4;
    public static int VERTICAL_POSITION = HEIGHT / 5;
    public static final float AXIS_A = 10;
    public static final float AXIS_B = 10;
    public static float HORIZONTAL_POSITION = 1;

    Ellipse ellipse1;
    Ellipse ellipse2;
    Ellipse ellipse3;
    Ellipse ellipse4;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ellipse1 = new Ellipse(HORIZONTAL_POSITION, VERTICAL_POSITION, AXIS_A, AXIS_B, RANK_1);
        ellipse2 = new Ellipse(HORIZONTAL_POSITION, VERTICAL_POSITION, AXIS_A, AXIS_B, RANK_2);
        ellipse3 = new Ellipse(HORIZONTAL_POSITION, VERTICAL_POSITION, AXIS_A, AXIS_B, RANK_3);
        ellipse4 = new Ellipse(HORIZONTAL_POSITION, VERTICAL_POSITION, AXIS_A, AXIS_B, RANK_4);
    }

    @Override
    public void draw() {
        animation(ellipse1);
        animation(ellipse2);
        animation(ellipse3);
        animation(ellipse4);

    }

    private void animation(Ellipse figure) {
        ellipse(figure.xCoordinate, figure.yCoordinate * figure.rank, figure.aAxis, figure.bAxis);
        updateSpeed(figure);

    }

    private void updateSpeed(Ellipse figure) {
        figure.xCoordinate += figure.rank;
    }


    public static void main(String[] args) {
        PApplet.main("TryProcessingUsingOOps", args);
    }
}
