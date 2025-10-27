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

    float rectX = 50;
    float rectY = 500;
    float rectW = 30;
    float rectH = 60;

    float velocity;
    float accelleration;

    public void setup() {
        accelleration = 0.1f;
        velocity = 3;
        background(255, 255, 255);
        strokeWeight(3);
        line(0, 500, 800, 500);
    }

    public void settings() {
        size(800, 600);

    }

    public void draw() {
        background(255, 255, 255);

        line(0, 560, 800, 560);

        float y1a = triY1;
        triangle(triX1 - 35, y1a - 17.5f, triX1, y1a - 35, triX1, y1a);

        float x1b = triX2;
        float y1b = triY2;
        triangle(x1b - 35, y1b - 17.5f, x1b, y1b - 35, x1b, y1b);

        triX1 -= speed;
        triX2 -= speed;

        if (triX1 < 0) {
            triX1 = random(1000, 1600);
            println(triX1);
        }

        if (triX2 < 0) {
            triX2 = random(1000, 1600);
            println(triX2);
        }

        velocity += accelleration;
        rectY += velocity;

        if (rectY >= 500) {
            rectY = 500;
            velocity = 0;
        }

        rect(rectX, rectY, rectW, rectH);

    }

    public void keyPressed() {
    if (key == ' ') {
        velocity = -7;
    }

    }

}
