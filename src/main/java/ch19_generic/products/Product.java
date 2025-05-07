package ch19_generic.products;

import lombok.AllArgsConstructor;

import lombok.ToString;

@AllArgsConstructor

@ToString           // @Data를 달아서 해결하는 방법 , toString() 메서드를 재정의하는 방법도 있음.
public class Product <T> {
    private String poductName;
    private T productInfo;


}
