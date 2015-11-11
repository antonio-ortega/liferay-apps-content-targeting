<#--
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
-->

<#macro closeConfirm
	confirmMessage
	controlCssClass
>
	<@aui["input"] type="hidden" name="closeConfirm" value="true" />

	<@aui["script"] use="aui-base">
		A.all('.${controlCssClass}').on(
			'mouseup',
			function(event) {
				var closeConfirmElement = A.one('#<@portlet["namespace"] />closeConfirm');

				closeConfirmElement.val('false');
			}
		);

		A.on(
			'beforeunload',
			function(event) {
				var closeConfirmElement = A.one('#<@portlet["namespace"] />closeConfirm');

				if (closeConfirmElement.val() === 'true') {

					if (event.stopPropagation) {

						event.stopPropagation();
					}

					event.cancelBubble = true;
					event.returnValue = '<@liferay_ui["message"] key="${confirmMessage}" />';

					event.preventDefault('<@liferay_ui["message"] key="${confirmMessage}" />');

					return '<@liferay_ui["message"] key="${confirmMessage}" />';
				}
			}
		);
	</@>
</#macro>

<#macro fieldHeaderListener
	fieldName
>
	<@aui["script"] use="aui-base">
		var formBuilder = A.one('.form-builder-drop-container');

		formBuilder.delegate(
			'blur',
			function(){
				var node = this;

				var headerSpan = node.ancestor('.form-builder-field-content').one('span.field-description-alias');
				var headerInfoSpan = node.ancestor('.form-builder-field-content').one('span.field-description-info');

				if (node.val() && node.val() !== '') {
					var headerValue = node.val();

					if (headerInfoSpan.text() !== '') {
						headerValue += '. ';
					}

					headerSpan.text(headerValue);
				}
				else {
					headerSpan.text('');
				}
			},
			'[name*="${fieldName}"]'
		);

		formBuilder.all('[name*="${fieldName}"]').each(
			function(node) {
				var headerSpan = node.ancestor('.form-builder-field-content').one('span.field-description-alias');
				var headerInfoSpan = node.ancestor('.form-builder-field-content').one('span.field-description-info');

				if (node.val() && node.val() !== '') {
					var headerValue = node.val();

					if (headerInfoSpan.text() !== '') {
						headerValue += '. ';
					}

					headerSpan.text(headerValue);
				}
				else {
					headerSpan.text('');
				}
			}
		);
	</@>
</#macro>