/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demoweb1.services;
import com.example.demoweb1.model.Cliente;
import java.util.List;
/**
 *
 * @author HP
 */
public interface ClienteService {
    public Cliente save(Cliente cliente);
    public void delete(Integer id);
    public Cliente findById(Integer id);
    public List<Cliente> findAll();
    public List<Cliente> findByNombre(String nombre);
}
