package com.storage.services;

import com.storage.entities.Seller;
import com.storage.repositories.SellerRepository;


import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SellerService {

    private final SellerRepository sellerRepository;
    
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public Optional<Seller> findById(int id) {
        return sellerRepository.findById(id);
    }
}
