package org.ordermgmt;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IFulfillment {

	/**
	 * 
	 * @param shippingId
	 * @param order
	 * @return
	 */
	
	@WebResult(name="ShippingOrderConfirmation")
	public ShippingOrderConfirmation putShippingOrder(@WebParam(name="shippingId") String shippingId,
			 										  @WebParam(name="order")  Order order);
	
}
