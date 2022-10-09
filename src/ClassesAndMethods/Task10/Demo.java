package ClassesAndMethods.Task10;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User();
    }
}

class Item {
    private String itemName;
    private int price;
    private double rating;
}

class Category {
    private String categoryName;
    private Item[] categoryItems;
}

class Basket {
    private Item[] soldItems;
}

class User {
    private String login;
    private String password;
    private Basket userBasket = new Basket();
}
