package org.eclipse.dirigible.runtime.content;

import org.eclipse.dirigible.runtime.registry.IRuntimeServiceDescriptor;

/**
 * Descriptor for the Data Export Service
 */
public class DataExportRuntimeServiceDescriptor implements IRuntimeServiceDescriptor {

	private final String name = "Data Export";
	private final String description = "Data Export service helps in exporting the data of a table in delimiter separated values file (*.dsv).";
	private final String endpoint = "/data-export";
	private final String documentation = "http://www.dirigible.io/help/service_data_export.html";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getEndpoint() {
		return endpoint;
	}

	@Override
	public String getDocumentation() {
		return documentation;
	}

}
