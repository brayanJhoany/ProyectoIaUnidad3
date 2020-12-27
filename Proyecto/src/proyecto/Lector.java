/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author braya
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {

    private File file;

    public Lector(String filename) {
        file = new File(filename);
    }

    public List<Iris> GetListaIris() {
        
        List<Iris> infoIris = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            String[] irisInfo;

            while (scan.hasNext()) {
                irisInfo = scan.nextLine().split(",");
                TiposIris tipoIris;

                switch (irisInfo[4]) {
                    case "Iris-setosa":
                        tipoIris = TiposIris.SETOSA; break;
                    case "Iris-versicolor":
                        tipoIris = TiposIris.VERSICOLOR; break;
                    case "Iris-virginica":
                        default: tipoIris = TiposIris.VIRGINICA; break;
                }

                infoIris.add(new Iris(
                        Double.parseDouble(irisInfo[0]),
                        Double.parseDouble(irisInfo[1]),
                        Double.parseDouble(irisInfo[2]),
                        Double.parseDouble(irisInfo[3]),
                        tipoIris
                ));
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return infoIris;
    }

}