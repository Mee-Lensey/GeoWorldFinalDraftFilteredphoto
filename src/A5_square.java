public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        square();

    }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(247, 212, 37);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);





    }
    public void octagon(){ plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);




    }
    public void house() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(-120);
        plane.move(111);
        plane.turn(-120);
        plane.move(111);
    }

    //create more methods here for HW
    //make a few (3-5) methods that would be helpful for drawing a scheme
    //car, tree, sun, stars, bird,
    //
public void tree(){

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(150, 75, 0);
        plane.move(200);
        plane.turn(90);
        plane.setColor(150, 75, 0);
        plane.move(75);
        plane.turn(90);
        plane.setColor(150, 75, 0);
        plane.move(200);
        plane.turn(90);
        plane.move(75);
        plane.setColor(65, 150, 0);
        plane.move(70);
        plane.turn(-120);
        plane.move(175);
        plane.turn(-110);
        plane.move(200);
        plane.turn(-120);
        plane.move(60);
}




    }





/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/