/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.entitylists;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * Entity containers provide all properties and data for entities within a site/tenant. This data encapsulates all associated IDs including entity lists, entity views, site, tenant, entities, and more.
 * </summary>
 */
public class EntityContainerClient {
	
	/**
	 * Retrieves an entity container, providing all schema and rules and associated IDs for entities.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetEntityContainerClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getEntityContainerClient(String entityListFullName, String id) throws Exception
	{
		return getEntityContainerClient( entityListFullName,  id,  null);
	}

	/**
	 * Retrieves an entity container, providing all schema and rules and associated IDs for entities.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetEntityContainerClient( entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getEntityContainerClient(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityContainerUrl.getEntityContainerUrl(entityListFullName, id, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainer.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainer>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of entity containers. Each container holds a set of entities per ID. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetEntityContainersClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getEntityContainersClient(String entityListFullName) throws Exception
	{
		return getEntityContainersClient( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of entity containers. Each container holds a set of entities per ID. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetEntityContainersClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getEntityContainersClient(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityContainerUrl.getEntityContainersUrl(entityListFullName, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainerCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



