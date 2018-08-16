package com.hlcui.disruptor;

public class TradeTransaction {
	private String id;
	private double price;

	public TradeTransaction() {
	}

	public TradeTransaction(String id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}