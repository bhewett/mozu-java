/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
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
 * 
 * </summary>
 */
public class CouponSetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CouponSetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSetCollection couponSetCollection = couponset.getCouponSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponSetCollection getCouponSets() throws Exception
	{
		return getCouponSets( null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getCouponSets( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public CountDownLatch getCouponSetsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.CouponSetCollection> callback) throws Exception
	{
		return getCouponSetsAsync( null,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSetCollection couponSetCollection = couponset.getCouponSets( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param includeCounts 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponSetCollection getCouponSets(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getCouponSets( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter 
	 * @param includeCounts 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public CountDownLatch getCouponSetsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSetCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	string string = couponset.getUniqueCouponSetCode();
	 * </code></pre></p>
	 * @return string
	 * @see string
	 */
	public String getUniqueCouponSetCode() throws Exception
	{
		return getUniqueCouponSetCode( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getUniqueCouponSetCode( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return string
	 * @see string
	 */
	public CountDownLatch getUniqueCouponSetCodeAsync( AsyncCallback<String> callback) throws Exception
	{
		return getUniqueCouponSetCodeAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	string string = couponset.getUniqueCouponSetCode( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return string
	 * @see string
	 */
	public String getUniqueCouponSetCode(String responseFields) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getUniqueCouponSetCodeClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getUniqueCouponSetCode( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return string
	 * @see string
	 */
	public CountDownLatch getUniqueCouponSetCodeAsync(String responseFields, AsyncCallback<String> callback) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getUniqueCouponSetCodeClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.addCouponSet( couponSet);
	 * </code></pre></p>
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet addCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet) throws Exception
	{
		return addCouponSet( couponSet,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.addCouponSet( couponSet, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch addCouponSetAsync(com.mozu.api.contracts.productadmin.CouponSet couponSet, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		return addCouponSetAsync( couponSet,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.addCouponSet( couponSet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet addCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.addCouponSetClient( couponSet,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.addCouponSet( couponSet,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param couponSet 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch addCouponSetAsync(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.addCouponSetClient( couponSet,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	couponset.validateUniqueCouponSetCode( code);
	 * </code></pre></p>
	 * @param code 
	 * @return 
	 */
	public void validateUniqueCouponSetCode(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.validateUniqueCouponSetCodeClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



