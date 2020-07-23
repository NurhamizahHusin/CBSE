
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pocketMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllocation", propOrder = {
    "pocketMoney"
})
public class GetAllocation {

    protected double pocketMoney;

    /**
     * Gets the value of the pocketMoney property.
     * 
     */
    public double getPocketMoney() {
        return pocketMoney;
    }

    /**
     * Sets the value of the pocketMoney property.
     * 
     */
    public void setPocketMoney(double value) {
        this.pocketMoney = value;
    }

}
