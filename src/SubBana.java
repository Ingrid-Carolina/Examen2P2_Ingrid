
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINISTRADOR1
 */
public class SubBana implements Serializable  {
    String Sb;
 private static final long SerialVersionUID =  700L;
    public SubBana() {
    }

    public SubBana(String Sb) {
        this.Sb = Sb;
    }

    public String getSb() {
        return Sb;
    }

    public void setSb(String Sb) {
        this.Sb = Sb;
    }

    @Override
    public String toString() {
        return "SubBana{" + "Sb=" + Sb + '}';
    }
    
}
