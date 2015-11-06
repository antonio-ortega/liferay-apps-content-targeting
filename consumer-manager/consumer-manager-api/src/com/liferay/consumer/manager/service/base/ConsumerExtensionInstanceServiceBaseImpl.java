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

import com.liferay.consumer.manager.model.ConsumerExtensionInstance;
import com.liferay.consumer.manager.service.ConsumerExtensionInstanceService;
import com.liferay.consumer.manager.service.persistence.ConsumerExtensionInstancePersistence;
import com.liferay.consumer.manager.service.persistence.ConsumerExtensionReportInstancePersistence;
import com.liferay.consumer.manager.service.persistence.ConsumerPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the consumer extension instance remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.consumer.manager.service.impl.ConsumerExtensionInstanceServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.consumer.manager.service.impl.ConsumerExtensionInstanceServiceImpl
 * @see com.liferay.consumer.manager.service.ConsumerExtensionInstanceServiceUtil
 * @generated
 */
public abstract class ConsumerExtensionInstanceServiceBaseImpl
	extends BaseServiceImpl implements ConsumerExtensionInstanceService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.consumer.manager.service.ConsumerExtensionInstanceServiceUtil} to access the consumer extension instance remote service.
	 */

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
	}

	public void destroy() {
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
		return ConsumerExtensionInstance.class;
	}

	protected String getModelClassName() {
		return ConsumerExtensionInstance.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = consumerExtensionInstancePersistence.getDataSource();

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
	private ConsumerExtensionInstanceServiceClpInvoker _clpInvoker = new ConsumerExtensionInstanceServiceClpInvoker();
}