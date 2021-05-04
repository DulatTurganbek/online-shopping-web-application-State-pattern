package A10State;

public class Confirmed implements IPossibleStates {
    public Confirmed(){
        System.out.println("Заказ подтвержден // Order confirmed");
    }
    @Override
    public void NewOrder(Order context) {
        System.out.println("Вы добавили еще один заказ // You added another order");
    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Вы уже подтвердили заказ // You have already confirmed your order");

    }

    @Override
    public void Invoiced(Order context) {
        System.out.println("Выставили счет по вашему заказу // Issued an invoice for your order");
        context.setCurrentState(new Invoicedd());
    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Сначала должны выставить счет затем можно будет отправить заказ // First must issue an invoice then the order can be sent(ship)");

    }

    @Override
    public void Cancelled(Order context) {
        System.out.println("Заказ отменен // Order cancelled");
        context.setCurrentState(new Cancelledd());

    }
}
