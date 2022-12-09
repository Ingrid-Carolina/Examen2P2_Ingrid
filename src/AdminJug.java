
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINISTRADOR1
 */
public class AdminJug {
     private ArrayList<Jugadores> listaJug = new ArrayList();
    private File archivo = new File("");
      public AdminJug(String path) {
        archivo = new File(path);
    }

    public AdminJug() {
    }

    public ArrayList<Jugadores> getListaJ() {
        return listaJug;
    }

    public void setListaJ(ArrayList<Jugadores> listaBana) {
        this.listaJug = listaBana;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     @Override
      public String toString() {
        return "adminJug{" + "listaJugadores=" + listaJug + ", archivo=" + archivo + '}';
    }
      public void cargarArchivo() {
        try {
            listaJug= new ArrayList();
            Jugadores temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Jugadores) objeto.readObject()) != null) {
                        listaJug.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Jugadores t : listaJug) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
