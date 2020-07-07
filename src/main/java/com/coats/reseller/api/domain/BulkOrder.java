package com.coats.reseller.api.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode //(exclude = {"recipes"})
@Entity
@Table(name="coats_reseller_bulk_order")
public class BulkOrder {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    private Integer bulkOrderId;
    private Integer orderLine;
    private Integer sourceId;
    private String orderNo;
    private Long salesOrgId;
    private Integer customerId;
    private Integer requesterId;
    private Integer shipToPartyId;
    private Integer buyerId;
    private String poNumber;
    private String surchargeValue;
    private String discountValue;
    private String netValue;
    private String currency;
    private Integer statusId;
    private String soNumber;
    private Date created;
    private Integer createdUserId;
    private Date updated;
}
