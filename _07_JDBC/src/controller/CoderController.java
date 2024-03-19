package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;

public class CoderController {

    CoderModel objCoderModel ;
    public CoderController(){
        //Crear una instancia del model
        this.objCoderModel =new CoderModel();
    }

    //Método para listar todos los coder
    public void getAll(){

        String list = "🤷‍♂️ List Coders \n";

        //Iteramos sobre la lista que devuelve el método find All
        for (Object obj : this.objCoderModel.findAll()){

            // Convertimos o castemos el objeto tipo Object a un Coder
            Coder objCoder = (Coder) obj;

            //Concatenamos la información
            list += objCoder.toString()+ "\n";
        }

        //Mostramos toda lista
        JOptionPane.showMessageDialog(null,list);

    }
}
