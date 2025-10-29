import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    float rectX = 50;
    float rectY = 490;
    float rectW = 40;
    float rectH = 70;

    float triX1 = 800;
    float triY1 = 515;
    float triSize1 = 35;

    float triX2 = 800;
    float triY2 = 555;
    float triSize2 = 35;

    float speed = 5;

    float velocity;
    float accelleration;

    public void setup() {
        accelleration = 0.25f;
        velocity = 1;
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
        fill(255, 0, 0);
        triangle(triX1 - 35, y1a - 17.5f, triX1, y1a - 35, triX1, y1a);

        float x1b = triX2;
        float y1b = triY2;
        fill(255, 0, 0);
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

        if(SpikeHitsDino()){
        fill(255, 0, 0);
        }else{
        fill(0, 255, 0);
        }

        velocity += accelleration;
        rectY += velocity;

        if (rectY >= 490) {
            rectY = 490;
            velocity = 0;
        }

        fill(0, 255, 0);
        rect(rectX, rectY, rectW, rectH);

        // triX1 = speed --;
        // triX2 = speed --;
    }

    public boolean SpikeHitsDino(){
    float rectLeft = rectX;
    float rectRight = rectX + rectW;
    float rectTop = rectY;
    float rectBottom = rectY + rectH;

    float triPoint1 = triX1 - 35, triY1 - 17.5f;
    float triPoint2 = triX2 - 35, triY2 - 17.5f;

    if (rectX < triX1 < rextX + rectW || rectY < triY1 < rectY + rectH);
return false;
    }

    public void keyPressed() {
        if (key == ' ' && rectY == 490) {
            velocity = -6.5f;
        }

    }

}
