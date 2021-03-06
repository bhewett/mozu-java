/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.adminuser;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class AdminUserUrl
{

	/**
	 * Get Resource Url for GetTenantScopesForUser
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTenantScopesForUserUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/tenants?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetUser
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

