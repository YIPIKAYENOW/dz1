package ball;

import static org.junit.jupiter.api.Assertions.*;

class ballTest {
    public static void main(String[] args) {
        ball d1 = new ball(7, "Yellow","Stone");
        ball d2 = new ball(16, "Orange","Iron");
        ball d3 = new ball(49,"Blue","Gold");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.jump();
        d2.jump();
        d3.jump();
    }

}