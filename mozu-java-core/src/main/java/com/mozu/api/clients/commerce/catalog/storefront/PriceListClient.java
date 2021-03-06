/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Allows you to get a price list. This may contain a hierarchy of price lists dependent on setup.
 * </summary>
 */
public class PriceListClient {
	
	/**
	 * Retrieves the price list for the given priceListCode
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.PriceList> mozuClient=GetPriceListClient( priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceListCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.PriceList>
	 * @see com.mozu.api.contracts.productruntime.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.PriceList> getPriceListClient(String priceListCode) throws Exception
	{
		return getPriceListClient( priceListCode,  null);
	}

	/**
	 * Retrieves the price list for the given priceListCode
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.PriceList> mozuClient=GetPriceListClient( priceListCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.PriceList>
	 * @see com.mozu.api.contracts.productruntime.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.PriceList> getPriceListClient(String priceListCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.PriceListUrl.getPriceListUrl(priceListCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.PriceList.class;
		MozuClient<com.mozu.api.contracts.productruntime.PriceList> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.PriceList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * storefront-pricelists Get GetResolvedPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> mozuClient=GetResolvedPriceListClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ResolvedPriceList resolvedPriceList = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ResolvedPriceList>
	 * @see com.mozu.api.contracts.productruntime.ResolvedPriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> getResolvedPriceListClient() throws Exception
	{
		return getResolvedPriceListClient( null,  null);
	}

	/**
	 * storefront-pricelists Get GetResolvedPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> mozuClient=GetResolvedPriceListClient( customerAccountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ResolvedPriceList resolvedPriceList = client.Result();
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ResolvedPriceList>
	 * @see com.mozu.api.contracts.productruntime.ResolvedPriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> getResolvedPriceListClient(Integer customerAccountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.PriceListUrl.getResolvedPriceListUrl(customerAccountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ResolvedPriceList.class;
		MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



