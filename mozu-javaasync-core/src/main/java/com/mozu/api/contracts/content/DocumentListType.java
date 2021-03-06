/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.content.DocumentInstallation;
import com.mozu.api.contracts.content.View;

/**
 *	Properties for the document list type. Document lists contain documents with an associated document type, such as web pages.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentListType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name for the document list type for content. 
	 */
	protected String documentListTypeFQN;

	public String getDocumentListTypeFQN() {
		return this.documentListTypeFQN;
	}

	public void setDocumentListTypeFQN(String documentListTypeFQN) {
		this.documentListTypeFQN = documentListTypeFQN;
	}

	/**
	 * List of fully qualified names for the document type.
	 */
	protected List<String> documentTypeFQNs;
	public List<String> getDocumentTypeFQNs() {
		return this.documentTypeFQNs;
	}
	public void setDocumentTypeFQNs(List<String> documentTypeFQNs) {
		this.documentTypeFQNs = documentTypeFQNs;
	}

	/**
	 * Determines if documentLists belonging to this documentListType have ActiveDateRanges turned on or off. Each documentList created from the documentListType will use this value, but it can be overridden in an individual documentList.
	 */
	protected Boolean enableActiveDateRanges;

	public Boolean getEnableActiveDateRanges() {
		return this.enableActiveDateRanges;
	}

	public void setEnableActiveDateRanges(Boolean enableActiveDateRanges) {
		this.enableActiveDateRanges = enableActiveDateRanges;
	}

	/**
	 * Indicates if the document list and document list type are enabled to publish. If true, publishing of draft documents in this document list/document list type is enabled for the site. If false, all document changes are immediately published in live mode.
	 */
	protected Boolean enablePublishing;

	public Boolean getEnablePublishing() {
		return this.enablePublishing;
	}

	public void setEnablePublishing(Boolean enablePublishing) {
		this.enablePublishing = enablePublishing;
	}

	/**
	 * The package of document lists and content documents to be installed.
	 */
	protected String installationPackage;

	public String getInstallationPackage() {
		return this.installationPackage;
	}

	public void setInstallationPackage(String installationPackage) {
		this.installationPackage = installationPackage;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * If applicable, the registered namespace associated with objects, used to generate the fully qualified name. If no namespace is defined, the namespace associated with the tenant is automatically assigned.
	 */
	protected String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * The scope at which the object exists, such as "Tenant", "MasterCatalog", or "Site". Scope delineates the level and area of Mozu the object exists within or affects.
	 */
	protected String scopeType;

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	/**
	 * Determines if documentLists belonging to this documentListType will support drafting and ActiveDateRanges documents. This field defaults to false and cannot be updated. Each documentList created from the documentListType will use this value.
	 */
	protected Boolean supportsActiveDateRanges;

	public Boolean getSupportsActiveDateRanges() {
		return this.supportsActiveDateRanges;
	}

	public void setSupportsActiveDateRanges(Boolean supportsActiveDateRanges) {
		this.supportsActiveDateRanges = supportsActiveDateRanges;
	}

	/**
	 * Indicates if modified documents are published automatically or saved to publish at a later time. If true, changed documents in this list can be saved as drafts until they are published to the site. If false, all document changes are immediately published in live mode. System-supplied and read only.
	 */
	protected Boolean supportsPublishing;

	public Boolean getSupportsPublishing() {
		return this.supportsPublishing;
	}

	public void setSupportsPublishing(Boolean supportsPublishing) {
		this.supportsPublishing = supportsPublishing;
	}

	/**
	 * List description of usages for content within a view and scope.
	 */
	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	/**
	 * The current version number of the order, wish list, document list, or document type list.
	 */
	protected String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Definition of any documents to create with a document list is created. 
	 */
	protected List<DocumentInstallation> defaultDocuments;
	public List<DocumentInstallation> getDefaultDocuments() {
		return this.defaultDocuments;
	}
	public void setDefaultDocuments(List<DocumentInstallation> defaultDocuments) {
		this.defaultDocuments = defaultDocuments;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	/**
	 * The view in the site used by associated entities or document lists/list types.
	 */
	protected List<View> views;
	public List<View> getViews() {
		return this.views;
	}
	public void setViews(List<View> views) {
		this.views = views;
	}

}
