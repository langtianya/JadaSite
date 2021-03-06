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

package com.jada.admin.customAttribute;

public class CustomAttributeDisplayForm {
	String customAttribId;
	String customAttribName;
	String customAttribTypeDesc;
	boolean itemCompare;
	String systemRecord;
	public String getCustomAttribId() {
		return customAttribId;
	}
	public void setCustomAttribId(String customAttribId) {
		this.customAttribId = customAttribId;
	}
	public String getCustomAttribName() {
		return customAttribName;
	}
	public void setCustomAttribName(String customAttribName) {
		this.customAttribName = customAttribName;
	}
	public String getCustomAttribTypeDesc() {
		return customAttribTypeDesc;
	}
	public void setCustomAttribTypeDesc(String customAttribTypeDesc) {
		this.customAttribTypeDesc = customAttribTypeDesc;
	}
	public boolean isItemCompare() {
		return itemCompare;
	}
	public void setItemCompare(boolean itemCompare) {
		this.itemCompare = itemCompare;
	}
	public String getSystemRecord() {
		return systemRecord;
	}
	public void setSystemRecord(String systemRecord) {
		this.systemRecord = systemRecord;
	}
}
