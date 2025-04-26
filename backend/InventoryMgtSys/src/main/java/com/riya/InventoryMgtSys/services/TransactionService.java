package com.riya.InventoryMgtSys.services;

import com.riya.InventoryMgtSys.dtos.Response;
import com.riya.InventoryMgtSys.dtos.TransactionRequest;
import com.riya.InventoryMgtSys.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}