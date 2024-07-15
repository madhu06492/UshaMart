package com.example.service;

import com.example.model.Mart;
import com.example.repository.MartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MartServiceImpl implements MartService {
    @Autowired
    private MartRepo martRepo;

    @Override
    public void createMart(Mart mart) {
        martRepo.save(mart);
    }

    @Override
    public List<Mart> getMarts() {
        return martRepo.findAll();
    }

    @Override
    public Mart getMart(long id) {
        return martRepo.findById(id).get();
    }

    @Override
    public Mart updateMart(Mart mart) {
        return martRepo.save(mart);
    }

    @Override
    public void deleteMart(long id) {
        martRepo.delete(martRepo.findById(id).get());
    }
}
