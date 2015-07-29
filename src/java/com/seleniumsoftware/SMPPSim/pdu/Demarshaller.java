/****************************************************************************
 * Demarshaller.java
 *
 * Copyright (C) Selenium Software Ltd 2006
 *
 * This file is part of SMPPSim.
 *
 * SMPPSim is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * SMPPSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SMPPSim; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * @author martin@seleniumsoftware.com
 * http://www.woolleynet.com
 * http://www.seleniumsoftware.com
 * $Header: /var/cvsroot/SMPPSim2/distribution/2.6.0/SMPPSim/src/java/com/seleniumsoftware/SMPPSim/pdu/Demarshaller.java,v 1.1 2009/03/11 08:41:45 martin Exp $
 ****************************************************************************/
package com.seleniumsoftware.SMPPSim.pdu;
public interface Demarshaller {

/* All request PDUs must implement this interface such that they can populate their
 * own attributes from an input byte array
 */

	public void demarshall(byte [] request) throws Exception;

}
