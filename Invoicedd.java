package A10State;


public class Invoicedd implements  IPossibleStates{
    public Invoicedd(){
        System.out.println("Выставлен счет по вашему заказу // Your order has been invoiced");
    }


    @Override
    public void NewOrder(Order context) {
        System.out.println("Нельзя добавить новый заказ в текущем состоянии // You cannot add a new order in the current state");
    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Нельзя подтвердить заказ в текущем состоянии // Order cannot be confirmed in its current state");
    }

    @Override
    public void Invoiced(Order context) {
        System.out.println("Уже выставили счет по заказу // Already invoiced for the order");
    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Заказ было отправлено // The order has been sent ");
        context.setCurrentState(new Shippedd());
    }

    @Override
    public void Cancelled(Order context) {
        System.out.println("Заказ отменен // Order cancelled");
        context.setCurrentState(new Cancelledd());
    }
}
