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

package com.jada.xml.paymentGateway;

public class PaymentExpress {
	private String postUsername;
	private String postPassword;
	private String environment;
	public void setPostUsername(String postUsername) {
		this.postUsername = postUsername;
	}
	public String getPostUsername() {
		return postUsername;
	}
	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}
	public String getPostPassword() {
		return postPassword;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getEnvironment() {
		return environment;
	}
}
