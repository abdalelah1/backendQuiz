package com.storage.repositories;

import com.storage.entities.Sale;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends CrudRepository<Sale, Integer> {

}