package org.ordermgmt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShippingOrder {

	public String shippingId;
	public Address billingAddress;
	public Address shippingAddress;
	public Order order;
	
	public ShippingOrder(){
		// default no-argument constructor
	}
	
	public ShippingOrder(String shippingId, Address billingAddress, Address shippingAddress, Order order){
		setShippingId(shippingId);
		setBillingAdddress(billingAddress);
		setShippingAdddress(shippingAddress);
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

	@XmlTransient
	public Address getBillingAddress(){
		return this.billingAddress;
	}
	
	public void setBillingAdddress(Address billingAddress){
		this.billingAddress = billingAddress;
	}

	@XmlTransient
	public Address getShippingAddress(){
		return this.shippingAddress;
	}
	
	public void setShippingAdddress(Address shippingAddress){
		this.shippingAddress = shippingAddress;
	}

}
