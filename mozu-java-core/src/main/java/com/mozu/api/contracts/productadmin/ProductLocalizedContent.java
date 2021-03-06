/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.ProductLocalizedImage;

/**
 *	The localized product content in the language specified by the LocaleCode.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLocalizedContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * Lengthy full description for a product description, displayed on product detail pages within the storefront.
	 */
	protected String productFullDescription;

	public String getProductFullDescription() {
		return this.productFullDescription;
	}

	public void setProductFullDescription(String productFullDescription) {
		this.productFullDescription = productFullDescription;
	}

	/**
	 * The name of the product that represents a line item in a taxable order or product bundle.
	 */
	protected String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Brief text description of the product or component in a product bundle, typically used when the product is displayed in a list or in search results.
	 */
	protected String productShortDescription;

	public String getProductShortDescription() {
		return this.productShortDescription;
	}

	public void setProductShortDescription(String productShortDescription) {
		this.productShortDescription = productShortDescription;
	}

	/**
	 * List of image files associated with a product. This content may include the image file URL, name, and other information as available.
	 */
	protected List<ProductLocalizedImage> productImages;
	public List<ProductLocalizedImage> getProductImages() {
		return this.productImages;
	}
	public void setProductImages(List<ProductLocalizedImage> productImages) {
		this.productImages = productImages;
	}

}
