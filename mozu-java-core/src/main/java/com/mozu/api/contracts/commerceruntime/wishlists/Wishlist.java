/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.wishlists;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;

/**
 *	Properties of a shopper wish list defined for a site, associated with a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wishlist implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Code that identifies the channel associated with the site for the shopper's created shopping cart, order, and return.
	 */
	protected String channelCode;

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Unique identifer of the customer account. This ID is used to associate numerous types of data and object with the customer account, including orders, returns, wish lists, and in-store credit.
	 */
	protected Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	/**
	 * The type of customer interaction used to create this shopping cart. Possible values are Website, Call, Store, or Unknown.
	 */
	protected String customerInteractionType;

	public String getCustomerInteractionType() {
		return this.customerInteractionType;
	}

	public void setCustomerInteractionType(String customerInteractionType) {
		this.customerInteractionType = customerInteractionType;
	}

	/**
	 * The aggregate total for all items in the cart, including costs associated with shopper-defined options or extras and any applied discounts.
	 */
	protected Double discountedSubtotal;

	public Double getDiscountedSubtotal() {
		return this.discountedSubtotal;
	}

	public void setDiscountedSubtotal(Double discountedSubtotal) {
		this.discountedSubtotal = discountedSubtotal;
	}

	/**
	 * The subtotal of the cart, order, and wishlist items, including any applied discount calculations. Wishlist subtotals may change depending on the length of time, available discounts, and stock amounts of products at the time of review by shoppers.
	 */
	protected Double discountedTotal;

	public Double getDiscountedTotal() {
		return this.discountedTotal;
	}

	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}

	/**
	 * Estimated amount of discounts applied to all items in the carts and orders. System-supplied and read-only. This value will be available at the wish list, cart item, order item, and wish list item level at a later time.
	 */
	protected Double discountTotal;

	public Double getDiscountTotal() {
		return this.discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * Date and time in UTC format when a discount, credit, wish list, or cart expires. An expired discount no longer can be redeemed. An expired wish list is no longer available. An expired credit can no longer be redeemed for a purchase. Acart becomes inactive and expired based on a system-calculated interval. For example, if an anonymous shopper has 14 days of inactivity, the cart is considered abandoned after that period of inactivity. System-supplied and read-only.
	 */
	protected DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * Unique identifier used by an external program to identify a Mozu order, customer account, or wish list.
	 */
	protected String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * The monetary sum of all fees incurred in the cart, order, line item in a cart, or line item in an order. This value is not calculated for wish lists at this time.
	 */
	protected Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	/**
	 * Calculated total tax amount for handling costs if the cart/order is subject to sales tax. 
	 */
	protected Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The date and time an order or wish list is imported into Mozu. This is not the date and time it was created in the external application. 
	 */
	protected DateTime importDate;

	public DateTime getImportDate() {
		return this.importDate;
	}

	public void setImportDate(DateTime importDate) {
		this.importDate = importDate;
	}

	/**
	 * Indicates if this object/data was imported from an outside source such as a data import or synchronization via an app or service. If true, this data was originally imported into Mozu and accessible through your store database. Examples of imported objects/data include orders and customer accounts.
	 */
	protected Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	/**
	 * The total amount of calculated tax for items, used by carts, orders, and wish lists.
	 */
	protected Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	/**
	 * The date in UTC Date/Time when the items in the cart were last validated against the site's product catalog. System-supplied and read-only.
	 */
	protected DateTime lastValidationDate;

	public DateTime getLastValidationDate() {
		return this.lastValidationDate;
	}

	public void setLastValidationDate(DateTime lastValidationDate) {
		this.lastValidationDate = lastValidationDate;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The type of privacy to apply to this wish list. Possible values are "Private" which makes the wish list viewable only to the shopper, "DirectShare" which makes the wish list viewable only to people with whom the shopper shares the wish list link, or "Public" which makes the wish list available to everyone. At this time, the system treats all shopper wish lists as "Public" regardless of the defined privacy type.
	 */
	protected String privacyType;

	public String getPrivacyType() {
		return this.privacyType;
	}

	public void setPrivacyType(String privacyType) {
		this.privacyType = privacyType;
	}

	/**
	 * The shipping subtotal amount calculated without any applied discounts for line item and entire amounts of carts and orders. This property is not calculated for wish lists at this time.
	 */
	protected Double shippingSubTotal;

	public Double getShippingSubTotal() {
		return this.shippingSubTotal;
	}

	public void setShippingSubTotal(Double shippingSubTotal) {
		this.shippingSubTotal = shippingSubTotal;
	}

	/**
	 * The total amount of tax incurred on the shipping charges in the cart and order. This property is not calculated at this time for wish lists.
	 */
	protected Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	/**
	 * The calculated total shipping amount estimated for carts or orders, including tax. This amount is not calculated for wish lists at this time.
	 */
	protected Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * Unique identifier of the site.
	 */
	protected Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * The integer that represents the sequential order of this wish list in the customer's collection of wish lists.
	 */
	protected Integer sortOrder;

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * Estimated amount of the cart or order without sales tax, shipping costs, and other fees. This amount is not calculated for wish lists at this time.
	 */
	protected Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * The total monetary sum of sales tax estimated for a cart or order.
	 */
	protected Double taxTotal;

	public Double getTaxTotal() {
		return this.taxTotal;
	}

	public void setTaxTotal(Double taxTotal) {
		this.taxTotal = taxTotal;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Total is used to indicate the monetary, estimated total amount of the cart or order, including items, sales tax, shipping costs, and other fees. Totals are not estimated for wish lists at this time.
	 */
	protected Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * User-defined string that defines the type of wish list to define, such as wish list, baby registry, or Christmas list.
	 */
	protected String typeTag;

	public String getTypeTag() {
		return this.typeTag;
	}

	public void setTypeTag(String typeTag) {
		this.typeTag = typeTag;
	}

	/**
	 * System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 */
	protected String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Unique identifier of the customer visit in which the cart was created or last modified.
	 */
	protected String visitId;

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	/**
	 * Unique identifier of the web session in which the cart, order, return, or wish list was created or last modified.
	 */
	protected String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Collection (list or paged) of change messages logged for each modification made by a shopper to their carts, wishlists, orders, package, payment, pickup, and returns. Change log messages are system-supplied based on shopper actions and read only.
	 */
	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	/**
	 * Properties of the information required to fulfill the cart, order, or wish list. Shoppers can fulfill ordered items by using in-store pickup or direct shipping.
	 */
	protected FulfillmentInfo fulfillmentInfo;

	public FulfillmentInfo getFulfillmentInfo() {
		return this.fulfillmentInfo;
	}

	public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
		this.fulfillmentInfo = fulfillmentInfo;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<WishlistItem> items;
	public List<WishlistItem> getItems() {
		return this.items;
	}
	public void setItems(List<WishlistItem> items) {
		this.items = items;
	}

	/**
	 * List of order-level discounts projected to apply to the cart at checkout or order.
	 */
	protected List<AppliedDiscount> orderDiscounts;
	public List<AppliedDiscount> getOrderDiscounts() {
		return this.orderDiscounts;
	}
	public void setOrderDiscounts(List<AppliedDiscount> orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
	}

}
