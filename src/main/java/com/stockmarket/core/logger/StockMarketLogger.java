package com.stockmarket.core.logger;

import org.slf4j.event.Level;

public interface StockMarketLogger {
    StockMarketLogger log(String message,Object ...parameters);

    StockMarketLogger info();

    StockMarketLogger debug();

    StockMarketLogger warn();

    StockMarketLogger error();
}
