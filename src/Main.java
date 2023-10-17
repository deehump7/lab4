class Clothing {
    // Common properties for all clothing
    String color;
    double price;

    // Constructor for Clothing
    public Clothing(String color, double price) {
        this.color = color;
        this.price = price;
    }

    // Method to display clothing details
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}

class FallClothing extends Clothing {
    String material;

    public FallClothing(String color, double price, String material) {
        super(color, price);
        this.material = material;
    }

    @Override
    public void display() {
        super.display();  // Call parent class's display method
        System.out.println("Material: " + material);
    }
}

class Jacket extends FallClothing {
    String jacketType;

    public Jacket(String color, double price, String material, String jacketType) {
        super(color, price, material);
        this.jacketType = jacketType;
    }

    @Override
    public void display() {
        super.display();  // Call parent class's display method
        System.out.println("Jacket Type: " + jacketType);
    }
}

class Sweater extends FallClothing {
    String sweaterType;

    public Sweater(String color, double price, String material, String sweaterType) {
        super(color, price, material);
        this.sweaterType = sweaterType;
    }

    @Override
    public void display() {
        super.display();  // Call parent class's display method
        System.out.println("Sweater Type: " + sweaterType);
    }
}

class Pants extends FallClothing {
    String pantsType;

    public Pants(String color, double price, String material, String pantsType) {
        super(color, price, material);
        this.pantsType = pantsType;
    }

    @Override
    public void display() {
        super.display();  // Call parent class's display method
        System.out.println("Pants Type: " + pantsType);
    }
}

public class Main {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("Brown", 59.99, "Wool", "Winter Jacket");
        jacket.display();

        System.out.println();

        Sweater sweater = new Sweater("Blue", 29.99, "Cashmere", "Crewneck");
        sweater.display();

        System.out.println();

        Pants pants = new Pants("Black", 39.99, "Cotton", "Slim Fit");
        pants.display();
    }
}
