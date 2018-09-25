package com.fortna.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Delivery03 {
	@Id
	private Long Id;

	@Column(name = "CREATED")
	private Date createdBy;

	@Column(name = "UPDATED")
	private Date updatedBy;

	@Column(name = "STATUSID")
	private Long statusId;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "IDOCDELVRY03ID")
	private EsbShpConIDoc esbShpConIDoc;

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

	public EsbShpConIDoc getEsbShpConIDoc() {
		return esbShpConIDoc;
	}

	public void setEsbShpConIDoc(EsbShpConIDoc esbShpConIDoc) {
		this.esbShpConIDoc = esbShpConIDoc;
	}

}
