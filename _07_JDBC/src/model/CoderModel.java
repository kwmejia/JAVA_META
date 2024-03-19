package model;

import database.CRUD;
import database.ConfigDB;
import entity.Coder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoderModel implements CRUD {
    @Override
    public Object insert(Object object) {
        return null;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public List<Object> findAll() {
        //1. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();

        //2. Inicializar la lista donde se guardaran los registros que devuelve la BD
        List<Object> listCoders = new ArrayList<>();


        try{
            //3. Escribir la sentencia SQL
            String sql = "SELECT * FROM coder ORDER BY coder.id ASC;";

            //4. Utilizar PrepareStatement
            PreparedStatement objPrepareStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //5. Ejecutar el Query o el prepare
           ResultSet objResult = (ResultSet) objPrepareStatement.executeQuery();

           //6. Obtener los resultados
           while (objResult.next()){
               //Creamos una instacia de coder
               Coder objCoder = new Coder();

               //Llenamos nuestro objeto con lo que devuelve la base de datos (ResultSet)
               objCoder.setId(objResult.getInt("id"));
               objCoder.setName(objResult.getString("name"));
               objCoder.setAge(objResult.getInt("age"));
               objCoder.setClan(objResult.getString("clan"));

               //Finalmente agregar el coder a la lista
               listCoders.add(objCoder);
           }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Data acquisition Error");
        }

        //7. Cerramos la conexión
        ConfigDB.closeConnection();

        return listCoders;
    }

    @Override
    public Object findById(int id) {
        return null;
    }
}
