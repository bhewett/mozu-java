/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CouponSetUrl
{

	/**
	 * Get Resource Url for GetCouponSets
	 * @param filter 
	 * @param includeCounts 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCouponSetsUrl(String filter, Boolean includeCounts, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&includeCounts={includeCounts}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("includeCounts", includeCounts);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetUniqueCouponSetCode
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getUniqueCouponSetCodeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/unique-code?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddCouponSet
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addCouponSetUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateUniqueCouponSetCode
	 * @param code 
	 * @return   String Resource Url
	 */
	public static MozuUrl validateUniqueCouponSetCodeUrl(String code)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/validate-unique-code");
		formatter.formatUrl("code", code);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

