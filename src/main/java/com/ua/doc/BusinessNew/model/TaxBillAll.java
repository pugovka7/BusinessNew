package com.ua.doc.BusinessNew.model;

import java.util.List;

import javax.persistence.ElementCollection;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "taxbills")
public class TaxBillAll {
	
	@Id
	private String id;
	
	@Indexed
	private String ic;
	
	private String date;	
	private String number;
	private String name;	
	private String inn;
	private String adress;
	private String telephone;
	private String kindOfAgreement;
	private String kindOfPayment;
	
	@ElementCollection
	private List<DownTable> downTbl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIc() {
		return ic;
	}
	public void setIc(String ic) {
		this.ic = ic;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInn() {
		return inn;
	}
	public void setInn(String inn) {
		this.inn = inn;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getKindOfAgreement() {
		return kindOfAgreement;
	}
	public void setKindOfAgreement(String kindOfAgreement) {
		this.kindOfAgreement = kindOfAgreement;
	}
	public String getKindOfPayment() {
		return kindOfPayment;
	}
	public void setKindOfPayment(String kindOfPayment) {
		this.kindOfPayment = kindOfPayment;
	}
	public List<DownTable> getDownTbl() {
		return downTbl;
	}
	public void setDownTbl(List<DownTable> downTbl) {
		this.downTbl = downTbl;
	}
	public TaxBillAll(String ic, String date, String number, String name, String inn, String adress, String telephone,
			String kindOfAgreement, String kindOfPayment, List<DownTable> downTbl) {
		super();
		this.ic = ic;
		this.date = date;
		this.number = number;
		this.name = name;
		this.inn = inn;
		this.adress = adress;
		this.telephone = telephone;
		this.kindOfAgreement = kindOfAgreement;
		this.kindOfPayment = kindOfPayment;
		this.downTbl = downTbl;
	}
	
	@Override
	public String toString() {
		return "TaxBillAll [id=" + id + ", ic=" + ic + ", date=" + date + ", number=" + number + ", name=" + name
				+ ", inn=" + inn + ", adress=" + adress + ", telephone=" + telephone + ", kindOfAgreement="
				+ kindOfAgreement + ", kindOfPayment=" + kindOfPayment + ", downTbl=" + downTbl + "]";
	}

}
