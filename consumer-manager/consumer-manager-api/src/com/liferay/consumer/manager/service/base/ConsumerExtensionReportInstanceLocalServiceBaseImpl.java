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

package com.liferay.consumer.manager.service.base;

import com.liferay.consumer.manager.model.ConsumerExtensionReportInstance;
import com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalService;
import com.liferay.consumer.manager.service.persistence.ConsumerExtensionInstancePersistence;
import com.liferay.consumer.manager.service.persistence.ConsumerExtensionReportInstancePersistence;
import com.liferay.consumer.manager.service.persistence.ConsumerPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the consumer extension report instance local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.consumer.manager.service.impl.ConsumerExtensionReportInstanceLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.consumer.manager.service.impl.ConsumerExtensionReportInstanceLocalServiceImpl
 * @see com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalServiceUtil
 * @generated
 */
public abstract class ConsumerExtensionReportInstanceLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements ConsumerExtensionReportInstanceLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalServiceUtil} to access the consumer extension report instance local service.
	 */

	/**
	 * Adds the consumer extension report instance to the database. Also notifies the appropriate model listeners.
	 *
	 * @param consumerExtensionReportInstance the consumer extension report instance
	 * @return the consumer extension report instance that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ConsumerExtensionReportInstance addConsumerExtensionReportInstance(
		ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws SystemException {
		consumerExtensionReportInstance.setNew(true);

		return consumerExtensionReportInstancePersistence.update(consumerExtensionReportInstance);
	}

	/**
	 * Creates a new consumer extension report instance with the primary key. Does not add the consumer extension report instance to the database.
	 *
	 * @param consumerExtensionReportInstanceId the primary key for the new consumer extension report instance
	 * @return the new consumer extension report instance
	 */
	@Override
	public ConsumerExtensionReportInstance createConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId) {
		return consumerExtensionReportInstancePersistence.create(consumerExtensionReportInstanceId);
	}

	/**
	 * Deletes the consumer extension report instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param consumerExtensionReportInstanceId the primary key of the consumer extension report instance
	 * @return the consumer extension report instance that was removed
	 * @throws PortalException if a consumer extension report instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ConsumerExtensionReportInstance deleteConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId)
		throws PortalException, SystemException {
		return consumerExtensionReportInstancePersistence.remove(consumerExtensionReportInstanceId);
	}

	/**
	 * Deletes the consumer extension report instance from the database. Also notifies the appropriate model listeners.
	 *
	 * @param consumerExtensionReportInstance the consumer extension report instance
	 * @return the consumer extension report instance that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ConsumerExtensionReportInstance deleteConsumerExtensionReportInstance(
		ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws SystemException {
		return consumerExtensionReportInstancePersistence.remove(consumerExtensionReportInstance);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(ConsumerExtensionReportInstance.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return consumerExtensionReportInstancePersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return consumerExtensionReportInstancePersistence.findWithDynamicQuery(dynamicQuery,
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return consumerExtensionReportInstancePersistence.findWithDynamicQuery(dynamicQuery,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return consumerExtensionReportInstancePersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return consumerExtensionReportInstancePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public ConsumerExtensionReportInstance fetchConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId) throws SystemException {
		return consumerExtensionReportInstancePersistence.fetchByPrimaryKey(consumerExtensionReportInstanceId);
	}

	/**
	 * Returns the consumer extension report instance with the matching UUID and company.
	 *
	 * @param uuid the consumer extension report instance's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching consumer extension report instance, or <code>null</code> if a matching consumer extension report instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConsumerExtensionReportInstance fetchConsumerExtensionReportInstanceByUuidAndCompanyId(
		String uuid, long companyId) throws SystemException {
		return consumerExtensionReportInstancePersistence.fetchByUuid_C_First(uuid,
			companyId, null);
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
	public ConsumerExtensionReportInstance getConsumerExtensionReportInstance(
		long consumerExtensionReportInstanceId)
		throws PortalException, SystemException {
		return consumerExtensionReportInstancePersistence.findByPrimaryKey(consumerExtensionReportInstanceId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return consumerExtensionReportInstancePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the consumer extension report instance with the matching UUID and company.
	 *
	 * @param uuid the consumer extension report instance's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching consumer extension report instance
	 * @throws PortalException if a matching consumer extension report instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConsumerExtensionReportInstance getConsumerExtensionReportInstanceByUuidAndCompanyId(
		String uuid, long companyId) throws PortalException, SystemException {
		return consumerExtensionReportInstancePersistence.findByUuid_C_First(uuid,
			companyId, null);
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
	public List<ConsumerExtensionReportInstance> getConsumerExtensionReportInstances(
		int start, int end) throws SystemException {
		return consumerExtensionReportInstancePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of consumer extension report instances.
	 *
	 * @return the number of consumer extension report instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConsumerExtensionReportInstancesCount()
		throws SystemException {
		return consumerExtensionReportInstancePersistence.countAll();
	}

	/**
	 * Updates the consumer extension report instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param consumerExtensionReportInstance the consumer extension report instance
	 * @return the consumer extension report instance that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ConsumerExtensionReportInstance updateConsumerExtensionReportInstance(
		ConsumerExtensionReportInstance consumerExtensionReportInstance)
		throws SystemException {
		return consumerExtensionReportInstancePersistence.update(consumerExtensionReportInstance);
	}

	/**
	 * Returns the consumer local service.
	 *
	 * @return the consumer local service
	 */
	public com.liferay.consumer.manager.service.ConsumerLocalService getConsumerLocalService() {
		return consumerLocalService;
	}

	/**
	 * Sets the consumer local service.
	 *
	 * @param consumerLocalService the consumer local service
	 */
	public void setConsumerLocalService(
		com.liferay.consumer.manager.service.ConsumerLocalService consumerLocalService) {
		this.consumerLocalService = consumerLocalService;
	}

	/**
	 * Returns the consumer remote service.
	 *
	 * @return the consumer remote service
	 */
	public com.liferay.consumer.manager.service.ConsumerService getConsumerService() {
		return consumerService;
	}

	/**
	 * Sets the consumer remote service.
	 *
	 * @param consumerService the consumer remote service
	 */
	public void setConsumerService(
		com.liferay.consumer.manager.service.ConsumerService consumerService) {
		this.consumerService = consumerService;
	}

	/**
	 * Returns the consumer persistence.
	 *
	 * @return the consumer persistence
	 */
	public ConsumerPersistence getConsumerPersistence() {
		return consumerPersistence;
	}

	/**
	 * Sets the consumer persistence.
	 *
	 * @param consumerPersistence the consumer persistence
	 */
	public void setConsumerPersistence(ConsumerPersistence consumerPersistence) {
		this.consumerPersistence = consumerPersistence;
	}

	/**
	 * Returns the consumer extension instance local service.
	 *
	 * @return the consumer extension instance local service
	 */
	public com.liferay.consumer.manager.service.ConsumerExtensionInstanceLocalService getConsumerExtensionInstanceLocalService() {
		return consumerExtensionInstanceLocalService;
	}

	/**
	 * Sets the consumer extension instance local service.
	 *
	 * @param consumerExtensionInstanceLocalService the consumer extension instance local service
	 */
	public void setConsumerExtensionInstanceLocalService(
		com.liferay.consumer.manager.service.ConsumerExtensionInstanceLocalService consumerExtensionInstanceLocalService) {
		this.consumerExtensionInstanceLocalService = consumerExtensionInstanceLocalService;
	}

	/**
	 * Returns the consumer extension instance remote service.
	 *
	 * @return the consumer extension instance remote service
	 */
	public com.liferay.consumer.manager.service.ConsumerExtensionInstanceService getConsumerExtensionInstanceService() {
		return consumerExtensionInstanceService;
	}

	/**
	 * Sets the consumer extension instance remote service.
	 *
	 * @param consumerExtensionInstanceService the consumer extension instance remote service
	 */
	public void setConsumerExtensionInstanceService(
		com.liferay.consumer.manager.service.ConsumerExtensionInstanceService consumerExtensionInstanceService) {
		this.consumerExtensionInstanceService = consumerExtensionInstanceService;
	}

	/**
	 * Returns the consumer extension instance persistence.
	 *
	 * @return the consumer extension instance persistence
	 */
	public ConsumerExtensionInstancePersistence getConsumerExtensionInstancePersistence() {
		return consumerExtensionInstancePersistence;
	}

	/**
	 * Sets the consumer extension instance persistence.
	 *
	 * @param consumerExtensionInstancePersistence the consumer extension instance persistence
	 */
	public void setConsumerExtensionInstancePersistence(
		ConsumerExtensionInstancePersistence consumerExtensionInstancePersistence) {
		this.consumerExtensionInstancePersistence = consumerExtensionInstancePersistence;
	}

	/**
	 * Returns the consumer extension report instance local service.
	 *
	 * @return the consumer extension report instance local service
	 */
	public com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalService getConsumerExtensionReportInstanceLocalService() {
		return consumerExtensionReportInstanceLocalService;
	}

	/**
	 * Sets the consumer extension report instance local service.
	 *
	 * @param consumerExtensionReportInstanceLocalService the consumer extension report instance local service
	 */
	public void setConsumerExtensionReportInstanceLocalService(
		com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalService consumerExtensionReportInstanceLocalService) {
		this.consumerExtensionReportInstanceLocalService = consumerExtensionReportInstanceLocalService;
	}

	/**
	 * Returns the consumer extension report instance remote service.
	 *
	 * @return the consumer extension report instance remote service
	 */
	public com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceService getConsumerExtensionReportInstanceService() {
		return consumerExtensionReportInstanceService;
	}

	/**
	 * Sets the consumer extension report instance remote service.
	 *
	 * @param consumerExtensionReportInstanceService the consumer extension report instance remote service
	 */
	public void setConsumerExtensionReportInstanceService(
		com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceService consumerExtensionReportInstanceService) {
		this.consumerExtensionReportInstanceService = consumerExtensionReportInstanceService;
	}

	/**
	 * Returns the consumer extension report instance persistence.
	 *
	 * @return the consumer extension report instance persistence
	 */
	public ConsumerExtensionReportInstancePersistence getConsumerExtensionReportInstancePersistence() {
		return consumerExtensionReportInstancePersistence;
	}

	/**
	 * Sets the consumer extension report instance persistence.
	 *
	 * @param consumerExtensionReportInstancePersistence the consumer extension report instance persistence
	 */
	public void setConsumerExtensionReportInstancePersistence(
		ConsumerExtensionReportInstancePersistence consumerExtensionReportInstancePersistence) {
		this.consumerExtensionReportInstancePersistence = consumerExtensionReportInstancePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.consumer.manager.model.ConsumerExtensionReportInstance",
			consumerExtensionReportInstanceLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.consumer.manager.model.ConsumerExtensionReportInstance");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return ConsumerExtensionReportInstance.class;
	}

	protected String getModelClassName() {
		return ConsumerExtensionReportInstance.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = consumerExtensionReportInstancePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.consumer.manager.service.ConsumerLocalService.class)
	protected com.liferay.consumer.manager.service.ConsumerLocalService consumerLocalService;
	@BeanReference(type = com.liferay.consumer.manager.service.ConsumerService.class)
	protected com.liferay.consumer.manager.service.ConsumerService consumerService;
	@BeanReference(type = ConsumerPersistence.class)
	protected ConsumerPersistence consumerPersistence;
	@BeanReference(type = com.liferay.consumer.manager.service.ConsumerExtensionInstanceLocalService.class)
	protected com.liferay.consumer.manager.service.ConsumerExtensionInstanceLocalService consumerExtensionInstanceLocalService;
	@BeanReference(type = com.liferay.consumer.manager.service.ConsumerExtensionInstanceService.class)
	protected com.liferay.consumer.manager.service.ConsumerExtensionInstanceService consumerExtensionInstanceService;
	@BeanReference(type = ConsumerExtensionInstancePersistence.class)
	protected ConsumerExtensionInstancePersistence consumerExtensionInstancePersistence;
	@BeanReference(type = com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalService.class)
	protected com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceLocalService consumerExtensionReportInstanceLocalService;
	@BeanReference(type = com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceService.class)
	protected com.liferay.consumer.manager.service.ConsumerExtensionReportInstanceService consumerExtensionReportInstanceService;
	@BeanReference(type = ConsumerExtensionReportInstancePersistence.class)
	protected ConsumerExtensionReportInstancePersistence consumerExtensionReportInstancePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ConsumerExtensionReportInstanceLocalServiceClpInvoker _clpInvoker = new ConsumerExtensionReportInstanceLocalServiceClpInvoker();
}