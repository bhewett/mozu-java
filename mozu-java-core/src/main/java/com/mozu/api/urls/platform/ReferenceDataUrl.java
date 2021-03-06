/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ReferenceDataUrl
{

	/**
	 * Get Resource Url for GetAddressSchema
	 * @param countryCode The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAddressSchemaUrl(String countryCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/addressschema/{countryCode}?responseFields={responseFields}");
		formatter.formatUrl("countryCode", countryCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetAddressSchemas
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAddressSchemasUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/addressschemas?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehavior
	 * @param behaviorId Unique identifier of the behavior.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorUrl(Integer behaviorId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors/{behaviorId}?responseFields={responseFields}");
		formatter.formatUrl("behaviorId", behaviorId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehaviorCategory
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorCategoryUrl(Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors/categories/{categoryId}?responseFields={responseFields}");
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehaviorCategories
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorCategoriesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors/categories?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehaviors
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userType The user type associated with the behaviors to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorsUrl(String responseFields, String userType)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors?userType={userType}&responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userType", userType);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetContentLocales
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getContentLocalesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/contentLocales?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetCountries
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCountriesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/countries?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetCountriesWithStates
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCountriesWithStatesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/countrieswithstates?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetCurrencies
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCurrenciesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/currencies?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetTimeZones
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTimeZonesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/timezones?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetTopLevelDomains
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTopLevelDomainsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/topleveldomains?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetUnitsOfMeasure
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUnitsOfMeasureUrl(String filter, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/unitsofmeasure?filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

