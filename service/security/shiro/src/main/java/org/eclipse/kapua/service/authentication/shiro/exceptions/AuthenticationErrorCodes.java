/*******************************************************************************
 * Copyright (c) 2018 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.authentication.shiro.exceptions;

import org.eclipse.kapua.KapuaErrorCode;
import org.eclipse.kapua.service.certificate.PrivateCertificate;

/**
 * {@link org.eclipse.kapua.service.authentication.AuthenticationService} error codes
 * <p>
 * since 1.0.0
 */
public enum AuthenticationErrorCodes implements KapuaErrorCode {

    /**
     * A {@link PrivateCertificate} with {@link org.eclipse.kapua.service.certificate.CertificateUsage} equal to {@code JWT} is not present in the database.
     * This certificate must be installed at deployment time.
     */
    JWT_CERTIFICATE_NOT_FOUND
}
