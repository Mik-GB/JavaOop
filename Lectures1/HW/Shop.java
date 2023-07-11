package Lectures1.HW;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Category> categories;

    public Shop(ArrayList<Category> categories) {
        this.name = name;
        this.categories = new ArrayList<>();
    }

    public Shop() {
    }

    public String getName(){
        return name;
    }
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
    public void addCategory(Category category){
        categories.add(category);
    }
    public void printCat(){
        for (Category category : categories) {
            System.out.println(category.getNameCategory());
            List<Product> products = category.getArrayProduct();
            for (Product product : products) {
                System.out.println("- " + product.getName() + " - " + product.getPrice() + " - " + product.getRating());
            }
        }
    }
}
