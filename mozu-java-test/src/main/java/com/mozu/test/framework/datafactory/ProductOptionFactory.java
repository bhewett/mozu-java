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
import com.mozu.api.resources.commerce.catalog.admin.products.ProductOptionResource;

/** <summary>
 * Use the Options resource to configure the option attributes and vocabulary values for an individual product associated with the product type that uses the option attribute. Options are used to generate variations of a product.
 * </summary>
 */
public class ProductOptionFactory
{

	public static List<com.mozu.api.contracts.productadmin.ProductOption> getOptions(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductOption> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductOption>();
		ProductOptionResource resource = new ProductOptionResource(apiContext);
		try
		{
			returnObj = resource.getOptions(dataViewMode,  productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductOption getOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductOption returnObj = new com.mozu.api.contracts.productadmin.ProductOption();
		ProductOptionResource resource = new ProductOptionResource(apiContext);
		try
		{
			returnObj = resource.getOption(dataViewMode,  productCode,  attributeFQN);
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

	public static com.mozu.api.contracts.productadmin.ProductOption addOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductOption returnObj = new com.mozu.api.contracts.productadmin.ProductOption();
		ProductOptionResource resource = new ProductOptionResource(apiContext);
		try
		{
			returnObj = resource.addOption(dataViewMode,  productOption,  productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductOption updateOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductOption returnObj = new com.mozu.api.contracts.productadmin.ProductOption();
		ProductOptionResource resource = new ProductOptionResource(apiContext);
		try
		{
			returnObj = resource.updateOption(dataViewMode,  productOption,  productCode,  attributeFQN);
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

	public static void deleteOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
				ProductOptionResource resource = new ProductOptionResource(apiContext);
		try
		{
			resource.deleteOption(dataViewMode,  productCode,  attributeFQN);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

}


