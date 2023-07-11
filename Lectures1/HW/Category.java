package Lectures1.HW;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nameCategory;
    private List<Product> arrayProduct;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        this.arrayProduct = new ArrayList<>();
    }

    public Category() {
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public List<Product> getArrayProduct() {
        return arrayProduct;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void setArrayProduct(List<Product> arrayProduct) {
        this.arrayProduct = arrayProduct;
    }
    public void addProductCategory(Product product) {
        arrayProduct.add(product);
    }
}
