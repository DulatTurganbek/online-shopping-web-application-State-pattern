package A10State;

public class Cancelledd implements IPossibleStates {
    public Cancelledd(){
        System.out.println("Заказ отменен // Order cancelled");
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
        System.out.println("Невозможно отправить заказ потому что заказ был отменен // The order could not be shipped because the order was canceled");
    }

    @Override
    public void Cancelled(Order context) {

    }
}
