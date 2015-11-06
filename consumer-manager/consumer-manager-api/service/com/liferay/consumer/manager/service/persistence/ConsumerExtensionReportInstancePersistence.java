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

package com.liferay.consumer.manager.service.persistence;

import com.liferay.consumer.manager.model.ConsumerExtensionReportInstance;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the consumer extension report instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConsumerExtensionReportInstancePersistenceImpl
 * @see ConsumerExtensionReportInstanceUtil
 * @generated
 */
public interface ConsumerExtensionReportInstancePersistence
	extends BasePersistence<ConsumerExtensionReportInstance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConsumerExtensionReportInstanceUtil} to access the consumer extension report instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the consumer extension report instances where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consumer extension report instances where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @return the range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consumer extension report instances where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instances before and after the current consumer extension report instance in the ordered set where uuid = &#63;.
	*
	* @param consumerExtensionReportInstanceId the primary key of the current consumer extension report instance
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance[] findByUuid_PrevAndNext(
		long consumerExtensionReportInstanceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumer extension report instances where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumer extension report instances where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consumer extension report instances where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consumer extension report instances where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @return the range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consumer extension report instances where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instances before and after the current consumer extension report instance in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param consumerExtensionReportInstanceId the primary key of the current consumer extension report instance
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance[] findByUuid_C_PrevAndNext(
		long consumerExtensionReportInstanceId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumer extension report instances where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumer extension report instances where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consumer extension report instances where consumerId = &#63;.
	*
	* @param consumerId the consumer ID
	* @return the matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByConsumerId(
		long consumerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consumer extension report instances where consumerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param consumerId the consumer ID
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @return the range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByConsumerId(
		long consumerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consumer extension report instances where consumerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param consumerId the consumer ID
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByConsumerId(
		long consumerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where consumerId = &#63;.
	*
	* @param consumerId the consumer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByConsumerId_First(
		long consumerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where consumerId = &#63;.
	*
	* @param consumerId the consumer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByConsumerId_First(
		long consumerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where consumerId = &#63;.
	*
	* @param consumerId the consumer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByConsumerId_Last(
		long consumerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where consumerId = &#63;.
	*
	* @param consumerId the consumer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByConsumerId_Last(
		long consumerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instances before and after the current consumer extension report instance in the ordered set where consumerId = &#63;.
	*
	* @param consumerExtensionReportInstanceId the primary key of the current consumer extension report instance
	* @param consumerId the consumer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance[] findByConsumerId_PrevAndNext(
		long consumerExtensionReportInstanceId, long consumerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumer extension report instances where consumerId = &#63; from the database.
	*
	* @param consumerId the consumer ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByConsumerId(long consumerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumer extension report instances where consumerId = &#63;.
	*
	* @param consumerId the consumer ID
	* @return the number of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByConsumerId(long consumerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consumer extension report instances where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @return the matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByC_R(
		long consumerId, java.lang.String reportKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consumer extension report instances where consumerId = &#63; and reportKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @return the range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByC_R(
		long consumerId, java.lang.String reportKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consumer extension report instances where consumerId = &#63; and reportKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByC_R(
		long consumerId, java.lang.String reportKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByC_R_First(
		long consumerId, java.lang.String reportKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByC_R_First(
		long consumerId, java.lang.String reportKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByC_R_Last(
		long consumerId, java.lang.String reportKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByC_R_Last(
		long consumerId, java.lang.String reportKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instances before and after the current consumer extension report instance in the ordered set where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerExtensionReportInstanceId the primary key of the current consumer extension report instance
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance[] findByC_R_PrevAndNext(
		long consumerExtensionReportInstanceId, long consumerId,
		java.lang.String reportKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumer extension report instances where consumerId = &#63; and reportKey = &#63; from the database.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_R(long consumerId, java.lang.String reportKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumer extension report instances where consumerId = &#63; and reportKey = &#63;.
	*
	* @param consumerId the consumer ID
	* @param reportKey the report key
	* @return the number of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_R(long consumerId, java.lang.String reportKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consumer extension report instances where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @return the matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByC_C_R(
		long companyId, long consumerId, java.lang.String reportCategoryKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consumer extension report instances where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @return the range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByC_C_R(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consumer extension report instances where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findByC_C_R(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByC_C_R_First(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first consumer extension report instance in the ordered set where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByC_C_R_First(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByC_C_R_Last(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last consumer extension report instance in the ordered set where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByC_C_R_Last(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instances before and after the current consumer extension report instance in the ordered set where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param consumerExtensionReportInstanceId the primary key of the current consumer extension report instance
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance[] findByC_C_R_PrevAndNext(
		long consumerExtensionReportInstanceId, long companyId,
		long consumerId, java.lang.String reportCategoryKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumer extension report instances where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63; from the database.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C_R(long companyId, long consumerId,
		java.lang.String reportCategoryKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumer extension report instances where companyId = &#63; and consumerId = &#63; and reportCategoryKey = &#63;.
	*
	* @param companyId the company ID
	* @param consumerId the consumer ID
	* @param reportCategoryKey the report category key
	* @return the number of matching consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C_R(long companyId, long consumerId,
		java.lang.String reportCategoryKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the consumer extension report instance in the entity cache if it is enabled.
	*
	* @param consumerExtensionReportInstance the consumer extension report instance
	*/
	public void cacheResult(
		com.liferay.consumer.manager.model.ConsumerExtensionReportInstance consumerExtensionReportInstance);

	/**
	* Caches the consumer extension report instances in the entity cache if it is enabled.
	*
	* @param consumerExtensionReportInstances the consumer extension report instances
	*/
	public void cacheResult(
		java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> consumerExtensionReportInstances);

	/**
	* Creates a new consumer extension report instance with the primary key. Does not add the consumer extension report instance to the database.
	*
	* @param consumerExtensionReportInstanceId the primary key for the new consumer extension report instance
	* @return the new consumer extension report instance
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance create(
		long consumerExtensionReportInstanceId);

	/**
	* Removes the consumer extension report instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param consumerExtensionReportInstanceId the primary key of the consumer extension report instance
	* @return the consumer extension report instance that was removed
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance remove(
		long consumerExtensionReportInstanceId)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance updateImpl(
		com.liferay.consumer.manager.model.ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instance with the primary key or throws a {@link com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException} if it could not be found.
	*
	* @param consumerExtensionReportInstanceId the primary key of the consumer extension report instance
	* @return the consumer extension report instance
	* @throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance findByPrimaryKey(
		long consumerExtensionReportInstanceId)
		throws com.liferay.consumer.manager.NoSuchConsumerExtensionReportInstanceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consumer extension report instance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param consumerExtensionReportInstanceId the primary key of the consumer extension report instance
	* @return the consumer extension report instance, or <code>null</code> if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchByPrimaryKey(
		long consumerExtensionReportInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consumer extension report instances.
	*
	* @return the consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consumer extension report instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @return the range of consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consumer extension report instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of consumer extension report instances
	* @param end the upper bound of the range of consumer extension report instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consumer extension report instances from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consumer extension report instances.
	*
	* @return the number of consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}