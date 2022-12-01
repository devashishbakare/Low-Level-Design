package problems.FoodKart.Models;

public class Order {
    private int orderId;
    private String restoName;
    private int quantity;

    public Order(int orderId, String restoName, int quantity) {
        this.orderId = orderId;
        this.restoName = restoName;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getRestoName() {
        return restoName;
    }

    public void setRestoName(String restoName) {
        this.restoName = restoName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
