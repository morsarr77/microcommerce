package com.ecommerce.microcommerce.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductTests {
  @Test
  public void toStringProduct(){
    Product product=new Product(1,"nokia",2,1);

    Assert.assertEquals("id:nokia,nom=nokia,prix=2", product.toString());
  }
}
