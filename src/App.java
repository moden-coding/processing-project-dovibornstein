import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    float triX1 = 800;
    float triY1 = 500;
    float triSize1 = 35;

    float triX2 = 800;
    float triY2 = 550;
    float triSize2 = 35;

    float speed = 5;

    public void setup() {
        background(255, 255, 255);
        strokeWeight(3);
        line(0, 500, 800, 500);
    }

    public void settings() {
        size(800, 600);

    }

    public void draw() {
        background(255, 255, 255);

        float x1a = triX1;
        float y1a = triY1;
        triangle(x1a + 17.5f, y1a - 17.5f, x1a, y1a - 35, x1a, y1a);//x1a, y1a, x1a + 35, y1a, x1a + 17.5, y1a - 35);

        float x1b = triX2;
        float y1b = triY2;
        triangle(x1b, y1b, x1b + 35, y1b, x1b + 17.5f, y1b - 35); // do the same thing once you figure out

        triX1 -= speed;
        triX2 -= speed;

        if (x1a + 17.5 < 0) {
            x1a = + 17.5f  + width;
    
        float randomx1a =   17.5f + random(1600, 800);
        println(randomx1a, y1a, x1a + 35, y1a, x1a + 17.5, y1a - 35);
        }

        // if (x1b + 17.5 < 0) {
        //     x1b = + 17.5f + width;
        
        // float randomx2b = 17.5f + random(1600, 800);
        // println(randomx1b, y1b, x1b + 35, y1b, x1b + 17.5, y1b - 35);
        // }
        

        

    }
}
