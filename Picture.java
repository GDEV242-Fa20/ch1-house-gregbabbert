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
    private Triangle mouth;
    private Triangle eyebrow1;
    private Triangle eyebrow2;
    private Circle head1;
    private Circle head2;
    private Circle pupil1;
    private Circle pupil2;
    private Square lowerHead;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        mouth = new Triangle();
        eyebrow1 = new Triangle();
        eyebrow2 = new Triangle();
        head1 = new Circle();
        head2 = new Circle();
        pupil1 = new Circle();
        pupil2 = new Circle();
        lowerHead = new Square();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
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
            
            mouth.changeColor("black");
            mouth.changeSize(50, 100);
            mouth.moveHorizontal(-90);
            mouth.moveVertical(60);
            mouth.makeVisible();
            
            pupil1.changeColor("blue");
            pupil1.moveHorizontal(-180);
            pupil1.moveVertical(0);
            pupil1.changeSize(60);
            pupil1.makeVisible();
            
            pupil2.changeColor("blue");
            pupil2.moveHorizontal(-100);
            pupil2.moveVertical(0);
            pupil2.changeSize(60);
            pupil2.makeVisible();
            
            eyebrow1.changeColor("green");
            eyebrow1.changeSize(50, 120);
            eyebrow1.moveHorizontal(-130);
            eyebrow1.moveVertical(-100);
            eyebrow1.makeVisible();
            
            eyebrow2.changeColor("green");
            eyebrow2.changeSize(50, 120);
            eyebrow2.moveHorizontal(-50);
            eyebrow2.moveVertical(-100);
            eyebrow2.makeVisible();
            
            
            person.moveHorizontal(100);
            person.moveVertical(30);
            person.changeSize(70, 38);
            person.makeVisible();
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
        mouth.changeColor("black");
        head1.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        mouth.changeColor("green");
        head1.changeColor("yellow");
    }
}
