/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import proyecto.Iris;
import proyecto.Knn;
import proyecto.Lector;

/**
 * FXML Controller class
 *
 * @author braya
 */
public class VistaPrincipalController implements Initializable {

    @FXML
    private TextField sepalLenghtField;
    @FXML
    private TextField sepalWidthField;
    @FXML
    private TextField petalLenghtField;
    @FXML
    private Button calcularBtn;
    @FXML
    private TextField petalWidthField;
    Knn irisKnn;
    List<Iris> irisDataset;
    Lector archivo_iris;
    @FXML
    private TextArea mostrarInfo;

    public VistaPrincipalController() {
        this.archivo_iris = new Lector("iris.txt");
        this.irisDataset = archivo_iris.GetListaIris();
        this.irisKnn = new Knn();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //this.sepalLenghtField = new TextField();
        //this.sepalWidthField = new TextField();
        //this.petalLenghtField = new TextField();
        //this.petalWidthField = new TextField();
        this.calcularBtn = new Button();
        this.mostrarInfo = new TextArea();

    }

    @FXML
    private void cancularIris(ActionEvent event) {
        String sepalLenght = this.sepalLenghtField.getText();
        String sepalWidth = this.sepalWidthField.getText();
        String petalLenght = this.petalLenghtField.getText();
        String petalWidth = this.petalWidthField.getText();
        if (!sepalLenght.isEmpty() && !sepalWidth.isEmpty() && !petalLenght.isEmpty() && !petalWidth.isEmpty()) {

            double valor1 = Double.parseDouble(sepalLenght);
            double valor2=Double.parseDouble(sepalWidth);
            double valor3=Double.parseDouble(petalLenght);
            double valor4=Double.parseDouble(petalWidth);
            //Iris CasoDePrueba = new Iris(valor1,valor2,valor3,valor4,null);
             Iris CasoDePrueba = new Iris(4.5,2.3,1.3,0.3,null);
             CasoDePrueba.setIrisType(irisKnn.getTipoIris(3, irisDataset, CasoDePrueba));
            System.out.println(CasoDePrueba.toString());
            //this.mostrarInfo.setText(CasoDePrueba.toString());
            return;
        }
        System.out.println("No hay info");
    }

}
