
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeID" type="{http://www.gleif.org/data/schema/rr/2016}LEIType"/&gt;
 *         &lt;element name="NodeIDType" type="{http://www.gleif.org/data/schema/rr/2016}NodeIDTypeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
    "nodeID",
    "nodeIDType"
})
public class NodeType {

    @XmlElement(name = "NodeID", required = true)
    protected String nodeID;
    @XmlElement(name = "NodeIDType", required = true)
    @XmlSchemaType(name = "string")
    protected NodeIDTypeEnum nodeIDType;

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the nodeIDType property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIDTypeEnum }
     *     
     */
    public NodeIDTypeEnum getNodeIDType() {
        return nodeIDType;
    }

    /**
     * Sets the value of the nodeIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIDTypeEnum }
     *     
     */
    public void setNodeIDType(NodeIDTypeEnum value) {
        this.nodeIDType = value;
    }

}
