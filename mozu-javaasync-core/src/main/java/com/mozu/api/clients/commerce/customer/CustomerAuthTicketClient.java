/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Authentication Tickets resource to generate and refresh authentication tickets for customer accounts.
 * </summary>
 */
public class CustomerAuthTicketClient {
	
	/**
	 * Creates an authentication ticket for an anonymous shopper user.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=CreateAnonymousShopperAuthTicketClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> createAnonymousShopperAuthTicketClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl.createAnonymousShopperAuthTicketUrl();
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Generates a new authentication ticket for a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=CreateUserAuthTicketClient( userAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param userAuthInfo The authentication information required to generate an authentication ticket for a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerUserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> createUserAuthTicketClient(com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicketClient( userAuthInfo,  null);
	}

	/**
	 * Generates a new authentication ticket for a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=CreateUserAuthTicketClient( userAuthInfo,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userAuthInfo The authentication information required to generate an authentication ticket for a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerUserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> createUserAuthTicketClient(com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl.createUserAuthTicketUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuthTicket.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(userAuthInfo);
		return mozuClient;

	}

	/**
	 * Refreshes an existing authentication ticket for a customer account by providing the refresh token string.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=RefreshUserAuthTicketClient( refreshToken);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> refreshUserAuthTicketClient(String refreshToken) throws Exception
	{
		return refreshUserAuthTicketClient( refreshToken,  null);
	}

	/**
	 * Refreshes an existing authentication ticket for a customer account by providing the refresh token string.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=RefreshUserAuthTicketClient( refreshToken,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> refreshUserAuthTicketClient(String refreshToken, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl.refreshUserAuthTicketUrl(refreshToken, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuthTicket.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


