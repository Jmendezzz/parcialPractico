package com.example.parcialpractico;

import com.example.parcialpractico.Controller.ModelFactoryController;
import com.example.parcialpractico.Exception.InputException;
import com.example.parcialpractico.Model.Client;
import com.example.parcialpractico.Services.ModelFactoryControllerService;
import com.example.parcialpractico.Validator.InputValidator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    ModelFactoryController mfc = ModelFactoryController.getInstance();
    InputValidator inputValidator = new InputValidator();
    @FXML
    private TextField ageField;

    @FXML
    private Label labelList;

    @FXML
    private Button listButton;

    @FXML
    private TextField nameField;

    @FXML
    private Button saveButton;

    @FXML
    void createClient(){
        try{
            inputValidator.verifyInputs(nameField.getText(),ageField.getText());
            inputValidator.verifyAgeInput(ageField.getText());
            mfc.createClient(nameField.getText(),ageField.getText());

        }catch (InputException err){
            System.out.println(err.getMessage());
        }

    }
    @FXML
    void showClientList(){
        try{
            inputValidator.verifyList(mfc.getClientList());

        }catch (InputException err ){
            System.out.println(err.getMessage());

        }
        StringBuilder list = new StringBuilder();
        for(Client client : mfc.getClientList()){
            list.append("Nombre: ").append(client.getName()).append("\n").append("Edad:  ").append(client.getAge())
            ;
        }
        labelList.setText(
                list.toString()

        );

    }



}