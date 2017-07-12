package com.task.core;

import java.io.File;

import javax.swing.text.html.HTML.Tag;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class App {

	public static void main(String[] args) {
		File file = new File ("Task.xml");
		
try {
	JAXBContext jaxbContext = JAXBContext.newInstance(QuantityRequestMessage.class);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	QuantityRequestMessage Task = (QuantityRequestMessage) jaxbUnmarshaller.unmarshal(file);

	 System.out.println(Task.getSourceId());
	
} catch (JAXBException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
