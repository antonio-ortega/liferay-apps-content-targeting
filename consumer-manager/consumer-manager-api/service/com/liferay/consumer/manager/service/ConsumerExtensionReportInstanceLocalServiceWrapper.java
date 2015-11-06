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

package com.liferay.consumer.manager.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConsumerExtensionReportInstanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConsumerExtensionReportInstanceLocalService
 * @generated
 */
public class ConsumerExtensionReportInstanceLocalServiceWrapper
	implements ConsumerExtensionReportInstanceLocalService,
		ServiceWrapper<ConsumerExtensionReportInstanceLocalService> {
	public ConsumerExtensionReportInstanceLocalServiceWrapper(
		ConsumerExtensionReportInstanceLocalService consumerExtensionReportInstanceLocalService) {
		_consumerExtensionReportInstanceLocalService = consumerExtensionReportInstanceLocalService;
	}

	/**
	* Adds the consumer extension report instance to the database. Also notifies the appropriate model listeners.
	*
	* @param consumerExtensionReportInstance the consumer extension report instance
	* @return the consumer extension report instance that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance addConsumerExtensionReportInstance(
		com.liferay.consumer.manager.model.ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.addConsumerExtensionReportInstance(consumerExtensionReportInstance);
	}

	/**
	* Creates a new consumer extension report instance with the primary key. Does not add the consumer extension report instance to the database.
	*
	* @param consumerExtensionReportInstanceId the primary key for the new consumer extension report instance
	* @return the new consumer extension report instance
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance createConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId) {
		return _consumerExtensionReportInstanceLocalService.createConsumerExtensionReportInstance(consumerExtensionReportInstanceId);
	}

	/**
	* Deletes the consumer extension report instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param consumerExtensionReportInstanceId the primary key of the consumer extension report instance
	* @return the consumer extension report instance that was removed
	* @throws PortalException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance deleteConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.deleteConsumerExtensionReportInstance(consumerExtensionReportInstanceId);
	}

	/**
	* Deletes the consumer extension report instance from the database. Also notifies the appropriate model listeners.
	*
	* @param consumerExtensionReportInstance the consumer extension report instance
	* @return the consumer extension report instance that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance deleteConsumerExtensionReportInstance(
		com.liferay.consumer.manager.model.ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.deleteConsumerExtensionReportInstance(consumerExtensionReportInstance);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _consumerExtensionReportInstanceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.consumer.manager.model.impl.ConsumerExtensionReportInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.fetchConsumerExtensionReportInstance(consumerExtensionReportInstanceId);
	}

	/**
	* Returns the consumer extension report instance with the matching UUID and company.
	*
	* @param uuid the consumer extension report instance's UUID
	* @param companyId the primary key of the company
	* @return the matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance fetchConsumerExtensionReportInstanceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.fetchConsumerExtensionReportInstanceByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the consumer extension report instance with the primary key.
	*
	* @param consumerExtensionReportInstanceId the primary key of the consumer extension report instance
	* @return the consumer extension report instance
	* @throws PortalException if a consumer extension report instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance getConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getConsumerExtensionReportInstance(consumerExtensionReportInstanceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the consumer extension report instance with the matching UUID and company.
	*
	* @param uuid the consumer extension report instance's UUID
	* @param companyId the primary key of the company
	* @return the matching consumer extension report instance
	* @throws PortalException if a matching consumer extension report instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance getConsumerExtensionReportInstanceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getConsumerExtensionReportInstanceByUuidAndCompanyId(uuid,
			companyId);
	}

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
	@Override
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> getConsumerExtensionReportInstances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getConsumerExtensionReportInstances(start,
			end);
	}

	/**
	* Returns the number of consumer extension report instances.
	*
	* @return the number of consumer extension report instances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConsumerExtensionReportInstancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getConsumerExtensionReportInstancesCount();
	}

	/**
	* Updates the consumer extension report instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param consumerExtensionReportInstance the consumer extension report instance
	* @return the consumer extension report instance that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance updateConsumerExtensionReportInstance(
		com.liferay.consumer.manager.model.ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.updateConsumerExtensionReportInstance(consumerExtensionReportInstance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _consumerExtensionReportInstanceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_consumerExtensionReportInstanceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _consumerExtensionReportInstanceLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance addConsumerExtensionReportInstance(
		long consumerId, java.lang.String reportKey,
		java.lang.String reportCategoryKey, java.lang.String name,
		java.lang.String description, java.lang.String typeSettings,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.addConsumerExtensionReportInstance(consumerId,
			reportKey, reportCategoryKey, name, description, typeSettings,
			serviceContext);
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance addConsumerExtensionReportInstance(
		long consumerId, java.lang.String reportKey,
		java.lang.String reportCategoryKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String typeSettings,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.addConsumerExtensionReportInstance(consumerId,
			reportKey, reportCategoryKey, nameMap, descriptionMap,
			typeSettings, serviceContext);
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance getReportInstance(
		long consumerExtensionReportInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getReportInstance(consumerExtensionReportInstanceId);
	}

	@Override
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> getReportInstances(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getReportInstances(companyId,
			consumerId, reportCategoryKey, start, end);
	}

	@Override
	public int getReportInstancesCount(long companyId, long consumerId,
		java.lang.String reportCategoryKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.getReportInstancesCount(companyId,
			consumerId, reportCategoryKey);
	}

	@Override
	public java.util.List<com.liferay.consumer.manager.model.ConsumerExtensionReportInstance> searchReportInstances(
		long companyId, long consumerId, java.lang.String reportCategoryKey,
		java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.searchReportInstances(companyId,
			consumerId, reportCategoryKey, keywords, start, end);
	}

	@Override
	public com.liferay.consumer.manager.model.ConsumerExtensionReportInstance updateConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId, long consumerId,
		java.lang.String reportKey, java.lang.String reportCategoryKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String typeSettings,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _consumerExtensionReportInstanceLocalService.updateConsumerExtensionReportInstance(consumerExtensionReportInstanceId,
			consumerId, reportKey, reportCategoryKey, nameMap, descriptionMap,
			typeSettings, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConsumerExtensionReportInstanceLocalService getWrappedConsumerExtensionReportInstanceLocalService() {
		return _consumerExtensionReportInstanceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConsumerExtensionReportInstanceLocalService(
		ConsumerExtensionReportInstanceLocalService consumerExtensionReportInstanceLocalService) {
		_consumerExtensionReportInstanceLocalService = consumerExtensionReportInstanceLocalService;
	}

	@Override
	public ConsumerExtensionReportInstanceLocalService getWrappedService() {
		return _consumerExtensionReportInstanceLocalService;
	}

	@Override
	public void setWrappedService(
		ConsumerExtensionReportInstanceLocalService consumerExtensionReportInstanceLocalService) {
		_consumerExtensionReportInstanceLocalService = consumerExtensionReportInstanceLocalService;
	}

	private ConsumerExtensionReportInstanceLocalService _consumerExtensionReportInstanceLocalService;
}