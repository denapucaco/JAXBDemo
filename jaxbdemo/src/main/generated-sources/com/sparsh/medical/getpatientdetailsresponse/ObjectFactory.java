//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.21 at 12:05:38 AM IST 
//


package com.sparsh.medical.getpatientdetailsresponse;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sparsh.medical.getpatientdetailsresponse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sparsh.medical.getpatientdetailsresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPatientDetailsResponse }
     * 
     */
    public GetPatientDetailsResponse createGetPatientDetailsResponse() {
        return new GetPatientDetailsResponse();
    }

    /**
     * Create an instance of {@link Patients }
     * 
     */
    public Patients createPatients() {
        return new Patients();
    }

    /**
     * Create an instance of {@link ServiceErrors }
     * 
     */
    public ServiceErrors createServiceErrors() {
        return new ServiceErrors();
    }

    /**
     * Create an instance of {@link PatientHistoryDetail }
     * 
     */
    public PatientHistoryDetail createPatientHistoryDetail() {
        return new PatientHistoryDetail();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link PatientHistoryDetails }
     * 
     */
    public PatientHistoryDetails createPatientHistoryDetails() {
        return new PatientHistoryDetails();
    }

}
