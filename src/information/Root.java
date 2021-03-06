//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 02:12:26 PM CEST 
//


package information;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="movie">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="rated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="released" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="runtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="genre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="director" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="writer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="actors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="plot" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="poster" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="imdbRating" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="imdbVotes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="imdbID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="response" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "movie"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected Root.Movie movie;
    @XmlAttribute(name = "response")
    protected String response;

    /**
     * Gets the value of the movie property.
     * 
     * @return
     *     possible object is
     *     {@link Root.Movie }
     *     
     */
    public Root.Movie getMovie() {
        return movie;
    }

    /**
     * Sets the value of the movie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Movie }
     *     
     */
    public void setMovie(Root.Movie value) {
        this.movie = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="rated" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="released" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="runtime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="genre" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="director" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="writer" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="actors" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="plot" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="poster" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="imdbRating" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="imdbVotes" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="imdbID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Movie {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "year")
        protected Short year;
        @XmlAttribute(name = "rated")
        protected String rated;
        @XmlAttribute(name = "released")
        protected String released;
        @XmlAttribute(name = "runtime")
        protected String runtime;
        @XmlAttribute(name = "genre")
        protected String genre;
        @XmlAttribute(name = "director")
        protected String director;
        @XmlAttribute(name = "writer")
        protected String writer;
        @XmlAttribute(name = "actors")
        protected String actors;
        @XmlAttribute(name = "plot")
        protected String plot;
        @XmlAttribute(name = "poster")
        @XmlSchemaType(name = "anyURI")
        protected String poster;
        @XmlAttribute(name = "imdbRating")
        protected Float imdbRating;
        @XmlAttribute(name = "imdbVotes")
        protected String imdbVotes;
        @XmlAttribute(name = "imdbID")
        protected String imdbID;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setYear(Short value) {
            this.year = value;
        }

        /**
         * Gets the value of the rated property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRated() {
            return rated;
        }

        /**
         * Sets the value of the rated property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRated(String value) {
            this.rated = value;
        }

        /**
         * Gets the value of the released property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReleased() {
            return released;
        }

        /**
         * Sets the value of the released property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReleased(String value) {
            this.released = value;
        }

        /**
         * Gets the value of the runtime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuntime() {
            return runtime;
        }

        /**
         * Sets the value of the runtime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuntime(String value) {
            this.runtime = value;
        }

        /**
         * Gets the value of the genre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenre() {
            return genre;
        }

        /**
         * Sets the value of the genre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenre(String value) {
            this.genre = value;
        }

        /**
         * Gets the value of the director property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirector() {
            return director;
        }

        /**
         * Sets the value of the director property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirector(String value) {
            this.director = value;
        }

        /**
         * Gets the value of the writer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWriter() {
            return writer;
        }

        /**
         * Sets the value of the writer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWriter(String value) {
            this.writer = value;
        }

        /**
         * Gets the value of the actors property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActors() {
            return actors;
        }

        /**
         * Sets the value of the actors property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActors(String value) {
            this.actors = value;
        }

        /**
         * Gets the value of the plot property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlot() {
            return plot;
        }

        /**
         * Sets the value of the plot property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlot(String value) {
            this.plot = value;
        }

        /**
         * Gets the value of the poster property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoster() {
            return poster;
        }

        /**
         * Sets the value of the poster property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoster(String value) {
            this.poster = value;
        }

        /**
         * Gets the value of the imdbRating property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getImdbRating() {
            return imdbRating;
        }

        /**
         * Sets the value of the imdbRating property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setImdbRating(Float value) {
            this.imdbRating = value;
        }

        /**
         * Gets the value of the imdbVotes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImdbVotes() {
            return imdbVotes;
        }

        /**
         * Sets the value of the imdbVotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImdbVotes(String value) {
            this.imdbVotes = value;
        }

        /**
         * Gets the value of the imdbID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImdbID() {
            return imdbID;
        }

        /**
         * Sets the value of the imdbID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImdbID(String value) {
            this.imdbID = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
