package com.sparsh;

public class JAXBDemoClient {

	public static void main(String[] args){

		GetPatientDetailsResponse a  = new GetPatientDetailsResponse();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);

		try {

			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
