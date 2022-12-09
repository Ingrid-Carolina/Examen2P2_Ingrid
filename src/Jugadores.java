/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINISTRADOR1
 */
public class Jugadores {
    private String J;

    public Jugadores(String J) {
        this.J = J;
    }

    public Jugadores() {
    }

    public String getJ() {
        return J;
    }

    public void setJ(String J) {
        this.J = J;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "J=" + J + '}';
    }
    
}
