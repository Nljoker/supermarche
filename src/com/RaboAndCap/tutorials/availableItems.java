package com.RaboAndCap.tutorials;

public class availableItems {
    Cereals cereals = new Cereals();
    Soap soap = new Soap();
    Chinese_Vegetables chinese_vegetables = new Chinese_Vegetables();
    Diapers diapers = new Diapers();
    Yoghurt yoghurt = new Yoghurt();

    String[] products = {cereals.productName(), soap.productName(),
            chinese_vegetables.productName(), diapers.productName(), yoghurt.productName()};
    float[] productPrices = {cereals.productPrice(), soap.productPrice(),
            chinese_vegetables.productPrice(), diapers.productPrice(), yoghurt.productPrice()};
}
