package academy.ennate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Tire
{
    @Id
    private String vin;

    private int frontLeft;
    private int frontRight;
    private int rearLeft;
    private int rearRight;

    public Tire() {
        this.vin=UUID.randomUUID().toString();

    }

    public Tire(int frontLeft, int frontRight, int rearLeft, int rearRight) {
        this.vin=UUID.randomUUID().toString();
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.rearLeft = rearLeft;
        this.rearRight = rearRight;
    }

    public String getTid() {
        return vin;
    }

    public void setTid(String tid) {
        this.vin = tid;
    }

    public int getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(int frontLeft) {
        this.frontLeft = frontLeft;
    }

    public int getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(int frontRight) {
        this.frontRight = frontRight;
    }

    public int getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(int rearLeft) {
        this.rearLeft = rearLeft;
    }

    public int getRearRight() {
        return rearRight;
    }

    public void setRearRight(int rearRight) {
        this.rearRight = rearRight;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "frontLeft=" + frontLeft +
                ", frontRight=" + frontRight +
                ", rearLeft=" + rearLeft +
                ", rearRight=" + rearRight +
                '}';
    }
}
