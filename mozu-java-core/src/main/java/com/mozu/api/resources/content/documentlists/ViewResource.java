/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class ViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.getViewDocuments( documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName) throws Exception
	{
		return getViewDocuments( documentListName,  viewName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.getViewDocuments( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName, String filter, String sortBy, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.ViewClient.getViewDocumentsClient( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


