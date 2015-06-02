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
import com.mozu.api.resources.platform.adminuser.AdminUserResource;

/** <summary>
 * The Accounts resource displays the user accounts and account details associated with a developer or Mozu tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserFactory
{

	public static com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		return getTenantScopesForUser(apiContext,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(ApiContext apiContext, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.tenant.TenantCollection returnObj = new com.mozu.api.contracts.tenant.TenantCollection();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getTenantScopesForUser( userId,  responseFields);
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

	public static com.mozu.api.contracts.core.User getUser(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		return getUser(apiContext,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.User getUser(ApiContext apiContext, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.User returnObj = new com.mozu.api.contracts.core.User();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getUser( userId,  responseFields);
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

}



