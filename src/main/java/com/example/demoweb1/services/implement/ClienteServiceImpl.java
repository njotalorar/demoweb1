/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demoweb1.services.implement;
import com.example.demoweb1.dao.ClienteDao;
import com.example.demoweb1.model.Cliente;
import com.example.demoweb1.services.ClienteService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author HP
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteDao clientedao;
    
    //Como son 4 métodos, habrán 4 implementaciones
    //implementación de save
    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clientedao.save(cliente);
    }
    //implementación de delete
    @Override
    @Transactional
    public void delete(Integer id){
        clientedao.deleteById(id);
    }
    //implementación de findbyid
    @Override
    public Cliente findById(Integer id){
        return clientedao.findById(id).orElse(null);
    }
    //implementación de findAll
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clientedao.findAll();
    }
    //implementación de findByNombre
    @Override
    public List<Cliente> findByNombre(String nombre){
        return (List<Cliente>) clientedao.buscapornombre(nombre);
    }
    
}
