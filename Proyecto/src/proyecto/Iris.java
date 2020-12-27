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

public class Iris {

    private double sepalLength;
    private double sepalWidth;
    private double petalLength;
    private double petalWidth;
    private TiposIris irisType;

    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, TiposIris irisType) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.irisType = irisType;
    }

    public double[] getAllSize() {

        return new double[] {this.sepalLength, this.sepalWidth, this.petalWidth, this.petalWidth};
    }

    public TiposIris getIrisType() {

        return irisType;
    }

    public void setIrisType(TiposIris irisType) {

        this.irisType = irisType;
    }

    @Override
    public String toString() {
        return this.sepalLength + "," +
            this.sepalWidth + "," +
            this.petalLength + "," +
            this.petalWidth + "," +
            this.irisType;
    }
}

