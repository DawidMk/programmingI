package pl.sda.programmingI.day5.shop;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private String name;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
