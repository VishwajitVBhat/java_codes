package day_20_06_2025;

import java.util.ArrayList;
import java.util.List;

class Customer {
    String uname;
    List<Products> added = new ArrayList<>();
    
    public Customer(String name) {
        this.uname = name;
    }
    
    @Override
    public String toString() {
        return uname;
    }
}
