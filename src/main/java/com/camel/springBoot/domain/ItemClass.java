package com.camel.springBoot.domain;

import java.math.BigDecimal;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;


@CsvRecord(separator=",", skipFirstLine=true)
public class ItemClass {
	
	@DataField(pos=1)
	private String transactionType;
	
	@DataField(pos=2)
	private String sku;

	@DataField(pos=3)
	private String itemsdescription;
	

	@DataField(pos=4)
	private BigDecimal price;


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getItemsdescription() {
		return itemsdescription;
	}


	public void setItemsdescription(String itemsdescription) {
		this.itemsdescription = itemsdescription;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "ItemClass [transactionType=" + transactionType + ", sku=" + sku
				+ ", itemsdescription=" + itemsdescription + ", price=" + price
				+ "]";
	}
	

}
