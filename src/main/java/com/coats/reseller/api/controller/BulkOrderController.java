package com.coats.reseller.api.controller;

import com.coats.reseller.api.domain.BulkOrder;
import com.coats.reseller.api.domain.BulkOrderLine;
import com.coats.reseller.api.repository.BulkOrderLineRepository;
import com.coats.reseller.api.repository.BulkOrderRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BulkOrderController {

    private final BulkOrderRepository bulkOrderRepository;
    private final BulkOrderLineRepository bulkOrderLineRepository;

    public BulkOrderController(BulkOrderRepository bulkOrderRepository, BulkOrderLineRepository bulkOrderLineRepository){
        this.bulkOrderRepository = bulkOrderRepository;
        this.bulkOrderLineRepository = bulkOrderLineRepository;
    }

    @GetMapping("/saveOrder")
    private String getTemperature(){
        BulkOrder bulkOrder = new BulkOrder();
        bulkOrder.setBulkOrderId(0);
        bulkOrder.setOrderLine(0);
        bulkOrder.setSourceId(9);
        bulkOrder.setOrderNo("JavaAPI");
        bulkOrder.setSalesOrgId(93l);
        bulkOrder.setCustomerId(193578);
        bulkOrder.setRequesterId(264876);
        bulkOrder.setShipToPartyId(231067);
        bulkOrder.setBuyerId(121);
        bulkOrder.setPoNumber("damn-good_po");
        bulkOrder.setSurchargeValue("0.0");
        bulkOrder.setDiscountValue("0.0");
        bulkOrder.setNetValue("0.0");
        bulkOrder.setCurrency("");
        bulkOrder.setStatusId(1);
        bulkOrder.setSoNumber("0");
        bulkOrder.setCreated(new Date());
        bulkOrder.setCreatedUserId(264876);
        bulkOrder.setUpdated(new Date());

        BulkOrder bulkOrder1 = bulkOrderRepository.save(bulkOrder);
        System.out.println(bulkOrder1.getId());
        return "Success";


    }

    @GetMapping("/saveOrderLine")
    private String saveOrderLine(){
        BulkOrderLine bulkOrderLine = new BulkOrderLine();
        bulkOrderLine.setOrderId("8a4183a673048f6e0173048fc8890000");
        bulkOrderLine.setBulkOrderId(123);
        bulkOrderLine.setLineNo(1330);
        bulkOrderLine.setCustomerMaterialNo("");
        bulkOrderLine.setArticleId(62599l);
        bulkOrderLine.setBrandId(88l);
        bulkOrderLine.setTicketId(7l);
        bulkOrderLine.setLengthId(45l);
        bulkOrderLine.setFinishId(1l);
        bulkOrderLine.setShadeId(927215l);
        bulkOrderLine.setCoatsMaterialNo("0321010-C4920");
        bulkOrderLine.setOrderedQuantity(2l);
        bulkOrderLine.setAdjustedQuantity(2l);
        bulkOrderLine.setProducedQuantity(0l);
        bulkOrderLine.setSoLineNumber(0l);
        bulkOrderLine.setStatus_id(2);
        bulkOrderLine.setRequired_date(new Date());
        BulkOrderLine BulkOrderLine1 = bulkOrderLineRepository.save(bulkOrderLine);
        System.out.println(BulkOrderLine1.getId());
        return "Success";


    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private String createOrder(){
        return "";
    }
}
