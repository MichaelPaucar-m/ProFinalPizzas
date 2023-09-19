/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import sys.componentes.EncriptarPassword;
import sys.dao.UsuarioDAO;
import sys.modelo.Usuario;
import sys.util.HibernateUtil;

/**
 *
 * @author pc
 */
public class UsuarioDAOImpl implements UsuarioDAO{

    @Override
    public Usuario search(Usuario usuario) { 
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql= "FROM Usuario WHERE usuarioNombre=:nombreUsuario";
        Query query= session.createQuery(hql);
        query.setParameter("nombreUsuario", usuario.getUsuarioNombre());
        
        return (Usuario)query.uniqueResult();
    }

    @Override
    public Usuario login(Usuario usuario) {
        
        Usuario usuarioLogin = search(usuario);
        
        if (usuarioLogin!=null){
            if(usuarioLogin.getUsuarioPass().equals(EncriptarPassword.sha512(usuario.getUsuarioPass()))){
                
                usuarioLogin = null;
            }
        }
        
        return usuario;
    }
    
    
}

