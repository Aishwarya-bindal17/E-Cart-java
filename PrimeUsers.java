
class PrimeUsers extends Customers implements OrderPayment{
	@Override
	public double CalculateBill(double amount) {
        // 10% discount
        return amount * 0.70;
    }
}