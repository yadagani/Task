package com.task.core;

public class QuantityRequest {
	
	private String id;
	private String ItemId;
	private String FulfillmentLocationId;
	
	public QuantityRequest() {}
	
	public QuantityRequest(String id, String ItemId, String FulfillmentLocationId ) {
		this.id = id;
		this.ItemId = ItemId;
		this.FulfillmentLocationId = FulfillmentLocationId;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemId() {
		return ItemId;
	}

	public void setItemId(String itemId) {
		ItemId = itemId;
	}

	public String getFulfillmentLocationId() {
		return FulfillmentLocationId;
	}

	public void setFulfillmentLocationId(String fulfillmentLocationId) {
		FulfillmentLocationId = fulfillmentLocationId;
	}

	
	
	
	
}


