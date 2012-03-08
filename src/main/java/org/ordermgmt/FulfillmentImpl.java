package org.ordermgmt;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface = "com.mule.example.legacy.IFulfillment", serviceName = "Fulfillment")
public class FulfillmentImpl implements IFulfillment{
	
	public ShippingOrder shippingOrder;
	public ShippingOrderConfirmation shippingOrderConfirmation;
	
	@Override
	@WebResult(name="ShippingOrderConfirmation")
	public ShippingOrderConfirmation putShippingOrder(@WebParam(name="shippingId") String shippingId,
			 										  @WebParam(name="order")  Order order){

		try {
			shippingOrder = new ShippingOrder(shippingId, order);
			shippingOrderConfirmation = new ShippingOrderConfirmation(shippingOrder,true);
		} catch(Exception e)
		
		{
			e.printStackTrace();
		}

		return shippingOrderConfirmation;
	}
}
