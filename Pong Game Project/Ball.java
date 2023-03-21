import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    int xVelocity;
    int yVelocity;
    Ball(int x,int y, int width, int height)
    {
        super(x,y,width,height); // this is for rectangle class

        Random random = new Random();
        int r = random.nextInt(2);
        if(r==1)
        {
            xVelocity = -5;
        }
        else
        {
            xVelocity = 5;
        }

        yVelocity = 5;

    }

    public void move()
    {
        x = x+xVelocity;
        y = y+yVelocity;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(x,y,width,height);
        g.drawLine(1000/2,0,1000/2,555);
    }
}
