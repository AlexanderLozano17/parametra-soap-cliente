
package com.parametra.ws.com.parametra.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para empleadoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empleadoEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_nacimineto" type="{http://service.parametra.com/}date" minOccurs="0"/>
 *         &lt;element name="fecha_vinculacion_emp" type="{http://service.parametra.com/}date" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipo_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleadoEntity", propOrder = {
    "apellidos",
    "cargo",
    "fechaNacimineto",
    "fechaVinculacionEmp",
    "id",
    "nombres",
    "salario",
    "tipoDocumento"
})
public class EmpleadoEntity {

    protected String apellidos;
    protected String cargo;
    @XmlElement(name = "fecha_nacimineto")
    protected Date fechaNacimineto;
    @XmlElement(name = "fecha_vinculacion_emp")
    protected Date fechaVinculacionEmp;
    protected int id;
    protected String nombres;
    protected Double salario;
    @XmlElement(name = "tipo_documento")
    protected String tipoDocumento;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimineto.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    /**
     * Define el valor de la propiedad fechaNacimineto.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaNacimineto(Date value) {
        this.fechaNacimineto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVinculacionEmp.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaVinculacionEmp() {
        return fechaVinculacionEmp;
    }

    /**
     * Define el valor de la propiedad fechaVinculacionEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaVinculacionEmp(Date value) {
        this.fechaVinculacionEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad salario.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * Define el valor de la propiedad salario.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalario(Double value) {
        this.salario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
