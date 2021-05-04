package A10State;

public interface IPossibleStates {

        void NewOrder(Order context);
        void OrderConfirmed(Order context);
        void Invoiced(Order context);
        void Shipped(Order context);
        void Cancelled(Order context);

}
