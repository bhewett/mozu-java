/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * Type rules are subresources of product attributes which could be specifications that can be shared across products in a store or assigned to specific products. Attribute type rules provide definitions of how attribute types will appear on the user interface.
 * </summary>
 */
public class AttributeTypeRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AttributeTypeRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of attribute type rules according to optional filter criteria and sort options. Attribute type rules help drive the behavior of attributes on a storefront page.
	 * <p><pre><code>
	 *	AttributeTypeRule attributetyperule = new AttributeTypeRule();
	 *	AttributeTypeRuleCollection attributeTypeRuleCollection = attributetyperule.getAttributeTypeRules();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection getAttributeTypeRules() throws Exception
	{
		return getAttributeTypeRules( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of attribute type rules according to optional filter criteria and sort options. Attribute type rules help drive the behavior of attributes on a storefront page.
	 * <p><pre><code>
	 *	AttributeTypeRule attributetyperule = new AttributeTypeRule();
	 *	AttributeTypeRuleCollection attributeTypeRuleCollection = attributetyperule.getAttributeTypeRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection getAttributeTypeRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeTypeRuleClient.getAttributeTypeRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



