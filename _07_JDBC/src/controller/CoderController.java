package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;
import java.util.List;

public class CoderController {

    CoderModel objCoderModel;

    public CoderController() {
        //Crear una instancia del model
        this.objCoderModel = new CoderModel();
    }

    public void delete() {
        String listCoderString = this.getAll(this.objCoderModel.findAll());

        int confirm = 1;
        int idDelete = Integer.parseInt(JOptionPane.showInputDialog(listCoderString + " Enter the ID of the coder to delete"));
        Coder objCoder = (Coder) this.objCoderModel.findById(idDelete);

        if (objCoder == null){
            JOptionPane.showMessageDialog(null," Coder not found.");
        }else {
            confirm = JOptionPane.showConfirmDialog(null,"Are your sure want to delete  the coder: \n"+ objCoder.toString());

            //Si el usuario escogió que si entonces eliminamos.
            if (confirm == 0){
                this.objCoderModel.delete(objCoder);
            }
        }
    }

    //Método para listar todos los coder
    public void getAll() {

        String list = this.getAll(this.objCoderModel.findAll());
        //Mostramos toda lista
        JOptionPane.showMessageDialog(null, list);

    }

    public String getAll(List<Object> listObject){
        String list = "🤷‍♂️ List Coders \n";

        //Iteramos sobre la lista que devuelve el método find All
        for (Object obj : listObject) {

            // Convertimos o castemos el objeto tipo Object a un Coder
            Coder objCoder = (Coder) obj;

            //Concatenamos la información
            list += objCoder.toString() + "\n";
        }
        return list;
    }

    public void create() {
        Coder objCoder = new Coder();

        String name = JOptionPane.showInputDialog("Insert name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age: "));
        String clan = JOptionPane.showInputDialog("Insert clan: ");

        objCoder.setName(name);
        objCoder.setAge(age);
        objCoder.setClan(clan);

        objCoder = (Coder) this.objCoderModel.insert(objCoder);

        JOptionPane.showMessageDialog(null, objCoder.toString());


    }

    public void update(){
        //Listamos
        String listCoders = this.getAll(this.objCoderModel.findAll());

        //Pedimos el id
        int idUpdate = Integer.parseInt(JOptionPane.showInputDialog(listCoders +"\nEnter the ID of the coder to edit"));

        //Verificar el id
        Coder objCoder = (Coder) this.objCoderModel.findById(idUpdate);

        if (objCoder == null){
            JOptionPane.showMessageDialog(null, "Coder not found.");
        }else {
            String name = JOptionPane.showInputDialog(null,"Enter new name",objCoder.getName());
            String clan = JOptionPane.showInputDialog(null,"Enter new clan",objCoder.getClan());
            int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter new age",String.valueOf(objCoder.getAge())));

            objCoder.setAge(age);
            objCoder.setName(name);
            objCoder.setClan(clan);

            this.objCoderModel.update(objCoder);
        }
    }
}
