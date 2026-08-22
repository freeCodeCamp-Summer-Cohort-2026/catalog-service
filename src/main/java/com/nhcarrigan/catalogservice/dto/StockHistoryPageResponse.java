package com.nhcarrigan.catalogservice.dto;

import com.nhcarrigan.catalogservice.entity.StockAdjustmentLog;
import java.util.List;
import org.springframework.data.domain.Page;

public record StockHistoryPageResponse(
    List<StockAdjustmentLog> content, long totalElements, int totalPages) {

  public static StockHistoryPageResponse from(Page<StockAdjustmentLog> page) {
    return new StockHistoryPageResponse(
        page.getContent(), page.getTotalElements(), page.getTotalPages());
  }
}
