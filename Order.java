package A10State;

public class Order {
    private IPossibleStates currentState;

    public Order(IPossibleStates currentState) {
        this.currentState = currentState;
    }

    public IPossibleStates getCurrentState() {

        return currentState;
    }

    public void setCurrentState(IPossibleStates currentState) {

        this.currentState = currentState;
    }

    public void NewOrder() {
        currentState.NewOrder(this);
    }

    public void OrderConfirmed() {
        currentState.OrderConfirmed(this);
    }

    public void Invoiced() {
        currentState.Invoiced(this);
    }

    public void Shipped() {
        currentState.Shipped(this);
    }

    public void Cancelled() {
        currentState.Cancelled(this);
    }
}
