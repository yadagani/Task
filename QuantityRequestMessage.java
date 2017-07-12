package com.task.core;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class QuantityRequestMessage {
	
	private  String SourceId;
    private  ArrayList<QuantityRequest>quantityRequest;
    
    public QuantityRequestMessage () {}
    public QuantityRequestMessage (String SourceId, 
   ArrayList<QuantityRequest>quantityRequest) {
    this.SourceId = SourceId;
    this.quantityRequest = quantityRequest;
    }
    
    
    @XmlAttribute
	public String getSourceId() {
		return SourceId;
	}
	public void setSourceId(String sourceId) {
		SourceId = sourceId;
	}
	@XmlElement
	public ArrayList<QuantityRequest> getQuantityRequest() {
		return quantityRequest;
	}
	public void setQuantityRequest(ArrayList<QuantityRequest> quantityRequest) {
		this.quantityRequest = quantityRequest;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
    	
    


}