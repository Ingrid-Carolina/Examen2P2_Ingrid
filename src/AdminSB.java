
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
public class AdminSB {
     private ArrayList<SubBana> listasub= new ArrayList();
    private File archivo = new File("");

    public AdminSB() {
    }
     public AdminSB(String path) {
        archivo = new File(path);
    }
     public ArrayList<SubBana> getListasub() {
        return listasub;
    }
    

    public void setListaSB(ArrayList<SubBana> listaBana) {
        this.listasub = listaBana;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     @Override
      public String toString() {
        return "adminB{" + "listaSubBana=" + listasub + ", archivo=" + archivo + '}';
    }
       public void cargarArchivo() {
        try {
            listasub= new ArrayList();
            SubBana temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (SubBana) objeto.readObject()) != null) {
                        listasub.add(temp);
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
            for (SubBana t : listasub) {
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
