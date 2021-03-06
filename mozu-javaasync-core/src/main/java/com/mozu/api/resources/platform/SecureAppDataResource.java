/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import org.joda.time.DateTime;
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
 * Manage Secure App Settings. Expose via arc.js so that arc apps can securely access secrets. Third-party extensions can also access their data. Secured via AppKey.AppId
 * </summary>
 */
public class SecureAppDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SecureAppDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * platform-secureappdata Get GetDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	JObject json = secureappdata.getDBValue( appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getDBValue(String appKeyId, String dbEntryQuery) throws Exception
	{
		return getDBValue( appKeyId,  dbEntryQuery,  null);
	}

	/**
	 * platform-secureappdata Get GetDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	CountDownLatch latch = secureappdata.getDBValue( appKeyId,  dbEntryQuery, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getDBValueAsync(String appKeyId, String dbEntryQuery, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return getDBValueAsync( appKeyId,  dbEntryQuery,  null, callback);
	}

	/**
	 * platform-secureappdata Get GetDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	JObject json = secureappdata.getDBValue( appKeyId,  dbEntryQuery,  responseFields);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getDBValue(String appKeyId, String dbEntryQuery, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.SecureAppDataClient.getDBValueClient( appKeyId,  dbEntryQuery,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * platform-secureappdata Get GetDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	CountDownLatch latch = secureappdata.getDBValue( appKeyId,  dbEntryQuery,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getDBValueAsync(String appKeyId, String dbEntryQuery, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.SecureAppDataClient.getDBValueClient( appKeyId,  dbEntryQuery,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * platform-secureappdata Post CreateDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	secureappdata.createDBValue( value,  appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param value JSON code for objects.
	 * @return 
	 * @see JObject
	 */
	public void createDBValue(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SecureAppDataClient.createDBValueClient( value,  appKeyId,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * platform-secureappdata Put UpdateDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	secureappdata.updateDBValue( value,  appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param value JSON code for objects.
	 * @return 
	 * @see JObject
	 */
	public void updateDBValue(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SecureAppDataClient.updateDBValueClient( value,  appKeyId,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * platform-secureappdata Delete DeleteDBValue description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	secureappdata.deleteDBValue( appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @return 
	 */
	public void deleteDBValue(String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SecureAppDataClient.deleteDBValueClient( appKeyId,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



