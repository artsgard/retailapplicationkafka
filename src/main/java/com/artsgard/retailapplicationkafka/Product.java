package com.artsgard.retailapplicationkafka;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import lombok.*;


/**
 *
 * @author WillemDragstra
 *
 */
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = -209313219653499455L;
    
    //(@Id
    private Long id;
    private String name;
    private String productRef;
    private String description;
    private BigDecimal price;
    private Boolean promotion;
    private String graduation;

    public enum BeerType {
        PILS, HELLES, STARKBIER, ALTBIER, DUNKELBIER
    }

    private BeerType beerType;
    private String nationality;
    private Timestamp creationDate;
    
    //private List<ProductPurchaseEntity> purchaseOrders = new ArrayList<>(0);
    private Company company;
}

