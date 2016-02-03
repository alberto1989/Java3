/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author heroe
 */
public class ProbarEntidades {
    public static void main(String[] args) {
        
        try {
            //paso 1 generar el session factory
           SessionFactory fuck= HibernarteUtilidades.getSessionFactory();
           Session sesion=  fuck.openSession();
            Transaction tranza= sesion.beginTransaction();
            //AHORA SE REALIZARA UN INSERT CON HIBERNATE
            
            Usuario usuario=new Usuario("alberto", "123456");
            sesion.save(usuario);
            tranza.commit();
            sesion.close();
            
            System.out.println("Usuario Guardado!!!");
            
        } catch (Exception e) {
        }
        
    }
    
}
