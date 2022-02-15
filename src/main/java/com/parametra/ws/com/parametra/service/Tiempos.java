
package com.parametra.ws.com.parametra.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tiempos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tiempos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puede_trabajar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiempo_vinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiempos", propOrder = {
    "edad",
    "puedeTrabajar",
    "tiempoVinculacion"
})
public class Tiempos {

    protected String edad;
    @XmlElement(name = "puede_trabajar")
    protected String puedeTrabajar;
    @XmlElement(name = "tiempo_vinculacion")
    protected String tiempoVinculacion;

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdad(String value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad puedeTrabajar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuedeTrabajar() {
        return puedeTrabajar;
    }

    /**
     * Define el valor de la propiedad puedeTrabajar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuedeTrabajar(String value) {
        this.puedeTrabajar = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoVinculacion() {
        return tiempoVinculacion;
    }

    /**
     * Define el valor de la propiedad tiempoVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoVinculacion(String value) {
        this.tiempoVinculacion = value;
    }

}
