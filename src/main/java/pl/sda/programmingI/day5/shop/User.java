package pl.sda.programmingI.day5.shop;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String address;
    List<Cart> cartList = new ArrayList<>();


    public User() {
    }

    public User(String name, String address, List<Cart> cartList) {
        this.name = name;
        this.address = address;
        this.cartList = cartList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
}
