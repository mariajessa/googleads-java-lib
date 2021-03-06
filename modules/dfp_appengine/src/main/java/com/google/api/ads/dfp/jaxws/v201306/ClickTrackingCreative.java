
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A creative that is used for tracking clicks on ads that are served directly
 *             from the customers' web servers or media servers.
 *             NOTE: The size attribute is not used for click tracking creative and it will
 *             not be persisted upon save.
 *           
 * 
 * <p>Java class for ClickTrackingCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClickTrackingCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201306}Creative">
 *       &lt;sequence>
 *         &lt;element name="clickTrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClickTrackingCreative", propOrder = {
    "clickTrackingUrl"
})
public class ClickTrackingCreative
    extends Creative
{

    protected String clickTrackingUrl;

    /**
     * Gets the value of the clickTrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClickTrackingUrl() {
        return clickTrackingUrl;
    }

    /**
     * Sets the value of the clickTrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickTrackingUrl(String value) {
        this.clickTrackingUrl = value;
    }

}
