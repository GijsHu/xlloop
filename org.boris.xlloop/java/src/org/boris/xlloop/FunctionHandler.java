/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.xlloop;

import org.boris.variantcodec.VTCollection;
import org.boris.variantcodec.Variant;

public interface FunctionHandler 
{
    Variant execute(String name, VTCollection args) throws RequestException;
    
    boolean hasFunction(String name);    
}