package Lectures1.HW;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> buyProduct;

    public Basket(ArrayList<Product> buyProduct) {
        this.buyProduct = new ArrayList<>();
    }

    public Basket() {
    }

    public List<Product> getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(List<Product> buyProduct) {
        this.buyProduct = buyProduct;
    }
    public void addBuyProduct(Product product){
        buyProduct.add(product);
    }
    public void removeBuyProduct(Product product){
        buyProduct.remove(product);
    }

}

