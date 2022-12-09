
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINISTRADOR1
 */
public class Hilos implements Runnable{
private JTextArea Ta;
private JTextField in;
private Bana b;
private String [][] matriz;
private boolean text =false;

    public Hilos() {
    }

    public Hilos(JTextArea Ta, JTextField in, String[][] matriz) {
        this.Ta = Ta;
        this.in = in;
        this.matriz = matriz;
        System.out.println(Ta);
        System.out.println(in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }

    public Hilos(JTextArea Ta, JTextField in, String[][] matriz, Bana b) {
        this.Ta = Ta;
        this.in = in;
        this.b = b;
        this.matriz = matriz;
    }

    public Bana getB() {
        return b;
    }

    public void setB(Bana b) {
        this.b = b;
    }
    

    public JTextArea getTa() {
        return Ta;
    }

    public void setTa(JTextArea Ta) {
        this.Ta = Ta;
    }

    public JTextField getIn() {
        return in;
    }

    public void setIn(JTextField in) {
        this.in = in;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public boolean isText() {
        return text;
    }

    public void setText(boolean text) {
        this.text = text;
    }
    


        
    @Override
    public void run() {
      int x2 = b.getX();
      int y2= b.getY();
       while(true){
           if(in.getText().equals("w")){
               b.setY(y2-1);
               y2= b.getY(); 
           }else if(in.getText().equals("a")){
              b.setX( x2-1);
               x2 =b.getX();
           }else if(in.getText().equals("d")){
               b.setX(x2+1);
               
               x2 =b.getX();
           }else if(in.getText().equals("s")){
               b.setY(y2+1);
               y2= b.getY(); 
           }
           System.out.println("posicion x: " +  b.getX());
           System.out.println("posicion y: " +  b.getY());
           matriz();
           if(b.getX()== 0||b.getX()== 32||b.getY()== 0||b.getY()== 32){
               b.setY(7);
               b.setX(17);
           }
           try{
             Thread.sleep(1000);
           }catch(InterruptedException e){
               
           }
           
       }
        
                
        
    }
  public void matriz(){
      Random r = new Random();
      int x=0;
      int y=0;
      String map ="";
      boolean exit =false;
      if(exit  == false){
                    x=r.nextInt(13);
                    y=r.nextInt(32);
                    matriz[x][y]="O";
                    
                }
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
//                
                if( i == 0 || j == 0 || i == matriz.length-1 || j == matriz[i].length-1){
                    matriz[i][j] = "*";
                }else if(!matriz[x][y].equals("O")){
                    matriz[i][j] = " ";
                }
//                
//               
            }
            map += "\n";
        }
        String ma ="";
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 33; j++) {
               
                ma += matriz[i][j];
                
            }
            ma+="\n";
      }
       Ta.setText(ma);
  }  
}

