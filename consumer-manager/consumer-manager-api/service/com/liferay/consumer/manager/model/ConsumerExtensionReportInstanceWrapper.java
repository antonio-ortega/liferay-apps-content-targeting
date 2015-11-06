/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.consumer.manager.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ConsumerExtensionReportInstance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConsumerExtensionReportInstance
 * @generated
 */
public class ConsumerExtensionReportInstanceWrapper
	implements ConsumerExtensionReportInstance,
		ModelWrapper<ConsumerExtensionReportInstance> {
	public ConsumerExtensionReportInstanceWrapper(
		ConsumerExtensionReportInstance consumerExtensionReportInstance) {
		_consumerExtensionReportInstance = consumerExtensionReportInstance;
	}

	@Override
	public Class<?> getModelClass() {
		return ConsumerExtensionReportInstance.class;
	}

	@Override
	public String getModelClassName() {
		return ConsumerExtensionReportInstance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("consumerExtensionReportInstanceId",
			getConsumerExtensionReportInstanceId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("consumerId", getConsumerId());
		attributes.put("reportCategoryKey", getReportCategoryKey());
		attributes.put("reportKey", getReportKey());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("typeSettings", getTypeSettings());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long consumerExtensionReportInstanceId = (Long)attributes.get(
				"consumerExtensionReportInstanceId");

		if (consumerExtensionReportInstanceId != null) {
			setConsumerExtensionReportInstanceId(consumerExtensionReportInstanceId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long consumerId = (Long)attributes.get("consumerId");

		if (consumerId != null) {
			setConsumerId(consumerId);
		}

		String reportCategoryKey = (String)attributes.get("reportCategoryKey");

		if (reportCategoryKey != null) {
			setReportCategoryKey(reportCategoryKey);
		}

		String reportKey = (String)attributes.get("reportKey");

		if (reportKey != null) {
			setReportKey(reportKey);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String typeSettings = (String)attributes.get("typeSettings");

		if (typeSettings != null) {
			setTypeSettings(typeSettings);
		}
	}

	/**
	* Returns the primary key of this consumer extension report instance.
	*
	* @return the primary key of this consumer extension report instance
	*/
	@Override
	public long getPrimaryKey() {
		return _consumerExtensionReportInstance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this consumer extension report instance.
	*
	* @param primaryKey the primary key of this consumer extension report instance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_consumerExtensionReportInstance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this consumer extension report instance.
	*
	* @return the uuid of this consumer extension report instance
	*/
	@Override
	public java.lang.String getUuid() {
		return _consumerExtensionReportInstance.getUuid();
	}

	/**
	* Sets the uuid of this consumer extension report instance.
	*
	* @param uuid the uuid of this consumer extension report instance
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_consumerExtensionReportInstance.setUuid(uuid);
	}

	/**
	* Returns the consumer extension report instance ID of this consumer extension report instance.
	*
	* @return the consumer extension report instance ID of this consumer extension report instance
	*/
	@Override
	public long getConsumerExtensionReportInstanceId() {
		return _consumerExtensionReportInstance.getConsumerExtensionReportInstanceId();
	}

	/**
	* Sets the consumer extension report instance ID of this consumer extension report instance.
	*
	* @param consumerExtensionReportInstanceId the consumer extension report instance ID of this consumer extension report instance
	*/
	@Override
	public void setConsumerExtensionReportInstanceId(
		long consumerExtensionReportInstanceId) {
		_consumerExtensionReportInstance.setConsumerExtensionReportInstanceId(consumerExtensionReportInstanceId);
	}

	/**
	* Returns the company ID of this consumer extension report instance.
	*
	* @return the company ID of this consumer extension report instance
	*/
	@Override
	public long getCompanyId() {
		return _consumerExtensionReportInstance.getCompanyId();
	}

	/**
	* Sets the company ID of this consumer extension report instance.
	*
	* @param companyId the company ID of this consumer extension report instance
	*/
	@Override
	public void setCompanyId(long companyId) {
		_consumerExtensionReportInstance.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this consumer extension report instance.
	*
	* @return the user ID of this consumer extension report instance
	*/
	@Override
	public long getUserId() {
		return _consumerExtensionReportInstance.getUserId();
	}

	/**
	* Sets the user ID of this consumer extension report instance.
	*
	* @param userId the user ID of this consumer extension report instance
	*/
	@Override
	public void setUserId(long userId) {
		_consumerExtensionReportInstance.setUserId(userId);
	}

	/**
	* Returns the user uuid of this consumer extension report instance.
	*
	* @return the user uuid of this consumer extension report instance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstance.getUserUuid();
	}

	/**
	* Sets the user uuid of this consumer extension report instance.
	*
	* @param userUuid the user uuid of this consumer extension report instance
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_consumerExtensionReportInstance.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this consumer extension report instance.
	*
	* @return the user name of this consumer extension report instance
	*/
	@Override
	public java.lang.String getUserName() {
		return _consumerExtensionReportInstance.getUserName();
	}

	/**
	* Sets the user name of this consumer extension report instance.
	*
	* @param userName the user name of this consumer extension report instance
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_consumerExtensionReportInstance.setUserName(userName);
	}

	/**
	* Returns the create date of this consumer extension report instance.
	*
	* @return the create date of this consumer extension report instance
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _consumerExtensionReportInstance.getCreateDate();
	}

	/**
	* Sets the create date of this consumer extension report instance.
	*
	* @param createDate the create date of this consumer extension report instance
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_consumerExtensionReportInstance.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this consumer extension report instance.
	*
	* @return the modified date of this consumer extension report instance
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _consumerExtensionReportInstance.getModifiedDate();
	}

	/**
	* Sets the modified date of this consumer extension report instance.
	*
	* @param modifiedDate the modified date of this consumer extension report instance
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_consumerExtensionReportInstance.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the consumer ID of this consumer extension report instance.
	*
	* @return the consumer ID of this consumer extension report instance
	*/
	@Override
	public long getConsumerId() {
		return _consumerExtensionReportInstance.getConsumerId();
	}

	/**
	* Sets the consumer ID of this consumer extension report instance.
	*
	* @param consumerId the consumer ID of this consumer extension report instance
	*/
	@Override
	public void setConsumerId(long consumerId) {
		_consumerExtensionReportInstance.setConsumerId(consumerId);
	}

	/**
	* Returns the report category key of this consumer extension report instance.
	*
	* @return the report category key of this consumer extension report instance
	*/
	@Override
	public java.lang.String getReportCategoryKey() {
		return _consumerExtensionReportInstance.getReportCategoryKey();
	}

	/**
	* Sets the report category key of this consumer extension report instance.
	*
	* @param reportCategoryKey the report category key of this consumer extension report instance
	*/
	@Override
	public void setReportCategoryKey(java.lang.String reportCategoryKey) {
		_consumerExtensionReportInstance.setReportCategoryKey(reportCategoryKey);
	}

	/**
	* Returns the report key of this consumer extension report instance.
	*
	* @return the report key of this consumer extension report instance
	*/
	@Override
	public java.lang.String getReportKey() {
		return _consumerExtensionReportInstance.getReportKey();
	}

	/**
	* Sets the report key of this consumer extension report instance.
	*
	* @param reportKey the report key of this consumer extension report instance
	*/
	@Override
	public void setReportKey(java.lang.String reportKey) {
		_consumerExtensionReportInstance.setReportKey(reportKey);
	}

	/**
	* Returns the name of this consumer extension report instance.
	*
	* @return the name of this consumer extension report instance
	*/
	@Override
	public java.lang.String getName() {
		return _consumerExtensionReportInstance.getName();
	}

	/**
	* Returns the localized name of this consumer extension report instance in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized name of this consumer extension report instance
	*/
	@Override
	public java.lang.String getName(java.util.Locale locale) {
		return _consumerExtensionReportInstance.getName(locale);
	}

	/**
	* Returns the localized name of this consumer extension report instance in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized name of this consumer extension report instance. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getName(java.util.Locale locale, boolean useDefault) {
		return _consumerExtensionReportInstance.getName(locale, useDefault);
	}

	/**
	* Returns the localized name of this consumer extension report instance in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized name of this consumer extension report instance
	*/
	@Override
	public java.lang.String getName(java.lang.String languageId) {
		return _consumerExtensionReportInstance.getName(languageId);
	}

	/**
	* Returns the localized name of this consumer extension report instance in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized name of this consumer extension report instance
	*/
	@Override
	public java.lang.String getName(java.lang.String languageId,
		boolean useDefault) {
		return _consumerExtensionReportInstance.getName(languageId, useDefault);
	}

	@Override
	public java.lang.String getNameCurrentLanguageId() {
		return _consumerExtensionReportInstance.getNameCurrentLanguageId();
	}

	@Override
	public java.lang.String getNameCurrentValue() {
		return _consumerExtensionReportInstance.getNameCurrentValue();
	}

	/**
	* Returns a map of the locales and localized names of this consumer extension report instance.
	*
	* @return the locales and localized names of this consumer extension report instance
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getNameMap() {
		return _consumerExtensionReportInstance.getNameMap();
	}

	/**
	* Sets the name of this consumer extension report instance.
	*
	* @param name the name of this consumer extension report instance
	*/
	@Override
	public void setName(java.lang.String name) {
		_consumerExtensionReportInstance.setName(name);
	}

	/**
	* Sets the localized name of this consumer extension report instance in the language.
	*
	* @param name the localized name of this consumer extension report instance
	* @param locale the locale of the language
	*/
	@Override
	public void setName(java.lang.String name, java.util.Locale locale) {
		_consumerExtensionReportInstance.setName(name, locale);
	}

	/**
	* Sets the localized name of this consumer extension report instance in the language, and sets the default locale.
	*
	* @param name the localized name of this consumer extension report instance
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setName(java.lang.String name, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_consumerExtensionReportInstance.setName(name, locale, defaultLocale);
	}

	@Override
	public void setNameCurrentLanguageId(java.lang.String languageId) {
		_consumerExtensionReportInstance.setNameCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized names of this consumer extension report instance from the map of locales and localized names.
	*
	* @param nameMap the locales and localized names of this consumer extension report instance
	*/
	@Override
	public void setNameMap(
		java.util.Map<java.util.Locale, java.lang.String> nameMap) {
		_consumerExtensionReportInstance.setNameMap(nameMap);
	}

	/**
	* Sets the localized names of this consumer extension report instance from the map of locales and localized names, and sets the default locale.
	*
	* @param nameMap the locales and localized names of this consumer extension report instance
	* @param defaultLocale the default locale
	*/
	@Override
	public void setNameMap(
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Locale defaultLocale) {
		_consumerExtensionReportInstance.setNameMap(nameMap, defaultLocale);
	}

	/**
	* Returns the description of this consumer extension report instance.
	*
	* @return the description of this consumer extension report instance
	*/
	@Override
	public java.lang.String getDescription() {
		return _consumerExtensionReportInstance.getDescription();
	}

	/**
	* Returns the localized description of this consumer extension report instance in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this consumer extension report instance
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _consumerExtensionReportInstance.getDescription(locale);
	}

	/**
	* Returns the localized description of this consumer extension report instance in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this consumer extension report instance. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _consumerExtensionReportInstance.getDescription(locale,
			useDefault);
	}

	/**
	* Returns the localized description of this consumer extension report instance in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this consumer extension report instance
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _consumerExtensionReportInstance.getDescription(languageId);
	}

	/**
	* Returns the localized description of this consumer extension report instance in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this consumer extension report instance
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _consumerExtensionReportInstance.getDescription(languageId,
			useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _consumerExtensionReportInstance.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _consumerExtensionReportInstance.getDescriptionCurrentValue();
	}

	/**
	* Returns a map of the locales and localized descriptions of this consumer extension report instance.
	*
	* @return the locales and localized descriptions of this consumer extension report instance
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _consumerExtensionReportInstance.getDescriptionMap();
	}

	/**
	* Sets the description of this consumer extension report instance.
	*
	* @param description the description of this consumer extension report instance
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_consumerExtensionReportInstance.setDescription(description);
	}

	/**
	* Sets the localized description of this consumer extension report instance in the language.
	*
	* @param description the localized description of this consumer extension report instance
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_consumerExtensionReportInstance.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this consumer extension report instance in the language, and sets the default locale.
	*
	* @param description the localized description of this consumer extension report instance
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_consumerExtensionReportInstance.setDescription(description, locale,
			defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_consumerExtensionReportInstance.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this consumer extension report instance from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this consumer extension report instance
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
		_consumerExtensionReportInstance.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this consumer extension report instance from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this consumer extension report instance
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_consumerExtensionReportInstance.setDescriptionMap(descriptionMap,
			defaultLocale);
	}

	/**
	* Returns the type settings of this consumer extension report instance.
	*
	* @return the type settings of this consumer extension report instance
	*/
	@Override
	public java.lang.String getTypeSettings() {
		return _consumerExtensionReportInstance.getTypeSettings();
	}

	/**
	* Sets the type settings of this consumer extension report instance.
	*
	* @param typeSettings the type settings of this consumer extension report instance
	*/
	@Override
	public void setTypeSettings(java.lang.String typeSettings) {
		_consumerExtensionReportInstance.setTypeSettings(typeSettings);
	}

	@Override
	public boolean isNew() {
		return _consumerExtensionReportInstance.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_consumerExtensionReportInstance.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _consumerExtensionReportInstance.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_consumerExtensionReportInstance.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _consumerExtensionReportInstance.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _consumerExtensionReportInstance.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_consumerExtensionReportInstance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _consumerExtensionReportInstance.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_consumerExtensionReportInstance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_consumerExtensionReportInstance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_consumerExtensionReportInstance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _consumerExtensionReportInstance.getAvailableLanguageIds();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _consumerExtensionReportInstance.getDefaultLanguageId();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_consumerExtensionReportInstance.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_consumerExtensionReportInstance.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new ConsumerExtensionReportInstanceWrapper((ConsumerExtensionReportInstance)_consumerExtensionReportInstance.clone());
	}

	@Override
	public int compareTo(
		com.liferay.consumer.manager.model.ConsumerExtensionReportInstance consumerExtensionReportInstance) {
		return _consumerExtensionReportInstance.compareTo(consumerExtensionReportInstance);
	}

	@Override
	public int hashCode() {
		return _consumerExtensionReportInstance.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> toCacheModel() {
		return _consumerExtensionReportInstance.toCacheModel();
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance toEscapedModel() {
		return new ConsumerExtensionReportInstanceWrapper(_consumerExtensionReportInstance.toEscapedModel());
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance toUnescapedModel() {
		return new ConsumerExtensionReportInstanceWrapper(_consumerExtensionReportInstance.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _consumerExtensionReportInstance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _consumerExtensionReportInstance.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_consumerExtensionReportInstance.persist();
	}

	@Override
	public boolean isInstantiable() {
		return _consumerExtensionReportInstance.isInstantiable();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConsumerExtensionReportInstanceWrapper)) {
			return false;
		}

		ConsumerExtensionReportInstanceWrapper consumerExtensionReportInstanceWrapper =
			(ConsumerExtensionReportInstanceWrapper)obj;

		if (Validator.equals(_consumerExtensionReportInstance,
					consumerExtensionReportInstanceWrapper._consumerExtensionReportInstance)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _consumerExtensionReportInstance.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConsumerExtensionReportInstance getWrappedConsumerExtensionReportInstance() {
		return _consumerExtensionReportInstance;
	}

	@Override
	public ConsumerExtensionReportInstance getWrappedModel() {
		return _consumerExtensionReportInstance;
	}

	@Override
	public void resetOriginalValues() {
		_consumerExtensionReportInstance.resetOriginalValues();
	}

	private ConsumerExtensionReportInstance _consumerExtensionReportInstance;
}