package ball;

public class ball {
    private int radius;
    private String color;
    private String material;

    public ball(int radius, String color, String material) {
        this.radius = radius;
        this.color = color;
        this.material = material;
    }

    public ball(String color, String material) {
        this.color = color;
        this.material = material;
        this.radius = 0;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "The ball: radius = " + this.radius + "   color: " + this.color + "   material = " + this.material;
    }

    public void jump() {
        System.out.println("The ball not jumped");
    }
}
