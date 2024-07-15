package com.example.service;

import com.example.model.Mart;

import java.util.List;

public interface MartService {
    public void createMart(Mart mart);

    public List<Mart> getMarts();

    public Mart getMart(long id);

    public Mart updateMart(Mart mart);

    public void deleteMart(long id);
}
