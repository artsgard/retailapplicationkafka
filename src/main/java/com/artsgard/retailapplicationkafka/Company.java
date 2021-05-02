package com.artsgard.retailapplicationkafka;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import lombok.*;


/**
 *
 * @author WillemDragstra
 *
 */
@Data
@ToString
public class Company implements Serializable {
    private static final long serialVersionUID = 7299843115411952010L;

    //@Id
    private Long id;
    private String companyName;
    private String companyRef;
    private String description;
    private Timestamp registerDate;
    
    //private List<User> companyUsers = new ArrayList<>(0);
    private List<Product> companyProducts = new ArrayList<>(0);

}
