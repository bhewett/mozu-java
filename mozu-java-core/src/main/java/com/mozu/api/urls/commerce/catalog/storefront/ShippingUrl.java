/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ShippingUrl
{

	/**
	 * Get Resource Url for GetRates
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getRatesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/shipping/request-rates?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
