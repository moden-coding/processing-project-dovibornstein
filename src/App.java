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
        float x2a = triX1 + triSize1;
        float y2a = triY1 + triSize1 / 2; // I used ChatGPT to figure out to use /2 to make it equalateral
        float x3a = triX1 + triSize1;
        float y3a = triY1 - triSize1 / 2;
        triangle(x1a, y1a, x2a, y2a, x3a, y3a);

        float x1b = triX2;
        float y1b = triY2;
        float x2b = triX2 + triSize1;
        float y2b = triY2 + triSize1 / 2;
        float x3b = triX2 + triSize1;
        float y3b = triY2 - triSize1 / 2;
        triangle(x1b, y1b, x2b, y2b, x3b, y3b);

        triX1 -= speed;
        triX2 -= speed;

        if (triX1 < 0) {
            triX1 = width;
        
        float randomX1a = random(1600, 800);
        println(randomX1a, y1a, x2a, y2a, x3a, y3a);
        }

        if (triX2 < 0) {
            triX2 = width;
        
        float randomX2b = random(1600, 800);
        println(randomX2b, x1b, x2b, y2b, x3b, y3b);
        }
        

        

    }
}
