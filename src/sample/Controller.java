package sample;

import dao.Produit;
import dao.ProduitDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TableView tv;
    @FXML
    TableColumn nom;
    @FXML
    TableColumn description;
    @FXML
    TableColumn prix;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Produit> data = FXCollections.observableArrayList();
        ProduitDAO produits=new ProduitDAO();
        produits.addProduit(new Produit("Nom","Prenom5",10.0));
        produits.addProduit(new Produit("Nom1","Prenom6",101.0));
        produits.addProduit(new Produit("Nom2","Prenom7",102.0));
        produits.addProduit(new Produit("Nom3","Prenom8",103.0));
        produits.addProduit(new Produit("Nom4","Prenom9",104.0));
        data.addAll(produits.getAllProduits());
        for(Object p:produits.getAllProduits()){
            Produit p1=(Produit) p;
            System.out.println(p.toString());
        }
        nom.setCellValueFactory(new PropertyValueFactory<Produit,String>("nom"));
        description.setCellValueFactory(new PropertyValueFactory<Produit,String>("description"));
        prix.setCellValueFactory(new PropertyValueFactory<Produit,Double>("prix"));
        tv.setItems(data);
    }
}
