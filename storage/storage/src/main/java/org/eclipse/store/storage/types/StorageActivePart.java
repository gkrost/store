package org.eclipse.store.storage.types;

/*-
 * #%L
 * EclipseStore Storage
 * %%
 * Copyright (C) 2023 MicroStream Software
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */


/**
 * Interface representing an active component of a storage system.
 * <p>
 * Implementors of this interface represent parts of a storage system
 * that can be queried for their active status. The active state typically
 * indicates whether the part is currently operational or engaged in its
 * designated tasks.
 */
public interface StorageActivePart
{
	/**
	 * Queries whether the part is actually active right now. This might return <code>true</code> even
	 * despite some "running" flag being set to <code>false</code> because there might be one last
	 * loop cycle execution before checking the "running" flag again.
	 * 
	 * @return if the part is actually active right now.
	 */
	public boolean isActive();
}
