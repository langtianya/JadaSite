/*
 * Copyright 2007-2010 JadaSite.

 * This file is part of JadaSite.
 
 * JadaSite is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * JadaSite is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with JadaSite.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jada.dao;

import javax.persistence.EntityManager;

import com.jada.jpa.connection.JpaConnection;
import com.jada.jpa.entity.IeProfileHeader;
import com.jada.jpa.entity.Menu;

public class IeProfileHeaderDAO extends Menu {
	private static final long serialVersionUID = -1917561499284595185L;

	public static IeProfileHeader load(String siteId, Long ieProfileHeaderId) throws SecurityException, Exception {
    	EntityManager em = JpaConnection.getInstance().getCurrentEntityManager();
		IeProfileHeader ieProfileHeader = (IeProfileHeader) em.find(IeProfileHeader.class, ieProfileHeaderId);
		if (!ieProfileHeader.getSite().getSiteId().equals(siteId)) {
			throw new SecurityException();
		}
		return ieProfileHeader;
	}
}
