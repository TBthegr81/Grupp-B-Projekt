//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 04:01:46 PM CEST 
//


package subtitles2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sub" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                   &lt;element name="toTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                   &lt;element name="lines">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sub"
})
@XmlRootElement(name = "subtitle")
public class Subtitle {

    protected List<Subtitle.Sub> sub;

    /**
     * Gets the value of the sub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subtitle.Sub }
     * 
     * 
     */
    public List<Subtitle.Sub> getSub() {
        if (sub == null) {
            sub = new ArrayList<Subtitle.Sub>();
        }
        return this.sub;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *         &lt;element name="toTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *         &lt;element name="lines">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "fromTime",
        "toTime",
        "lines"
    })
    public static class Sub {

        protected byte id;
        @XmlElement(required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar fromTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar toTime;
        @XmlElement(required = true)
        protected Subtitle.Sub.Lines lines;

        /**
         * Gets the value of the id property.
         * 
         */
        public byte getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(byte value) {
            this.id = value;
        }

        /**
         * Gets the value of the fromTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromTime() {
            return fromTime;
        }

        /**
         * Sets the value of the fromTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromTime(XMLGregorianCalendar value) {
            this.fromTime = value;
        }

        /**
         * Gets the value of the toTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToTime() {
            return toTime;
        }

        /**
         * Sets the value of the toTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToTime(XMLGregorianCalendar value) {
            this.toTime = value;
        }

        /**
         * Gets the value of the lines property.
         * 
         * @return
         *     possible object is
         *     {@link Subtitle.Sub.Lines }
         *     
         */
        public Subtitle.Sub.Lines getLines() {
            return lines;
        }

        /**
         * Sets the value of the lines property.
         * 
         * @param value
         *     allowed object is
         *     {@link Subtitle.Sub.Lines }
         *     
         */
        public void setLines(Subtitle.Sub.Lines value) {
            this.lines = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "line"
        })
        public static class Lines {

            protected List<String> line;

            /**
             * Gets the value of the line property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the line property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLine().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLine() {
                if (line == null) {
                    line = new ArrayList<String>();
                }
                return this.line;
            }

        }

    }

}
