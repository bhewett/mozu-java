/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductReservationUrl
{

	/**
	 * Get Resource Url for GetProductReservations
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductReservationsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductReservation
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductReservationUrl(Integer productReservationId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/{productReservationId}?responseFields={responseFields}");
		formatter.formatUrl("productReservationId", productReservationId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProductReservations
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl addProductReservationsUrl(Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/?skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CommitReservations
	 * @return   String Resource Url
	 */
	public static MozuUrl commitReservationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/commit");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductReservations
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductReservationsUrl(Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/?skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProductReservation
	 * @param productReservationId Unique identifier of the product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductReservationUrl(Integer productReservationId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/{productReservationId}");
		formatter.formatUrl("productReservationId", productReservationId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

