/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.ProductInventoryInfo;
import com.mozu.api.contracts.productruntime.PackageMeasurements;

/**
 *	System-supplied and read only information for component products in a product bundle.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BundledProductSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The credit value of the product or bundled product. When the `goodsType `is `DigitalCredit`, this value is populated to indicate the value of the credit. This is used to create store credit in the fulfillment of gift cards.
	 */
	protected Double creditValue;

	public Double getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	/**
	 * The type of goods in a bundled product. A bundled product is composed of products associated to sell together. Possible values include “Physical” and “DigitalCredit”. This comes from the `productType `of the product. Products are defaulted to a Physical `goodsType`. Gift cards have a `goodsType `of DigitalCredit.
	 */
	protected String goodsType;

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * Indicates if the product must be shipped alone in a container. This is used for products and products within a bundle. If true, this product cannot be shipped in a package with other items and must ship in a package by itself.
	 */
	protected Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	/**
	 * Fully qualified name of the selected option's attribute. Bundledproducts result from a static bundle or are dynamically added as a result of the shopper selecting products as extras. When the bundled item is dynamic, it includes the attribute's fully qualified name of the extra that it came from. When `optionAttributeFQN `is null, the bundled item was statically defined. When not null, the item came from an extra selection.
	 */
	protected String optionAttributeFQN;

	public String getOptionAttributeFQN() {
		return this.optionAttributeFQN;
	}

	public void setOptionAttributeFQN(String optionAttributeFQN) {
		this.optionAttributeFQN = optionAttributeFQN;
	}

	/**
	 * The value of the option attribute. These values are associated and used by product bundles and options.
	 */
	protected Object optionValue;

	public Object getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(Object optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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
	 * The product type template associated with the product on the storefront.
	 */
	protected String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * The specified quantity of objects and items. This property is used for numerous object types including products, options, components within a product bundle, cart and order items, returned items, shipping line items, items in a digital product. and items associated with types and reservations.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Properties and data of inventory information for configured and bundled products. If product stock is managed, the data specifies out of stock behavior.
	 */
	protected ProductInventoryInfo inventoryInfo;

	public ProductInventoryInfo getInventoryInfo() {
		return this.inventoryInfo;
	}

	public void setInventoryInfo(ProductInventoryInfo inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	/**
	 * Dimensions of the packaged product.
	 */
	protected PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}

}
