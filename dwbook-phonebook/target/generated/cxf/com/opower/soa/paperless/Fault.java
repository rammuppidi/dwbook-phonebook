
package com.opower.soa.paperless;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponseText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="parm1" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm3" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm4" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm5" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm6" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm7" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm8" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="parm9" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="numParm" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServerMessage" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CallSequence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Table" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Fault", namespace = "http://ouaf.oracle.com/")
public class Fault {

    @XmlElement(name = "ResponseStatus", namespace = "", required = true)
    protected String responseStatus;
    @XmlElement(name = "ResponseCode", namespace = "")
    protected int responseCode;
    @XmlElement(name = "ResponseText", namespace = "", required = true)
    protected String responseText;
    @XmlElement(name = "ResponseData", namespace = "")
    protected Fault.ResponseData responseData;
    @XmlElement(name = "ServerMessage", namespace = "")
    protected Fault.ServerMessage serverMessage;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatus(String value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets the value of the responseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link Fault.ResponseData }
     *     
     */
    public Fault.ResponseData getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault.ResponseData }
     *     
     */
    public void setResponseData(Fault.ResponseData value) {
        this.responseData = value;
    }

    /**
     * Gets the value of the serverMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Fault.ServerMessage }
     *     
     */
    public Fault.ServerMessage getServerMessage() {
        return serverMessage;
    }

    /**
     * Sets the value of the serverMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault.ServerMessage }
     *     
     */
    public void setServerMessage(Fault.ServerMessage value) {
        this.serverMessage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="parm1" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm3" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm4" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm5" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm6" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm7" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm8" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="parm9" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="numParm" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponseData {

        @XmlAttribute(name = "parm1")
        protected String parm1;
        @XmlAttribute(name = "parm2")
        protected String parm2;
        @XmlAttribute(name = "parm3")
        protected String parm3;
        @XmlAttribute(name = "parm4")
        protected String parm4;
        @XmlAttribute(name = "parm5")
        protected String parm5;
        @XmlAttribute(name = "parm6")
        protected String parm6;
        @XmlAttribute(name = "parm7")
        protected String parm7;
        @XmlAttribute(name = "parm8")
        protected String parm8;
        @XmlAttribute(name = "parm9")
        protected String parm9;
        @XmlAttribute(name = "text")
        protected String text;
        @XmlAttribute(name = "category")
        protected String category;
        @XmlAttribute(name = "numParm")
        protected Integer numParm;
        @XmlAttribute(name = "number")
        protected Integer number;

        /**
         * Gets the value of the parm1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm1() {
            return parm1;
        }

        /**
         * Sets the value of the parm1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm1(String value) {
            this.parm1 = value;
        }

        /**
         * Gets the value of the parm2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm2() {
            return parm2;
        }

        /**
         * Sets the value of the parm2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm2(String value) {
            this.parm2 = value;
        }

        /**
         * Gets the value of the parm3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm3() {
            return parm3;
        }

        /**
         * Sets the value of the parm3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm3(String value) {
            this.parm3 = value;
        }

        /**
         * Gets the value of the parm4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm4() {
            return parm4;
        }

        /**
         * Sets the value of the parm4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm4(String value) {
            this.parm4 = value;
        }

        /**
         * Gets the value of the parm5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm5() {
            return parm5;
        }

        /**
         * Sets the value of the parm5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm5(String value) {
            this.parm5 = value;
        }

        /**
         * Gets the value of the parm6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm6() {
            return parm6;
        }

        /**
         * Sets the value of the parm6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm6(String value) {
            this.parm6 = value;
        }

        /**
         * Gets the value of the parm7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm7() {
            return parm7;
        }

        /**
         * Sets the value of the parm7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm7(String value) {
            this.parm7 = value;
        }

        /**
         * Gets the value of the parm8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm8() {
            return parm8;
        }

        /**
         * Sets the value of the parm8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm8(String value) {
            this.parm8 = value;
        }

        /**
         * Gets the value of the parm9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParm9() {
            return parm9;
        }

        /**
         * Sets the value of the parm9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParm9(String value) {
            this.parm9 = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the numParm property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumParm() {
            return numParm;
        }

        /**
         * Sets the value of the numParm property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumParm(Integer value) {
            this.numParm = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumber(Integer value) {
            this.number = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CallSequence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Table" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ServerMessage {

        @XmlElement(name = "Category", namespace = "", required = true)
        protected String category;
        @XmlElement(name = "Number", namespace = "", required = true)
        protected String number;
        @XmlElement(name = "CallSequence", namespace = "", required = true)
        protected String callSequence;
        @XmlElement(name = "ProgramName", namespace = "", required = true)
        protected String programName;
        @XmlElement(name = "Text", namespace = "", required = true)
        protected String text;
        @XmlElement(name = "Description", namespace = "", required = true)
        protected String description;
        @XmlElement(name = "Table", namespace = "", required = true)
        protected String table;
        @XmlElement(name = "Field", namespace = "", required = true)
        protected String field;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the callSequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallSequence() {
            return callSequence;
        }

        /**
         * Sets the value of the callSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallSequence(String value) {
            this.callSequence = value;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the table property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTable() {
            return table;
        }

        /**
         * Sets the value of the table property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTable(String value) {
            this.table = value;
        }

        /**
         * Gets the value of the field property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getField() {
            return field;
        }

        /**
         * Sets the value of the field property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setField(String value) {
            this.field = value;
        }

    }

}
