package A10State;

public class Shippedd implements IPossibleStates {
    public Shippedd(){
        System.out.println("Заказ отправлен // Order shipped");
    }

    @Override
    public void NewOrder(Order context) {
        System.out.println("Уже невозможно добавить новый заказ // It is no longer possible to add a new order");
    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Нельзя подтвердить заказ в текущем состоянии // Can't confirm order in its current state");
    }

    @Override
    public void Invoiced(Order context) {
        System.out.println("Нельзя выставить счет в текущем состояние // Cannot be invoiced in the current state");
    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Заказ уже был отменен  // The order has already been canceled");
    }

    @Override
    public void Cancelled(Order context) {
        System.out.println("Нельзя отменить заказ потому что заказ был отправлен // Order cannot be canceled because the order has been shipped ");
    }
}
