
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.beans.Usuario;
import java.util.ArrayList;

/**
 *
 * @author jeffe
 */
public interface IUsuarioDAO {
    
    public void insert(Usuario us) throws Exception;
    
    public void update(Usuario cl) throws Exception;
    
    public void delete(Integer id) throws Exception;
    
    public ArrayList<Usuario> selectByLoginSenha(String login, String senha)throws Exception;
    
    public ArrayList<Usuario> selectAllUsuario()throws Exception;
}
