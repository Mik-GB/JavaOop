package Lectures1.HW;
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Category category = new Category("Food");
        category.addProductCategory(new Product("Bread", 49.5, 5));
        category.addProductCategory(new Product("Banan", 79.5, 4));
        category.addProductCategory(new Product("Apple", 50.0, 3));
        Category category1 = new Category("Electronic");
        category1.addProductCategory(new Product("TV", 15500.0, 3));
        category1.addProductCategory(new Product("Smartphone", 27600.0, 5));
        category1.addProductCategory(new Product("NoteBook", 75000.0, 5));
        shop.addCategory(category);
        shop.addCategory(category1);

        shop.printCat();
    }
}
