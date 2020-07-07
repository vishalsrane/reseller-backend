package com.coats.reseller.api.repository;

import com.coats.reseller.api.domain.BulkOrderLine;
import org.springframework.data.repository.CrudRepository;

public interface BulkOrderLineRepository extends CrudRepository<BulkOrderLine, String> {
}
