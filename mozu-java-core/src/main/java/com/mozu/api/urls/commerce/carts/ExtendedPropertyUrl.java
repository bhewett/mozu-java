/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.carts;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ExtendedPropertyUrl
{

	/**
	 * Get Resource Url for GetExtendedProperties
	 * @return   String Resource Url
	 */
	public static MozuUrl getExtendedPropertiesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/extendedproperties");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddExtendedProperties
	 * @return   String Resource Url
	 */
	public static MozuUrl addExtendedPropertiesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/extendedproperties");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtendedProperty
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtendedPropertyUrl(String key, String responseFields, Boolean upsert)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/extendedproperties/{key}?upsert={upsert}&responseFields={responseFields}");
		formatter.formatUrl("key", key);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("upsert", upsert);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateExtendedProperties
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateExtendedPropertiesUrl(Boolean upsert)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/extendedproperties?upsert={upsert}");
		formatter.formatUrl("upsert", upsert);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteExtendedProperties
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteExtendedPropertiesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/extendedproperties");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteExtendedProperty
	 * @param key 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteExtendedPropertyUrl(String key)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/extendedproperties/{key}");
		formatter.formatUrl("key", key);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

