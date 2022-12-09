
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMINISTRADOR1
 */
public class AdminB implements Serializable {

    private ArrayList<Bana> listaBana = new ArrayList();
    private File archivo = new File("");

    private static final long SerialVersionUID = 777L;

    public AdminB(String path) {
        archivo = new File(path);
    }

    public AdminB() {
    }

    public ArrayList<Bana> getListaBana() {
        return listaBana;
    }

    public void setListaBana(ArrayList<Bana> listaBana) {
        this.listaBana = listaBana;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminB{" + "listaBanana=" + listaBana + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaBana = new ArrayList();
            Bana temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Bana) objeto.readObject()) != null) {
                        listaBana.add(temp);
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
            for (Bana t : listaBana) {
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
