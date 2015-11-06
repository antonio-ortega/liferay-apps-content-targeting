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

package com.liferay.consumer.manager.api.model;

import com.liferay.consumer.manager.model.ConsumerExtensionReportInstance;

import java.util.Locale;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

/**
 * Provides the Report interface, allowing custom report creation and evaluation
 * for the Consumer Manager Portlet.
 *
 * @author Eduardo Garcia
 */
public interface ConsumerExtensionReport {

	public static final String DEVICES_CATEGORY_KEY = "devices";

	public static final String REPORTS_CATEGORY_KEY = "reports";

	/**
	 * Does processing when the report is installed.
	 */
	public void activate();

	/**
	 * Does processing when the report is uninstalled.
	 */
	public void deActivate();

	/**
	 * Returns the report localized description.
	 *
	 * @param  locale the language locale
	 * @return the report localized description
	 */
	public String getDescription(Locale locale);

	/**
	 * Returns the HTML code containing the advanced properties edit form for
	 * the report
	 *
	 * @param  reportInstance the report instance with stored configuration
	 * @param  context the map defining the form evaluation context
	 * @return the HTML code containing the form fields required to edit the
	 *         report instance configuration, based on the context
	 */
	public String getEditHTML(
		ConsumerExtensionReportInstance reportInstance,
		Map<String, Object> context);

	/**
	 * Returns the HTML code containing the report presentation based on the
	 * context.
	 *
	 * @param  reportInstance the report instance with stored configuration
	 * @param  context the map defining the form evaluation context
	 * @return the HTML code containing the form fields required to show the
	 *         report instance, based on the context
	 */
	public String getHTML(
		ConsumerExtensionReportInstance reportInstance,
		Map<String, Object> context);

	/**
	 * Returns the HTML code containing the report presentation based on the
	 * context.
	 *
	 * @deprecated As of 2.0.0
	 * @param  context the map defining the form evaluation context
	 * @return the HTML code containing the form fields required to show the
	 *         report instance, based on the context
	 */
	@Deprecated
	public String getHTML(Map<String, Object> context);

	/**
	 * Returns the Font Awesome CSS class for the report icon.
	 *
	 * @return the Font Awesome CSS class for the report icon
	 * @see    <a href="http://fortawesome.github.io/Font-Awesome/3.2.1/">Font
	 *         Awesome documentation</a>
	 */
	public String getIcon();

	/**
	 * Returns the report localized name.
	 *
	 * @param  locale the language locale
	 * @return the report localized name
	 */
	public String getName(Locale locale);

	/**
	 * Returns the key that identifies the category of the report.
	 *
	 * @return the key that identifies the category
	 */
	public String getReportCategoryKey();

	/**
	 * Returns the key that identifies the report.
	 *
	 * @return the key that identifies the report
	 */
	public String getReportKey();

	/**
	 * Returns the type of element the report is aimed for.
	 *
	 * @return the type of element the report is aimed for
	 */
	public String getReportType();

	/**
	 * Returns <code>true</code> if the report can be used more than
	 * once with different values for a campaign.
	 *
	 * @return <code>true</code> if the report can be used more than once;
	 *         <code>false</code> otherwise
	 */
	public boolean isInstantiable();

	/**
	 * Returns <code>true</code> if the report is visible for an specific
	 * consumer.
	 *
	 * @param consumerId the id of the consumer for which the report type
	 *        visibility is checked
	 * @return <code>true</code> if the report is visible for the given consumer
	 *         <code>false</code> otherwise
	 */
	public boolean isVisible(long consumerId);

	/**
	 * Returns the result of evaluating the report form fields in the
	 * context of the request and response.
	 *
	 * @param  request the request from which to get the request parameters
	 * @param  response the response to receive the render parameters
	 * @param  reportInstance the report instance with stored configuration
	 * @return the result of evaluating the tracking action form fields in the
	 * 		   context of the request and response
	 */
	public String processEditReport(
			PortletRequest request, PortletResponse response,
			ConsumerExtensionReportInstance reportInstance)
		throws Exception;

	/**
	 * Updates the report data.
	 *
	 * @param  reportInstance the report instance with stored configuration
	 */
	public void updateReport(ConsumerExtensionReportInstance reportInstance);

	/**
	 * Returns the result of updating the report.
	 *
	 * @deprecated As of 2.0.0
	 * @param  consumerId the id of the consumer with the report type to be
	 *         updated
	 * @return the result of updating the report
	 */
	@Deprecated
	public String updateReport(long consumerId);

}