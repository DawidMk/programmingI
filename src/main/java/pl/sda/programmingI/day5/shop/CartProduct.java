package pl.sda.programmingI.day5.shop;

import java.math.BigDecimal;

public class CartProduct {
    private Product product;
    private Cart cart;
    private BigDecimal price;
    private Integer quantity;

    public CartProduct() {
    }

    public CartProduct(Product product, Cart cart, BigDecimal price, Integer quantity) {
        this.product = product;
        this.cart = cart;
        this.price = price;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
