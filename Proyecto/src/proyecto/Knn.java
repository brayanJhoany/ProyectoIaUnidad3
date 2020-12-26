
package proyecto;

import java.util.*;

public class Knn {

    private double getDistancia(double[] p, double[] k) {
        int dimension = p.length;
        double distance = 0;

        for (int i = 0; i < dimension; i++) {
            distance += Math.pow(Math.abs(p[i] - k[i]), 2);
        }

        return Math.sqrt(distance);
    }


    public TiposIris getTipoIris(int k, List<Iris> dataset, Iris nuevoIris) {
        Map<Double, Iris> DistanciaVecinos = new TreeMap<>();

        for (Iris iris : dataset) {
            DistanciaVecinos.put(getDistancia(nuevoIris.getAllSize(), iris.getAllSize()), iris);
        }

        int counter = 0;
        Map<TiposIris, Integer> irisTypes = new TreeMap<>();

        for (Map.Entry<Double, Iris> neighbour : DistanciaVecinos.entrySet()) {
            if (counter == k) break;

            irisTypes.put(neighbour.getValue().getIrisType(),
                    (irisTypes.get(neighbour.getValue().getIrisType()) == null ?
                            0 : irisTypes.get(neighbour.getValue().getIrisType())) + 1);

            counter++;
        }

        return irisTypes.entrySet().iterator().next().getKey();
    }
}
