package com.storage.services;

import com.storage.entities.Sale;
import com.storage.repositories.SaleRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SaleService {

    private final SaleRepository saleRepository;
    
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }

    public List<Sale> findAll() {
        List<Sale> sales = new ArrayList<>();
        saleRepository.findAll().forEach(sales::add);

        return sales;
    }

    public Optional<Sale> findById(int id) {
        return saleRepository.findById(id);
    }

    public Sale update(Sale saleToUpdate) {
        return saleRepository.save(saleToUpdate);
    }

    public void delete(int id) {
        saleRepository.deleteById(id);
    }
}
