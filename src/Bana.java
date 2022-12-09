
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
    private static final long SerialVersionUID = 777L;

    public Bana() {
    }

    public Bana(String b) {
        this.b = b;
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
