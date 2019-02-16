package pl.sda.programmingI.day5.shop;

public class Cart {
    private User user;
    private Product product;

    public Cart() {
    }

    public Cart(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
