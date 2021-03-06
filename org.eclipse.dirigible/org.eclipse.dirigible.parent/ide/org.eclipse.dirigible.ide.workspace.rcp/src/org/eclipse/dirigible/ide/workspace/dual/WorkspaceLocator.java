/******************************************************************************* 
 * Copyright (c) 2015 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.ide.workspace.dual;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.dirigible.ide.common.CommonIDEParameters;

public class WorkspaceLocator {

	public static IWorkspace getWorkspace() {
		CommonIDEParameters.initSystemParameters();
		return ResourcesPlugin.getWorkspace();
	}
	
	public static IWorkspace getWorkspace(String user) {
		return getWorkspace();
	}
	
	public static String getRepositoryPathForWorkspace(IWorkspace workspace) {
		return workspace.getRoot().getLocation().toString();
	}
	
}
