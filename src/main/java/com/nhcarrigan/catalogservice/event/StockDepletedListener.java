package com.nhcarrigan.catalogservice.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StockDepletedListener {

    private static final Logger log = LoggerFactory.getLogger(StockDepletedListener.class);

    @EventListener
    public void handleStockDepletedEvent(StockDepletedEvent event) {
        log.info("Product ID of product with 0 stock is: {}", event.productId());
    }
}