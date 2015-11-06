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

package com.liferay.consumer.manager.model.impl;

import com.liferay.consumer.manager.model.ConsumerExtensionReportInstance;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConsumerExtensionReportInstance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ConsumerExtensionReportInstance
 * @generated
 */
public class ConsumerExtensionReportInstanceCacheModel implements CacheModel<ConsumerExtensionReportInstance>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", consumerExtensionReportInstanceId=");
		sb.append(consumerExtensionReportInstanceId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", consumerId=");
		sb.append(consumerId);
		sb.append(", reportCategoryKey=");
		sb.append(reportCategoryKey);
		sb.append(", reportKey=");
		sb.append(reportKey);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", typeSettings=");
		sb.append(typeSettings);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConsumerExtensionReportInstance toEntityModel() {
		ConsumerExtensionReportInstanceImpl consumerExtensionReportInstanceImpl = new ConsumerExtensionReportInstanceImpl();

		if (uuid == null) {
			consumerExtensionReportInstanceImpl.setUuid(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setUuid(uuid);
		}

		consumerExtensionReportInstanceImpl.setConsumerExtensionReportInstanceId(consumerExtensionReportInstanceId);
		consumerExtensionReportInstanceImpl.setCompanyId(companyId);
		consumerExtensionReportInstanceImpl.setUserId(userId);

		if (userName == null) {
			consumerExtensionReportInstanceImpl.setUserName(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			consumerExtensionReportInstanceImpl.setCreateDate(null);
		}
		else {
			consumerExtensionReportInstanceImpl.setCreateDate(new Date(
					createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			consumerExtensionReportInstanceImpl.setModifiedDate(null);
		}
		else {
			consumerExtensionReportInstanceImpl.setModifiedDate(new Date(
					modifiedDate));
		}

		consumerExtensionReportInstanceImpl.setConsumerId(consumerId);

		if (reportCategoryKey == null) {
			consumerExtensionReportInstanceImpl.setReportCategoryKey(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setReportCategoryKey(reportCategoryKey);
		}

		if (reportKey == null) {
			consumerExtensionReportInstanceImpl.setReportKey(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setReportKey(reportKey);
		}

		if (name == null) {
			consumerExtensionReportInstanceImpl.setName(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setName(name);
		}

		if (description == null) {
			consumerExtensionReportInstanceImpl.setDescription(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setDescription(description);
		}

		if (typeSettings == null) {
			consumerExtensionReportInstanceImpl.setTypeSettings(StringPool.BLANK);
		}
		else {
			consumerExtensionReportInstanceImpl.setTypeSettings(typeSettings);
		}

		consumerExtensionReportInstanceImpl.resetOriginalValues();

		return consumerExtensionReportInstanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		consumerExtensionReportInstanceId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		consumerId = objectInput.readLong();
		reportCategoryKey = objectInput.readUTF();
		reportKey = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		typeSettings = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(consumerExtensionReportInstanceId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(consumerId);

		if (reportCategoryKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportCategoryKey);
		}

		if (reportKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportKey);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (typeSettings == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeSettings);
		}
	}

	public String uuid;
	public long consumerExtensionReportInstanceId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long consumerId;
	public String reportCategoryKey;
	public String reportKey;
	public String name;
	public String description;
	public String typeSettings;
}