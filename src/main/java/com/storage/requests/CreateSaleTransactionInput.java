package com.storage.requests;

import com.storage.entities.SaleTransaction;

public record CreateSaleTransactionInput(Integer product, Integer quantity, Float price) {
    public SaleTransaction toSaleTransaction() {
        SaleTransaction transaction = new SaleTransaction();
        
        transaction.setProductId(product)
            .setQuantity(quantity)
            .setPrice(price);

        return transaction;
    }
}
