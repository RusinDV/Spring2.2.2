package web.model;

public class Car {
    private String model;
    private int power;
    private int speed;

    public Car() {
    }

    public Car(String model, int power, int speed) {
        this.model = model;
        this.power = power;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
