package com.nhcarrigan.catalogservice.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.event.TransactionPhase;

@Component
public class StockDepletedListener {

    private static final Logger log = LoggerFactory.getLogger(StockDepletedListener.class);

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, fallbackExecution = true)
    public void handleStockDepletedEvent(StockDepletedEvent event) {
        log.info("Product ID of product with 0 stock is: {}", event.productId());
    }
}