package com.artsgard.retailapplicationkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMesasageRunner implements CommandLineRunner {

    @Autowired
    private ProductMessagingService productService;

    @Autowired
    private KafkaProducer kafkaProducer;

    @Override
    public void run(String... args) throws Exception {
        kafkaProducer.send("product-topic2", createProduct());
        kafkaProducer.sendList("product-list-topic2", createProducts());
    }

    private Product createProduct() {
        Product product = new Product();
        product.setName("some-name");
        product.setProductRef("some-ref");
        product.setDescription("some-description");
        product.setPrice(new BigDecimal("23.23"));
        product.setGraduation(Product.BeerType.PILS.toString());
        product.setPromotion(true);
        product.setNationality("some-nation");

        return product;
    }

    private List<Product> createProducts() {
        Product product = new Product();
        product.setName("some-name");
        product.setProductRef("some-ref");
        product.setDescription("some-description");
        product.setPrice(new BigDecimal("23.23"));
        product.setGraduation(Product.BeerType.PILS.toString());
        product.setPromotion(true);
        product.setNationality("some-nation");

        Product product2 = new Product();
        product2.setName("some-name2");
        product2.setProductRef("some-ref2");
        product2.setDescription("some-description2");
        product2.setPrice(new BigDecimal("232.23"));
        product2.setGraduation(Product.BeerType.HELLES.toString());
        product2.setPromotion(false);
        product2.setNationality("some-nation2");

        List<Product> products = new ArrayList();
        products.add(product);
        products.add(product2);

        return products;
    }
}
