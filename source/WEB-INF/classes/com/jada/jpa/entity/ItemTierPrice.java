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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ItemTierPrice generated by hbm2java
 */
@Entity
@Table(name = "item_tier_price")
public class ItemTierPrice implements java.io.Serializable {

	private static final long serialVersionUID = -5546716902934196666L;
	private Long itemTierPriceId;
	private Integer itemTierQty;
	private Date itemTierPricePublishOn;
	private Date itemTierPriceExpireOn;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private ItemTierPriceCurrency itemTierPriceCurrency;
	private Set<ItemTierPriceCurrency> itemTierPriceCurrencies = new HashSet<ItemTierPriceCurrency>(
			0);
	private CustomerClass customerClass;
	private Item item;

	public ItemTierPrice() {
	}

	public ItemTierPrice(Integer itemTierQty, String recUpdateBy,
			Date recUpdateDatetime, String recCreateBy, Date recCreateDatetime,
			ItemTierPriceCurrency itemTierPriceCurrency) {
		this.itemTierQty = itemTierQty;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.itemTierPriceCurrency = itemTierPriceCurrency;
	}

	public ItemTierPrice(Integer itemTierQty, Date itemTierPricePublishOn,
			Date itemTierPriceExpireOn, String recUpdateBy,
			Date recUpdateDatetime, String recCreateBy, Date recCreateDatetime,
			ItemTierPriceCurrency itemTierPriceCurrency,
			Set<ItemTierPriceCurrency> itemTierPriceCurrencies,
			CustomerClass customerClass, Item item) {
		this.itemTierQty = itemTierQty;
		this.itemTierPricePublishOn = itemTierPricePublishOn;
		this.itemTierPriceExpireOn = itemTierPriceExpireOn;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.itemTierPriceCurrency = itemTierPriceCurrency;
		this.itemTierPriceCurrencies = itemTierPriceCurrencies;
		this.customerClass = customerClass;
		this.item = item;
	}

	@Id
	@GeneratedValue
	@Column(name = "item_tier_price_id", nullable = false)
	public Long getItemTierPriceId() {
		return this.itemTierPriceId;
	}

	public void setItemTierPriceId(Long itemTierPriceId) {
		this.itemTierPriceId = itemTierPriceId;
	}

	@Column(name = "item_tier_qty", nullable = false)
	public Integer getItemTierQty() {
		return this.itemTierQty;
	}

	public void setItemTierQty(Integer itemTierQty) {
		this.itemTierQty = itemTierQty;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "item_tier_price_publish_on", length = 10)
	public Date getItemTierPricePublishOn() {
		return this.itemTierPricePublishOn;
	}

	public void setItemTierPricePublishOn(Date itemTierPricePublishOn) {
		this.itemTierPricePublishOn = itemTierPricePublishOn;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "item_tier_price_expire_on", length = 10)
	public Date getItemTierPriceExpireOn() {
		return this.itemTierPriceExpireOn;
	}

	public void setItemTierPriceExpireOn(Date itemTierPriceExpireOn) {
		this.itemTierPriceExpireOn = itemTierPriceExpireOn;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_tier_price_curr_id", nullable = false)
	public ItemTierPriceCurrency getItemTierPriceCurrency() {
		return this.itemTierPriceCurrency;
	}

	public void setItemTierPriceCurrency(
			ItemTierPriceCurrency itemTierPriceCurrency) {
		this.itemTierPriceCurrency = itemTierPriceCurrency;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_tier_price_id")
	public Set<ItemTierPriceCurrency> getItemTierPriceCurrencies() {
		return this.itemTierPriceCurrencies;
	}

	public void setItemTierPriceCurrencies(
			Set<ItemTierPriceCurrency> itemTierPriceCurrencies) {
		this.itemTierPriceCurrencies = itemTierPriceCurrencies;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_class_id")
	public CustomerClass getCustomerClass() {
		return this.customerClass;
	}

	public void setCustomerClass(CustomerClass customerClass) {
		this.customerClass = customerClass;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
