package com.RaboAndCap.tutorials;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class supermarketProducts implements supermarketProductsInterface{

    @Override
    public String productName(String name) {
        return name;
    }

    @Override
    public float productPrice(float price) {
        return price;
    }
}
