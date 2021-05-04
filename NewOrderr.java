package A10State;


public class NewOrderr implements IPossibleStates {
    public NewOrderr(){
        System.out.println("Получен новый заказ // New order received");
    }
    @Override
    public void NewOrder(Order context) {
        System.out.println("Чтобы перейти на новый заказ вы должны подтвердить текущий заказ // To switch to a new order, you must confirm the current order");
    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Вы подтвердили заказ // You have confirmed order");
        context.setCurrentState(new Confirmed());
    }

    @Override
    public void Invoiced(Order context) {
        System.out.println("Чтобы выставили счет на заказ сначала вы должны подтвердить заказ To be invoiced for an order, you must first confirm the order");
    }

    @Override
    public void Shipped(Order context) {
        System.out.println("Чтобы отправить заказ сначала должны подтвердить заказ и выставить счет после оплаты можно будет отпраить ваш заказ // To ship the order, you must first confirm the order and issue an invoice after the payment they ship your order");
    }

    @Override
    public void Cancelled(Order context) {
        System.out.println("Вы не можете отменить заказ потому что вы не подтвердили заказ // You cannot cancel the order because you have not confirmed the order");
    }
}