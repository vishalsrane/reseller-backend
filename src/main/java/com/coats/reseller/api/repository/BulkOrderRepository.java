package com.coats.reseller.api.repository;

import com.coats.reseller.api.domain.BulkOrder;
import org.springframework.data.repository.CrudRepository;

public interface BulkOrderRepository extends CrudRepository<BulkOrder, String> {
}
