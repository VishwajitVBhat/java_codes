package day_20_06_2025;

class Products {
    int id;
    String name;
    int quantity;
    double price;
    double total;
    
    public Products(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = quantity * price;
    }
    
    @Override
    public String toString() {
        return String.format("|%-12s |%-9d |%-8.2f |%-7.2f|", name, quantity, price, total);
    }
}
