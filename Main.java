package A10State;

public class Main {
    public static void main(String[] args) {
        NewOrderr initialState = new NewOrderr();
        Order order1 = new Order(initialState);
        order1.OrderConfirmed();
        order1.NewOrder();
        order1.Invoiced();
        order1.Shipped();
        order1.Cancelled();
    }
}
