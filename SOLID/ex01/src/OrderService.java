public class OrderService implements IOrderService
{
	private final IEmailClient email;
	private final IOrderRepository repository;

	public OrderService(IEmailClient email, IOrderRepository repository)
	{
		this.email = email;
		this.repository = repository;
	}

	double totalWithTax(double subtotal)
	{
		final double taxRate = 0.18;
		return subtotal + subtotal * taxRate;
	}

	public void placeOrder(String customerEmail, double subtotal)
	{
		double total = totalWithTax(subtotal);
		email.sendEmail(customerEmail, "Thanks! Your total is " + total);
		repository.storeOrder(customerEmail, total);
	}
}