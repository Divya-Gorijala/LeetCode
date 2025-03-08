package linkedin_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StoreItem {
    String name;
    double price;
    double discount;
    public StoreItem(String name, double price, double discount){
        this.name=name;
        this.price=price;
        this.discount=discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public static Optional<StoreItem> findLeastExpensive(List<StoreItem> items) {
        if(items==null){return null;}
        StoreItem resultItem= items.get(0);
       double min=items.get(0).getPrice()*(1-items.get(0).getDiscount());
        for(StoreItem item: items){
            if(item.getPrice()*item.getDiscount()<min){
                min=item.getPrice()*(1-item.getDiscount());
                resultItem=item;
            }
        }
        return Optional.ofNullable(resultItem);
    }
}
