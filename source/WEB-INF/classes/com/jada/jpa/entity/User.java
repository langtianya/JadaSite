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

package com.jada.jpa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = -3462677807309195425L;
	private String userId;
	private String userName;
	private String userPassword;
	private String userAddressLine1;
	private String userAddressLine2;
	private String userCityName;
	private String userStateName;
	private String userStateCode;
	private String userCountryName;
	private String userCountryCode;
	private String userZipCode;
	private String userEmail;
	private String userPhone;
	private String userType;
	private Date userLastLoginDatetime;
	private String userLastVisitSiteId;
	private Character active;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private Set<Site> sites = new HashSet<Site>(0);

	public User() {
	}

	public User(String userId, String userName, String userPassword,
			String userAddressLine1, String userAddressLine2,
			String userCityName, String userStateName, String userStateCode,
			String userCountryName, String userCountryCode, String userZipCode,
			String userEmail, String userType, Character active,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAddressLine1 = userAddressLine1;
		this.userAddressLine2 = userAddressLine2;
		this.userCityName = userCityName;
		this.userStateName = userStateName;
		this.userStateCode = userStateCode;
		this.userCountryName = userCountryName;
		this.userCountryCode = userCountryCode;
		this.userZipCode = userZipCode;
		this.userEmail = userEmail;
		this.userType = userType;
		this.active = active;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
	}

	public User(String userId, String userName, String userPassword,
			String userAddressLine1, String userAddressLine2,
			String userCityName, String userStateName, String userStateCode,
			String userCountryName, String userCountryCode, String userZipCode,
			String userEmail, String userPhone, String userType,
			Date userLastLoginDatetime, String userLastVisitSiteId,
			Character active, String recUpdateBy, Date recUpdateDatetime,
			String recCreateBy, Date recCreateDatetime, Set<Site> sites) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAddressLine1 = userAddressLine1;
		this.userAddressLine2 = userAddressLine2;
		this.userCityName = userCityName;
		this.userStateName = userStateName;
		this.userStateCode = userStateCode;
		this.userCountryName = userCountryName;
		this.userCountryCode = userCountryCode;
		this.userZipCode = userZipCode;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userType = userType;
		this.userLastLoginDatetime = userLastLoginDatetime;
		this.userLastVisitSiteId = userLastVisitSiteId;
		this.active = active;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.sites = sites;
	}

	@Id
	@Column(name = "user_id", nullable = false, length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_password", nullable = false, length = 128)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "user_address_line1", nullable = false, length = 30)
	public String getUserAddressLine1() {
		return this.userAddressLine1;
	}

	public void setUserAddressLine1(String userAddressLine1) {
		this.userAddressLine1 = userAddressLine1;
	}

	@Column(name = "user_address_line2", nullable = false, length = 30)
	public String getUserAddressLine2() {
		return this.userAddressLine2;
	}

	public void setUserAddressLine2(String userAddressLine2) {
		this.userAddressLine2 = userAddressLine2;
	}

	@Column(name = "user_city_name", nullable = false, length = 25)
	public String getUserCityName() {
		return this.userCityName;
	}

	public void setUserCityName(String userCityName) {
		this.userCityName = userCityName;
	}

	@Column(name = "user_state_name", nullable = false, length = 40)
	public String getUserStateName() {
		return this.userStateName;
	}

	public void setUserStateName(String userStateName) {
		this.userStateName = userStateName;
	}

	@Column(name = "user_state_code", nullable = true, length = 2)
	public String getUserStateCode() {
		return this.userStateCode;
	}

	public void setUserStateCode(String userStateCode) {
		this.userStateCode = userStateCode;
	}

	@Column(name = "user_country_name", nullable = false, length = 40)
	public String getUserCountryName() {
		return this.userCountryName;
	}

	public void setUserCountryName(String userCountryName) {
		this.userCountryName = userCountryName;
	}

	@Column(name = "user_country_code", nullable = false, length = 2)
	public String getUserCountryCode() {
		return this.userCountryCode;
	}

	public void setUserCountryCode(String userCountryCode) {
		this.userCountryCode = userCountryCode;
	}

	@Column(name = "user_zip_code", nullable = false, length = 10)
	public String getUserZipCode() {
		return this.userZipCode;
	}

	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}

	@Column(name = "user_email", nullable = false, length = 50)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_phone", length = 20)
	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Column(name = "user_type", nullable = false, length = 1)
	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_last_login_datetime")
	public Date getUserLastLoginDatetime() {
		return this.userLastLoginDatetime;
	}

	public void setUserLastLoginDatetime(Date userLastLoginDatetime) {
		this.userLastLoginDatetime = userLastLoginDatetime;
	}

	@Column(name = "user_last_visit_site_id", length = 20)
	public String getUserLastVisitSiteId() {
		return this.userLastVisitSiteId;
	}

	public void setUserLastVisitSiteId(String userLastVisitSiteId) {
		this.userLastVisitSiteId = userLastVisitSiteId;
	}

	@Column(name = "active", nullable = false, length = 1)
	public Character getActive() {
		return this.active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	@Column(name = "rec_update_by", nullable = false, length = 20)
	public String getRecUpdateBy() {
		return this.recUpdateBy;
	}

	public void setRecUpdateBy(String recUpdateBy) {
		this.recUpdateBy = recUpdateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_update_datetime", nullable = false)
	public Date getRecUpdateDatetime() {
		return this.recUpdateDatetime;
	}

	public void setRecUpdateDatetime(Date recUpdateDatetime) {
		this.recUpdateDatetime = recUpdateDatetime;
	}

	@Column(name = "rec_create_by", nullable = false, length = 20)
	public String getRecCreateBy() {
		return this.recCreateBy;
	}

	public void setRecCreateBy(String recCreateBy) {
		this.recCreateBy = recCreateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_create_datetime", nullable = false)
	public Date getRecCreateDatetime() {
		return this.recCreateDatetime;
	}

	public void setRecCreateDatetime(Date recCreateDatetime) {
		this.recCreateDatetime = recCreateDatetime;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "user_site", joinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "site_id", nullable = false, updatable = false) })
	public Set<Site> getSites() {
		return this.sites;
	}

	public void setSites(Set<Site> sites) {
		this.sites = sites;
	}

}
