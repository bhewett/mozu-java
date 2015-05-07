/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.OrderResource;

/** <summary>
 * Use the Orders resource to manage all components of order processing, payment, and fulfillment.
 * </summary>
 */
public class OrderFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getOrders(apiContext,  null,  null,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderCollection returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderCollection();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.getOrders( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static List<String> getAvailableActions(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		List<String> returnObj = new ArrayList<String>();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.getAvailableActions( orderId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static List<com.mozu.api.contracts.pricingruntime.TaxableOrder> getTaxableOrders(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.pricingruntime.TaxableOrder> returnObj = new ArrayList<com.mozu.api.contracts.pricingruntime.TaxableOrder>();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.getTaxableOrders( orderId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order getOrder(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		return getOrder(apiContext,  orderId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order getOrder(ApiContext apiContext, String orderId, Boolean draft, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.getOrder( orderId,  draft,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(ApiContext apiContext, String cartId, int expectedCode, int successCode) throws Exception
	{
		return createOrderFromCart(apiContext,  cartId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(ApiContext apiContext, String cartId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.createOrderFromCart( cartId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createOrder(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.Order order, int expectedCode, int successCode) throws Exception
	{
		return createOrder(apiContext,  order,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createOrder(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.Order order, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.createOrder( order,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, int expectedCode, int successCode) throws Exception
	{
		return performOrderAction(apiContext,  action,  orderId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.performOrderAction( action,  orderId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, int expectedCode, int successCode) throws Exception
	{
		return updateOrderDiscount(apiContext,  discount,  orderId,  discountId,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.updateOrderDiscount( discount,  orderId,  discountId,  updateMode,  version,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static void deleteOrderDraft(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		deleteOrderDraft(apiContext,  orderId,  null, expectedCode, successCode );
	}

	public static void deleteOrderDraft(ApiContext apiContext, String orderId, String version, int expectedCode, int successCode) throws Exception
	{
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			resource.deleteOrderDraft( orderId,  version);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

	public static void resendOrderConfirmationEmail(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, int expectedCode, int successCode) throws Exception
	{
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			resource.resendOrderConfirmationEmail( action,  orderId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		return changeOrderUserId(apiContext,  orderId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(ApiContext apiContext, String orderId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.changeOrderUserId( orderId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, int expectedCode, int successCode) throws Exception
	{
		return updateOrder(apiContext,  order,  orderId,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		OrderResource resource = new OrderResource(apiContext);
		try
		{
			returnObj = resource.updateOrder( order,  orderId,  updateMode,  version,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

}



