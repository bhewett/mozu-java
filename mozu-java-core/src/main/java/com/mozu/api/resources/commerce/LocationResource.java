/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
public class LocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public LocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetLocation( code);
	 * </code></pre></p>
	 * @param code 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getLocationClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetLocationInUsageType( locationUsageType,  code);
	 * </code></pre></p>
	 * @param code 
	 * @param locationUsageType 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocationInUsageType(String locationUsageType, String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getLocationInUsageTypeClient( locationUsageType,  code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocationsInUsageType( locationUsageType);
	 * </code></pre></p>
	 * @param locationUsageType 
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(String locationUsageType) throws Exception
	{
		return getLocationsInUsageType( locationUsageType,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocationsInUsageType( locationUsageType,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter 
	 * @param locationUsageType 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.LocationClient.getLocationsInUsageTypeClient( locationUsageType,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetDirectShipLocation();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getDirectShipLocation() throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getDirectShipLocationClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetInStorePickupLocation( code);
	 * </code></pre></p>
	 * @param code 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getInStorePickupLocation(String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.LocationClient.getInStorePickupLocationClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetInStorePickupLocations();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations() throws Exception
	{
		return getInStorePickupLocations( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetInStorePickupLocations( startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.LocationClient.getInStorePickupLocationsClient( startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



