
package model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class DAOUsuario {
    
    SessionFactory fuck;
    Session sesion;
    Transaction tranza;

    public DAOUsuario() {
    fuck=HibernarteUtilidades.getSessionFactory();
    sesion=fuck.openSession();
    tranza=sesion.beginTransaction();
    }
    public void cerrarTransaccion(){
        sesion.close();
        tranza.commit();


    }
    
    //primer operacion CRUD
   
    public void guardar(Usuario objeto)throws Exception{
    
    sesion.persist(objeto);
    cerrarTransaccion(); 
    
    }
    
    public void actualizar(Usuario objeto)throws Exception{
    sesion.update(objeto);
    cerrarTransaccion();
    
    
    }
    
    public void borrar(Usuario objeto) throws Exception{
    sesion.delete(objeto);
    cerrarTransaccion();
       
    }
    
    public Usuario buscarPorId(Integer id)throws Exception{
    Usuario objeto =(Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(id)).uniqueResult();
    return objeto;
    }
            
   public ArrayList<Usuario> buscarTodos() throws Exception{
   ArrayList<Usuario> objeto=(ArrayList<Usuario>)  sesion.createCriteria(Usuario.class).list();
   return objeto;
   
   }
}
