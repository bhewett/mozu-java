/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.shipping.admin;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CarrierConfigurationUrl
{

	/**
	 * Get Resource Url for GetConfigurations
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getConfigurationsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetConfiguration
	 * @param carrierId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getConfigurationUrl(String carrierId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/{carrierId}?responseFields={responseFields}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateConfiguration
	 * @param carrierId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createConfigurationUrl(String carrierId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/{carrierId}?responseFields={responseFields}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateConfiguration
	 * @param carrierId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateConfigurationUrl(String carrierId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/{carrierId}?responseFields={responseFields}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteConfiguration
	 * @param carrierId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteConfigurationUrl(String carrierId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/{carrierId}");
		formatter.formatUrl("carrierId", carrierId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

