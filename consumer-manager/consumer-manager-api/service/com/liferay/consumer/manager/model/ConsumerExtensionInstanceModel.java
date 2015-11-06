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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedAuditedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ConsumerExtensionInstance service. Represents a row in the &quot;CM_ConsumerExtensionInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConsumerExtensionInstance
 * @see com.liferay.consumer.manager.model.impl.ConsumerExtensionInstanceImpl
 * @see com.liferay.consumer.manager.model.impl.ConsumerExtensionInstanceModelImpl
 * @generated
 */
public interface ConsumerExtensionInstanceModel extends BaseModel<ConsumerExtensionInstance>,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a consumer extension instance model instance should use the {@link ConsumerExtensionInstance} interface instead.
	 */

	/**
	 * Returns the primary key of this consumer extension instance.
	 *
	 * @return the primary key of this consumer extension instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this consumer extension instance.
	 *
	 * @param primaryKey the primary key of this consumer extension instance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this consumer extension instance.
	 *
	 * @return the uuid of this consumer extension instance
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this consumer extension instance.
	 *
	 * @param uuid the uuid of this consumer extension instance
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the consumer extension instance ID of this consumer extension instance.
	 *
	 * @return the consumer extension instance ID of this consumer extension instance
	 */
	public long getConsumerExtensionInstanceId();

	/**
	 * Sets the consumer extension instance ID of this consumer extension instance.
	 *
	 * @param consumerExtensionInstanceId the consumer extension instance ID of this consumer extension instance
	 */
	public void setConsumerExtensionInstanceId(long consumerExtensionInstanceId);

	/**
	 * Returns the company ID of this consumer extension instance.
	 *
	 * @return the company ID of this consumer extension instance
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this consumer extension instance.
	 *
	 * @param companyId the company ID of this consumer extension instance
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this consumer extension instance.
	 *
	 * @return the user ID of this consumer extension instance
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this consumer extension instance.
	 *
	 * @param userId the user ID of this consumer extension instance
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this consumer extension instance.
	 *
	 * @return the user uuid of this consumer extension instance
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this consumer extension instance.
	 *
	 * @param userUuid the user uuid of this consumer extension instance
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this consumer extension instance.
	 *
	 * @return the user name of this consumer extension instance
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this consumer extension instance.
	 *
	 * @param userName the user name of this consumer extension instance
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this consumer extension instance.
	 *
	 * @return the create date of this consumer extension instance
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this consumer extension instance.
	 *
	 * @param createDate the create date of this consumer extension instance
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this consumer extension instance.
	 *
	 * @return the modified date of this consumer extension instance
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this consumer extension instance.
	 *
	 * @param modifiedDate the modified date of this consumer extension instance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the consumer extension key of this consumer extension instance.
	 *
	 * @return the consumer extension key of this consumer extension instance
	 */
	@AutoEscape
	public String getConsumerExtensionKey();

	/**
	 * Sets the consumer extension key of this consumer extension instance.
	 *
	 * @param consumerExtensionKey the consumer extension key of this consumer extension instance
	 */
	public void setConsumerExtensionKey(String consumerExtensionKey);

	/**
	 * Returns the consumer ID of this consumer extension instance.
	 *
	 * @return the consumer ID of this consumer extension instance
	 */
	public long getConsumerId();

	/**
	 * Sets the consumer ID of this consumer extension instance.
	 *
	 * @param consumerId the consumer ID of this consumer extension instance
	 */
	public void setConsumerId(long consumerId);

	/**
	 * Returns the type settings of this consumer extension instance.
	 *
	 * @return the type settings of this consumer extension instance
	 */
	@AutoEscape
	public String getTypeSettings();

	/**
	 * Sets the type settings of this consumer extension instance.
	 *
	 * @param typeSettings the type settings of this consumer extension instance
	 */
	public void setTypeSettings(String typeSettings);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.consumer.manager.model.ConsumerExtensionInstance consumerExtensionInstance);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.consumer.manager.model.ConsumerExtensionInstance> toCacheModel();

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionInstance toEscapedModel();

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionInstance toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}