package com.chatvisionfinal.service;

import com.chatvisionfinal.entity.Factory;
import com.chatvisionfinal.repository.FactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryServiceImpl implements FactoryService{
    @Autowired
    private FactoryRepository factoryRepository;
    public List<Factory> getAllFactory(){
        return factoryRepository.findAll();
    }

}
