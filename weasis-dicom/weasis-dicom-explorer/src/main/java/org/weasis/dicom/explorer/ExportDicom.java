/*******************************************************************************
 * Copyright (c) 2009-2018 Weasis Team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Roduit - initial API and implementation
 *******************************************************************************/
package org.weasis.dicom.explorer;

import java.io.IOException;

import javax.swing.JProgressBar;

import org.weasis.core.api.gui.util.PageProps;

public interface ExportDicom extends PageProps {

    void exportDICOM(CheckTreeModel model, JProgressBar info) throws IOException;

}
