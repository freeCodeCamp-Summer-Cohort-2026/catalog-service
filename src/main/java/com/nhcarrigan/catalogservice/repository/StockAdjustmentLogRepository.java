package com.nhcarrigan.catalogservice.repository;

import com.nhcarrigan.catalogservice.entity.StockAdjustmentLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockAdjustmentLogRepository extends JpaRepository<StockAdjustmentLog, Long> {

  Page<StockAdjustmentLog> findByProductIdOrderByTimestampDescIdDesc(
      Long productId, Pageable pageable);
}
