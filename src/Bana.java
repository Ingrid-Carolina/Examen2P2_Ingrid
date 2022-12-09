
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMINISTRADOR1
 */
public class Bana implements Serializable {

    private String b;
    int x;
    int y;
   // private static final long SerialVersionUID = ;

    public Bana() {
    }

    public Bana(String b) {
        this.b = b;
    }

    public Bana(String b, int x, int y) {
        this.b = b;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Bana{" + "b=" + b + '}';
    }

}
