package com.fortna.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EsbShpConIDoc {
	@Id
	private Long Id;

	@Column(name = "CREATED")
	private Date createdBy;

	@Column(name = "UPDATED")
	private Date updatedBy;

	@Column(name = "STATUSID")
	private Long statusId;

	@Column(name = "BEGIN_")
	private String begin;
	
	/*@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EDIDCSHPCONIDOCID")
	private Edidc40 edidc40;*/

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "esbShpConIDoc")
	private Delivery03 delivery03;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	/*public Edidc40 getEdidc40() {
		return edidc40;
	}

	public void setEdidc40(Edidc40 edidc40) {
		this.edidc40 = edidc40;
	}*/

	public Delivery03 getDelivery03() {
		return delivery03;
	}

	public void setDelivery03(Delivery03 delivery03) {
		this.delivery03 = delivery03;
	}

}
