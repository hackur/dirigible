/*******************************************************************************
 * Copyright (c) 2015 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.ide.publish.ui.command;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.dirigible.ide.publish.ui.command.messages"; //$NON-NLS-1$
	public static String AutoActivateAction_FAILED_TO_ACTIVATE_PROJECT;
	public static String AutoActivateAction_FAILED_TO_ACTIVATE_FILE;
	public static String AutoActivateAction_AUTO_ACTIVATION_FAILED;
	public static String AutoActivateAction_FAILED_TO_PUBLISH_PROJECT;
	public static String AutoActivateAction_AUTO_PUBLISH_FAILED;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
