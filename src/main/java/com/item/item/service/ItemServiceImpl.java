package com.item.item.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.item.item.entity.Empleado;
import com.item.item.entity.Item;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clienteRest;


    @Override
    public List<Item> finAll() {
        List<Empleado>empleados=Arrays.asList(clienteRest.getForObject("http://localhost:8003/enlistar",Empleado[].class));
        return empleados.stream().map(p -> new Item(p, 10)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id) {
        return null;
    }

}
