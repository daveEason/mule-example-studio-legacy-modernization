package org.ordermgmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShippingOrder {

	public String shippingId;
	public Order order;
	
	public ShippingOrder(){
		// default no-argument constructor
	}
	
	public ShippingOrder(String shippingId, Order order){
		setShippingId(shippingId);
		setOrder(order);
	}
	
	@XmlTransient
	public String getShippingId(){
		return this.shippingId;
	}
	
	public void setShippingId(String shippingId){
		this.shippingId = shippingId;
	}
	
	@XmlTransient
	public Order getOrder(){
		return this.order;
	}
	
	public void setOrder(Order order){
		this.order = order;
	}
}
