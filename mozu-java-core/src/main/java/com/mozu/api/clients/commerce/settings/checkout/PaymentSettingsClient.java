/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.checkout;

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
 * Use the Payment Settings resource to specify settings when creating payments for order checkout on the site.
 * </summary>
 */
public class PaymentSettingsClient {
	
	/**
	 * Retrieves the schema and definition along with the actual instance values of the third-party payment service workflow configured for the corresponding fully qualified name.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> mozuClient=GetThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = client.Result();
	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> getThirdPartyPaymentWorkflowWithValuesClient(String fullyQualifiedName) throws Exception
	{
		return getThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName,  null);
	}

	/**
	 * Retrieves the schema and definition along with the actual instance values of the third-party payment service workflow configured for the corresponding fully qualified name.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> mozuClient=GetThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = client.Result();
	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> getThirdPartyPaymentWorkflowWithValuesClient(String fullyQualifiedName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.PaymentSettingsUrl.getThirdPartyPaymentWorkflowWithValuesUrl(fullyQualifiedName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the schema and definition of all third-party payment service workflows configured for the site.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> mozuClient=GetThirdPartyPaymentWorkflowsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public static MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> getThirdPartyPaymentWorkflowsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.PaymentSettingsUrl.getThirdPartyPaymentWorkflowsUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> mozuClient = (MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a third-party payment workflow to the site. A third-party payment workflow is a definition of a process by which a third-party payment provider (such as Amazon Payments or PayPal Express) interacts with the Mozu platform.
	 * <p><pre><code>
	 * MozuClient mozuClient=AddThirdPartyPaymentWorkflowClient( definition);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param definition Properties of an external payment processing workflow defined for the site. At this time, only PayPal Express is supported.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public static MozuClient addThirdPartyPaymentWorkflowClient(com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition definition) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.PaymentSettingsUrl.addThirdPartyPaymentWorkflowUrl();
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(definition);
		return mozuClient;

	}

	/**
	 * Deletes a third-party payment workflow. A third-party payment workflow is a definition of a process by which a third-party payment provider (such as Amazon Payments or PayPal Express) interacts with the Mozu platform. 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteThirdPartyPaymentWorkflowClient( fullyQualifiedName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteThirdPartyPaymentWorkflowClient(String fullyQualifiedName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.PaymentSettingsUrl.deleteThirdPartyPaymentWorkflowUrl(fullyQualifiedName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



