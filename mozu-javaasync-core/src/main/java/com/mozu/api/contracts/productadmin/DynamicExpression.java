/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.Expression;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DynamicExpression implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String text;

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	protected Expression tree;

	public Expression getTree() {
		return this.tree;
	}

	public void setTree(Expression tree) {
		this.tree = tree;
	}

}