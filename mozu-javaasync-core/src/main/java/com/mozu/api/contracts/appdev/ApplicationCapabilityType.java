/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.appdev.ApplicationCapability;
import com.mozu.api.contracts.appdev.ApplicationCapabilityDomain;

/**
 *	Mozu.AppDev.Contracts.ApplicationCapabilityType ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationCapabilityType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType applicationCapabilityTypeId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer applicationCapabilityTypeId;

	public Integer getApplicationCapabilityTypeId() {
		return this.applicationCapabilityTypeId;
	}

	public void setApplicationCapabilityTypeId(Integer applicationCapabilityTypeId) {
		this.applicationCapabilityTypeId = applicationCapabilityTypeId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType applicationId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer applicationId;

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType capabilityTypeId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer capabilityTypeId;

	public Integer getCapabilityTypeId() {
		return this.capabilityTypeId;
	}

	public void setCapabilityTypeId(Integer capabilityTypeId) {
		this.capabilityTypeId = capabilityTypeId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType capabilityTypeName ApiTypeMember DOCUMENT_HERE 
	 */
	protected String capabilityTypeName;

	public String getCapabilityTypeName() {
		return this.capabilityTypeName;
	}

	public void setCapabilityTypeName(String capabilityTypeName) {
		this.capabilityTypeName = capabilityTypeName;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType isImplemented ApiTypeMember DOCUMENT_HERE 
	 */
	protected Boolean isImplemented;

	public Boolean getIsImplemented() {
		return this.isImplemented;
	}

	public void setIsImplemented(Boolean isImplemented) {
		this.isImplemented = isImplemented;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType isInitializedByDefault ApiTypeMember DOCUMENT_HERE 
	 */
	protected Boolean isInitializedByDefault;

	public Boolean getIsInitializedByDefault() {
		return this.isInitializedByDefault;
	}

	public void setIsInitializedByDefault(Boolean isInitializedByDefault) {
		this.isInitializedByDefault = isInitializedByDefault;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType packageId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer packageId;

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType applicationCapabilities ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<ApplicationCapability> applicationCapabilities;
	public List<ApplicationCapability> getApplicationCapabilities() {
		return this.applicationCapabilities;
	}
	public void setApplicationCapabilities(List<ApplicationCapability> applicationCapabilities) {
		this.applicationCapabilities = applicationCapabilities;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationCapabilityType applicationCapabilityDomains ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<ApplicationCapabilityDomain> applicationCapabilityDomains;
	public List<ApplicationCapabilityDomain> getApplicationCapabilityDomains() {
		return this.applicationCapabilityDomains;
	}
	public void setApplicationCapabilityDomains(List<ApplicationCapabilityDomain> applicationCapabilityDomains) {
		this.applicationCapabilityDomains = applicationCapabilityDomains;
	}

}
