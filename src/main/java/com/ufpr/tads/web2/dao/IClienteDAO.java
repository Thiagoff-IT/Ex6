/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufpr.tads.web2.dao;

import com.ufpr.tads.web2.beans.Cliente;
import java.util.ArrayList;

/**
 *
 * @author jeffe
 */
public interface IClienteDAO {
    public void insert(Cliente fc) throws Exception;
    
    public void update(Cliente cl) throws Exception;
    
    public void delete(Integer id) throws Exception;
    
    public ArrayList<Cliente> selectById(Integer id)throws Exception;
    
    public ArrayList<Cliente> selectAll()throws Exception;
}
