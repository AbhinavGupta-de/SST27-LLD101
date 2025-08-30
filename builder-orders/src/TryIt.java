import com.example.orders.Order;
import com.example.orders.OrderLine;

public class TryIt
{
	public static void main(String[] args)
	{
		OrderLine l1 = new OrderLine("A", 1, 200);
		OrderLine l2 = new OrderLine("B", 3, 100);
		Order o = new Order.OrderBuilder("o2", l1).withCustomerEmail("a@b.com").withLine(l2).withDiscountPercent(10)
												  .build();
//		o.setDiscountPercent(10);
		System.out.println("Before: " + o.totalAfterDiscount());
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
	}
}
