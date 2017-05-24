package dao;

import ClasesP.UIM;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo implements UIMDB {

    private File datos;
    Scanner sn = new Scanner(System.in);

    public Archivo() {
        this.datos = new File("src/registroBogota.txt");
    }

    public ArrayList<String> LeerArchivo() {
        ArrayList<String> datosTexto = new ArrayList<String>();
        try {
            sn = new Scanner(this.datos);
            int lineNumber = 1;

            while (sn.hasNextLine()) {
                String line = sn.nextLine();

                lineNumber++;
                datosTexto.add(line);
            }
            sn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return datosTexto;
    }

    public void escribir(UIM s) throws FileNotFoundException {

    }

    @Override
    public UIM leer() {
        return null;
    }

}
