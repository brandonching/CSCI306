import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Item> listsOfItems;
    private int tax;
    private long billAmount;

    public Bill() {
        this.listsOfItems = new ArrayList<>();
        this.tax = 0;
        this.billAmount = 0;
    }

    public Bill(List<Item> listsOfItems, int tax) {
        this.listsOfItems = listsOfItems;
        this.tax = tax;
        this.billAmount = 0;
    }

    public long calculateBill() {
        billAmount = 0;
        for (Item item : listsOfItems) {
            billAmount += item.getPrice();
        }
        billAmount += tax;
        return billAmount;
    }

    public void addItem(Item item) {
        listsOfItems.add(item);
        calculateBill();
    }

    public void removeItem(Item item) {
        listsOfItems.remove(item);
        calculateBill();
    }

    public List<Item> getListsOfItems() {
        return listsOfItems;
    }

    public void setListsOfItems(List<Item> listsOfItems) {
        this.listsOfItems = listsOfItems;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
        calculateBill();
    }

    public long getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(long billAmount) {
        this.billAmount = billAmount;
    }
}
