/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.SiteSearchRelevancyCustomField;
import com.mozu.api.contracts.productadmin.SiteSearchKeywordRelevancySettings;
import com.mozu.api.contracts.productadmin.SiteSearchPhraseRelevancySettings;

/**
 *	Properties for the site search settings.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearchSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Custom boost value for searches.
	 */
	protected List<String> customBoosts;
	public List<String> getCustomBoosts() {
		return this.customBoosts;
	}
	public void setCustomBoosts(List<String> customBoosts) {
		this.customBoosts = customBoosts;
	}

	/**
	 * Indicates if the object is default. This indicator is used for product variations and site search settings. If true, the value/object is the default option. 
	 */
	protected Boolean isDefault;

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.SiteSearchSettings minimumMatchPercent ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer minimumMatchPercent;

	public Integer getMinimumMatchPercent() {
		return this.minimumMatchPercent;
	}

	public void setMinimumMatchPercent(Integer minimumMatchPercent) {
		this.minimumMatchPercent = minimumMatchPercent;
	}

	/**
	 * The name for the search settings.
	 */
	protected String settingsName;

	public String getSettingsName() {
		return this.settingsName;
	}

	public void setSettingsName(String settingsName) {
		this.settingsName = settingsName;
	}

	/**
	 * Custom field for searches.
	 */
	protected List<SiteSearchRelevancyCustomField> customFields;
	public List<SiteSearchRelevancyCustomField> getCustomFields() {
		return this.customFields;
	}
	public void setCustomFields(List<SiteSearchRelevancyCustomField> customFields) {
		this.customFields = customFields;
	}

	/**
	 * The site keyword relevancy settings.
	 */
	protected SiteSearchKeywordRelevancySettings siteKeywordRelevancy;

	public SiteSearchKeywordRelevancySettings getSiteKeywordRelevancy() {
		return this.siteKeywordRelevancy;
	}

	public void setSiteKeywordRelevancy(SiteSearchKeywordRelevancySettings siteKeywordRelevancy) {
		this.siteKeywordRelevancy = siteKeywordRelevancy;
	}

	/**
	 * The site phrase relevancy settings.
	 */
	protected SiteSearchPhraseRelevancySettings sitePhraseRelevancy;

	public SiteSearchPhraseRelevancySettings getSitePhraseRelevancy() {
		return this.sitePhraseRelevancy;
	}

	public void setSitePhraseRelevancy(SiteSearchPhraseRelevancySettings sitePhraseRelevancy) {
		this.sitePhraseRelevancy = sitePhraseRelevancy;
	}

}