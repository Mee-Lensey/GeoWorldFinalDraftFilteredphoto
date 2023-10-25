import sun.lwawt.macosx.CSystemTray;

public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void stop() {
        plane.isTrail = true;
        plane.pausetime = 0;
        for (int x = 0; x > -500; x = x + 50) {
            System.out.println(x);
            plane.square(x);
            plane.teleport(x, 50);
            plane.square(100);

        }
    }

    public void fives() {
        for (int x = 35; x > 0; x = x + 5) {
            System.out.println(x);
        }
    }

    public void sixes() {
        for (int x = -12; x < 0; x = x - 1) {
            System.out.println(x);
        }
    }

    public void go() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        //put your loop here


        gridOfSmallSquares();

    }

    public void gridOfSmallSquares() {

        plane.trailWidth = 5;
        for (int x = 0; x < 30; x = x + 1) {
            for (int h = 1; h < 30; h = h + 1) {
                plane.setColor(h*8, 20, 150);
                plane.teleport(h*10, x*10);
                plane.square(10);



            }
        }
    }
}














