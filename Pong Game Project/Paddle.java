import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {

    int id;
    int yVelocity = 2;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.red);

        if (id == 2)
            g.setColor(Color.blue);

        g.fillRect(x, y, width, height);
    }

    public void move() {
        y += yVelocity;
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            yVelocity = 0;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            yVelocity = -2;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            yVelocity = -2;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            yVelocity = 2;
        }
    }

}