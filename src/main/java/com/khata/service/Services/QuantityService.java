package com.khata.service.Services;

import com.khata.service.entitymodels.AvailableStocks;
import com.khata.service.models.AvailableStockInfo;
import com.khata.service.repositories.AvailableStocksRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class QuantityService {

    @Autowired
    private AvailableStocksRepository availableStocksRepository;

    public List<AvailableStockInfo> getAvailableStockInfo(Date date){
        List<AvailableStocks> availableStocks = availableStocksRepository.findByCreatedOn(date);
        return null;
    }
}
