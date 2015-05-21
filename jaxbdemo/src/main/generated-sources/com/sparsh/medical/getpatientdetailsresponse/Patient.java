//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.21 at 12:05:38 AM IST 
//


package com.sparsh.medical.getpatientdetailsresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PatientAge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DoctorSpeciality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DischargeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PatientStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PatientHistoryDetails" type="{urn:com.sparsh.medical.getpatientdetailsresponse}PatientHistoryDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "patientID",
    "patientName",
    "patientAge",
    "doctorName",
    "doctorSpeciality",
    "admissionDate",
    "dischargeDate",
    "patientStatus",
    "patientHistoryDetails"
})
public class Patient {

    @XmlElement(name = "PatientID", required = true)
    protected String patientID;
    @XmlElement(name = "PatientName", required = true)
    protected String patientName;
    @XmlElement(name = "PatientAge", required = true)
    protected BigInteger patientAge;
    @XmlElement(name = "DoctorName", required = true)
    protected String doctorName;
    @XmlElement(name = "DoctorSpeciality", required = true)
    protected String doctorSpeciality;
    @XmlElement(name = "AdmissionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admissionDate;
    @XmlElement(name = "DischargeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dischargeDate;
    @XmlElement(name = "PatientStatus", required = true)
    protected String patientStatus;
    @XmlElement(name = "PatientHistoryDetails", required = true)
    protected PatientHistoryDetails patientHistoryDetails;

    /**
     * Default no-arg constructor
     * 
     */
    public Patient() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Patient(final String patientID, final String patientName, final BigInteger patientAge, final String doctorName, final String doctorSpeciality, final XMLGregorianCalendar admissionDate, final XMLGregorianCalendar dischargeDate, final String patientStatus, final PatientHistoryDetails patientHistoryDetails) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.patientStatus = patientStatus;
        this.patientHistoryDetails = patientHistoryDetails;
    }

    /**
     * Gets the value of the patientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * Sets the value of the patientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientID(String value) {
        this.patientID = value;
    }

    /**
     * Gets the value of the patientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * Sets the value of the patientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientName(String value) {
        this.patientName = value;
    }

    /**
     * Gets the value of the patientAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatientAge() {
        return patientAge;
    }

    /**
     * Sets the value of the patientAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatientAge(BigInteger value) {
        this.patientAge = value;
    }

    /**
     * Gets the value of the doctorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * Sets the value of the doctorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorName(String value) {
        this.doctorName = value;
    }

    /**
     * Gets the value of the doctorSpeciality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    /**
     * Sets the value of the doctorSpeciality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorSpeciality(String value) {
        this.doctorSpeciality = value;
    }

    /**
     * Gets the value of the admissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Sets the value of the admissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmissionDate(XMLGregorianCalendar value) {
        this.admissionDate = value;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeDate(XMLGregorianCalendar value) {
        this.dischargeDate = value;
    }

    /**
     * Gets the value of the patientStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientStatus() {
        return patientStatus;
    }

    /**
     * Sets the value of the patientStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientStatus(String value) {
        this.patientStatus = value;
    }

    /**
     * Gets the value of the patientHistoryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PatientHistoryDetails }
     *     
     */
    public PatientHistoryDetails getPatientHistoryDetails() {
        return patientHistoryDetails;
    }

    /**
     * Sets the value of the patientHistoryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientHistoryDetails }
     *     
     */
    public void setPatientHistoryDetails(PatientHistoryDetails value) {
        this.patientHistoryDetails = value;
    }

}
