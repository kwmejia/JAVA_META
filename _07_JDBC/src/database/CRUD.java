package database;

import java.util.List;

public interface CRUD {
    //Object es una clase generica para los objetos donde
    // cualquier objeto de Java puede ser un Object
    public Object insert(Object object);
    public boolean update(Object object);
    public  boolean delete(Object object);
    public List<Object> findAll();
    public Object findById(int id);
}
