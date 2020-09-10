/**
 * This class is used to draw a simple
 * 
 * @author  Greg Babbert
 * @version 2020.09.10
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle head1;
    private Circle head2;
    private Square lowerHead;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        head1 = new Circle();
        head2 = new Circle();
        lowerHead = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            // wall.moveHorizontal(-140);
            // wall.moveVertical(20);
            // wall.changeSize(120);
            // wall.changeColor("red");
            // wall.makeVisible();
            
            // window.changeColor("black");
            // window.moveHorizontal(-120);
            // window.moveVertical(40);
            // window.changeSize(40);
            // window.makeVisible();
    
            // roof.changeSize(60, 180);
            // roof.moveHorizontal(20);
            // roof.moveVertical(-60);
            // roof.makeVisible();

            head1.changeColor("red");
            head1.moveHorizontal(-200);
            head1.moveVertical(-30);
            head1.changeSize(100);
            head1.makeVisible();
            
            head2.changeColor("red");
            head2.moveHorizontal(-120);
            head2.moveVertical(-30);
            head2.changeSize(100);
            head2.makeVisible();
            
            lowerHead.moveHorizontal(-240);
            lowerHead.moveVertical(20);
            lowerHead.changeSize(100);
            lowerHead.changeColor("red");
            lowerHead.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        head1.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        head1.changeColor("yellow");
    }
}
