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
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.FacetRangeQuery;
import com.mozu.api.contracts.productadmin.FacetSource;
import com.mozu.api.contracts.productadmin.FacetValidity;

/**
 *	Properties of the facet used to retrieve documents.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for the storefront container used to organize products.
	 */
	protected Integer categoryId;

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Unique identifier of the facet.
	 */
	protected Integer facetId;

	public Integer getFacetId() {
		return this.facetId;
	}

	public void setFacetId(Integer facetId) {
		this.facetId = facetId;
	}

	/**
	 * The type of facet. Valid values are "range" (enables creation of a range of values) or "value" (populates the facet values based on the associated attribute or category).
	 */
	protected String facetType;

	public String getFacetType() {
		return this.facetType;
	}

	public void setFacetType(String facetType) {
		this.facetType = facetType;
	}

	/**
	 * Indicates if the object is hidden or breaks inheritance, primarily used by facets, products, and attribute vocabulary values. For example, if true, the attribute vocabulary value does not appear in the list when defining a value for an attribute.
	 */
	protected Boolean isHidden;

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * Integer that represents the sequence order of the attribute.
	 */
	protected Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * Indicates the specific facet inherited from a parent category that is overridden by this facet. System-supplied and read only.
	 */
	protected Integer overrideFacetId;

	public Integer getOverrideFacetId() {
		return this.overrideFacetId;
	}

	public void setOverrideFacetId(Integer overrideFacetId) {
		this.overrideFacetId = overrideFacetId;
	}

	/**
	 * Determines how the facet values will be sorted in the store. Must be a valid value for DataType defined in FacetValueSortTypeConst. Allowable values are: CountAscending, CountDescending, ValuesAscending, ValuesDescending. The default if no value is specified will be CountDescending.
	 */
	protected String valueSortType;

	public String getValueSortType() {
		return this.valueSortType;
	}

	public void setValueSortType(String valueSortType) {
		this.valueSortType = valueSortType;
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
	 * For range type facets, an array of ranges to use for the facet values. For example, a price facet might have range queries for $0-$25, $25-$50, and $50-$100.
	 */
	protected List<FacetRangeQuery> rangeQueries;
	public List<FacetRangeQuery> getRangeQueries() {
		return this.rangeQueries;
	}
	public void setRangeQueries(List<FacetRangeQuery> rangeQueries) {
		this.rangeQueries = rangeQueries;
	}

	/**
	 * Source for an action or container for originating content. Source is used as an origin for validation and notification messages based on successful or failed actions. For originating content, source is used for the facet source information, including the category, price, or attribute properties.
	 */
	protected FacetSource source;

	public FacetSource getSource() {
		return this.source;
	}

	public void setSource(FacetSource source) {
		this.source = source;
	}

	/**
	 * System-supplied and read only indicator of whether a facet is currently valid and if not indicates the reason why. A facet may become invalid if the source data is changed in some ways (for example if the category tree structure is changed).
	 */
	protected FacetValidity validity;

	public FacetValidity getValidity() {
		return this.validity;
	}

	public void setValidity(FacetValidity validity) {
		this.validity = validity;
	}

}
