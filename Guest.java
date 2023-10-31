class Guest extends Customers implements OrderPayment{
	@Override
     public double CalculateBill(double amount) {
        // Guest doesn't get any discount but pays 5% delivery charge
        double deliveryCharge = amount * 0.05;
        return amount + deliveryCharge;
    }
}
