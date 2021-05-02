package com.artsgard.retailapplicationkafka;

/**
 *
 * @author WillemDragstra
 */
public interface ProductMessagingService {

  void sendProduct(Product product);
  
}
