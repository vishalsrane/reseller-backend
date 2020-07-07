package com.coats.reseller.api.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode //(exclude = {"recipes"})
@Entity
@Table(name="coats_reseller_bulk_order_line")
public class BulkOrderLine {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    private String orderId;
    private Integer bulkOrderId;
    private Integer lineNo;
    private String customerMaterialNo;
    private Long articleId;
    private Long brandId;
    private Long ticketId;
    private Long lengthId;
    private Long finishId;
    private Long shadeId;
    private String coatsMaterialNo;
    private Long orderedQuantity;
    private Long adjustedQuantity;
    private Long producedQuantity;
    private Long soLineNumber;
    private Integer status_id;
    private Date required_date;
    private String price;
}
