import java.awt.*;

public class Ball extends Rectangle {
    int xVelocity;
    int yVelocity;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        xVelocity = 5;
        yVelocity = 5;

    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);

        g.fillOval(x, y, width, height);
    }

}