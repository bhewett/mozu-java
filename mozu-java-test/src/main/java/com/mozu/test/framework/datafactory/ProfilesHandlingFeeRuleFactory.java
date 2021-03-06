/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.shipping.admin.profiles.HandlingFeeRuleResource;

/** <summary>
 * 
 * </summary>
 */
public class ProfilesHandlingFeeRuleFactory
{

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule getProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String profilecode, String id, int expectedCode) throws Exception
	{
		return getProductHandlingFeeRule(apiContext, dataViewMode,  profilecode,  id,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule getProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String profilecode, String id, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule returnObj = new com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule();
		HandlingFeeRuleResource resource = new HandlingFeeRuleResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductHandlingFeeRule( profilecode,  id,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection getProductHandlingFeeRules(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String profilecode, int expectedCode) throws Exception
	{
		return getProductHandlingFeeRules(apiContext, dataViewMode,  profilecode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection getProductHandlingFeeRules(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String profilecode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection returnObj = new com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection();
		HandlingFeeRuleResource resource = new HandlingFeeRuleResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductHandlingFeeRules( profilecode,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule createProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, int expectedCode) throws Exception
	{
		return createProductHandlingFeeRule(apiContext,  rule,  profilecode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule createProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule returnObj = new com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule();
		HandlingFeeRuleResource resource = new HandlingFeeRuleResource(apiContext);
		try
		{
			returnObj = resource.createProductHandlingFeeRule( rule,  profilecode,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule updateProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, int expectedCode) throws Exception
	{
		return updateProductHandlingFeeRule(apiContext, dataViewMode,  rule,  profilecode,  id,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule updateProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule returnObj = new com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule();
		HandlingFeeRuleResource resource = new HandlingFeeRuleResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductHandlingFeeRule( rule,  profilecode,  id,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deleteProductHandlingFeeRule(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String profilecode, String id, int expectedCode) throws Exception
	{
		HandlingFeeRuleResource resource = new HandlingFeeRuleResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductHandlingFeeRule( profilecode,  id);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



