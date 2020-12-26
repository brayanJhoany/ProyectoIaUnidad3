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


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lector archivo_iris = new Lector("iris.txt");

        List<Iris> irisDataset =  archivo_iris.GetListaIris();

        Knn irisKnn = new Knn();

        Iris CasoDePrueba = new Iris(4.5,2.3,1.3,0.3,null);

        CasoDePrueba.setIrisType(irisKnn.getTipoIris(3, irisDataset, CasoDePrueba));

        System.out.println(CasoDePrueba.toString());

    }
}
