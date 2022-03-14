import processing.core.PApplet;
public class FourBalls extends PApplet {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 960;
    public static final int DIAMETER = 10;
    int ballY1 = HEIGHT/5;
    int ballY2 = 2*(HEIGHT/5);
    int ballY3 = 3*(HEIGHT/5);
    int ballY4 = 4*(HEIGHT/5);
    int ballX1, ballX2, ballX3, ballX4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        //Ball 1
        ellipse(ballX1, ballY1, DIAMETER, DIAMETER);
        ballX1++;
        //Ball 2
        ellipse(ballX2, ballY2, DIAMETER, DIAMETER);
        ballX2+=2;
        //Ball 3
        ellipse(ballX3, ballY3, DIAMETER, DIAMETER);
        ballX3+=3;
        //Ball 4
        ellipse(ballX4, ballY4, DIAMETER, DIAMETER);
        ballX4+=4;
    }
}
