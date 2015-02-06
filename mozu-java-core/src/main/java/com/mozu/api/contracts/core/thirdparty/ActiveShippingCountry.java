/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.thirdparty;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a shipping country active for a third-party capability.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActiveShippingCountry implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Array list of the active shipping carriers for the country.
	 */
	protected List<String> activeCarriers;
	public List<String> getActiveCarriers() {
		return this.activeCarriers;
	}
	public void setActiveCarriers(List<String> activeCarriers) {
		this.activeCarriers = activeCarriers;
	}

	protected String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
