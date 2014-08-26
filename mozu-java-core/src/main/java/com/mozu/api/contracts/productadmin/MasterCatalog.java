/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a master catalog associated with a tenant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterCatalog implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected Boolean isDeleted;

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * The name of the master catalog.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The mode this master catalog uses for product updates. Possible values are "Pending" which saves product updates as a draft until they are published, and "Live" which publishes all product updates immediately.
	 */
	protected String productPublishingMode;

	public String getProductPublishingMode() {
		return this.productPublishingMode;
	}

	public void setProductPublishingMode(String productPublishingMode) {
		this.productPublishingMode = productPublishingMode;
	}

}
