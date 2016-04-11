package com.ua.doc.BusinessNew.model;

import javax.persistence.Embeddable;

@Embeddable
public class DownTable {
	private String date;
	private String nomenclature; //Номенклатура товарів/послуг продавця
	private String code;//Код товару згідно з УКТ ЗЕД
	private String measuringSign;// Одиниця виміру товару/ послуги умовне позначення (українське)
	private String measuringCode;
	private String number; //Кількість (об'єм, обсяг)
	private String priceWithout; //Ціна постачання одиниці товару/ послуги без урахування ПДВ
	private String basicRate; //основна ставка
	private String rate7; //ставка 7 %
	private String delivaryInUk; //постачання на митній території України
	private String export; //експорт
	private String exemptionFromPDV; //звільнення від ПДВ
	private String generalSumMoney;//Загальна сума коштів, що підлягає сплаті
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNomenclature() {
		return nomenclature;
	}
	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMeasuringSign() {
		return measuringSign;
	}
	public void setMeasuringSign(String measuringSign) {
		this.measuringSign = measuringSign;
	}
	public String getMeasuringCode() {
		return measuringCode;
	}
	public void setMeasuringCode(String measuringCode) {
		this.measuringCode = measuringCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPriceWithout() {
		return priceWithout;
	}
	public void setPriceWithout(String priceWithout) {
		this.priceWithout = priceWithout;
	}
	public String getBasicRate() {
		return basicRate;
	}
	public void setBasicRate(String basicRate) {
		this.basicRate = basicRate;
	}
	public String getRate7() {
		return rate7;
	}
	public void setRate7(String rate7) {
		this.rate7 = rate7;
	}
	public String getDelivaryInUk() {
		return delivaryInUk;
	}
	public void setDelivaryInUk(String delivaryInUk) {
		this.delivaryInUk = delivaryInUk;
	}
	public String getExport() {
		return export;
	}
	public void setExport(String export) {
		this.export = export;
	}
	public String getExemptionFromPDV() {
		return exemptionFromPDV;
	}
	public void setExemptionFromPDV(String exemptionFromPDV) {
		this.exemptionFromPDV = exemptionFromPDV;
	}
	public String getGeneralSumMoney() {
		return generalSumMoney;
	}
	public void setGeneralSumMoney(String generalSumMoney) {
		this.generalSumMoney = generalSumMoney;
	}
	
	public DownTable(String date, String nomenclature, String code, String measuringSign, String measuringCode,
			String number, String priceWithout, String basicRate, String rate7, String delivaryInUk, String export,
			String exemptionFromPDV, String generalSumMoney) {
		super();
		this.date = date;
		this.nomenclature = nomenclature;
		this.code = code;
		this.measuringSign = measuringSign;
		this.measuringCode = measuringCode;
		this.number = number;
		this.priceWithout = priceWithout;
		this.basicRate = basicRate;
		this.rate7 = rate7;
		this.delivaryInUk = delivaryInUk;
		this.export = export;
		this.exemptionFromPDV = exemptionFromPDV;
		this.generalSumMoney = generalSumMoney;
	}
	
	//@Override
	public String toString() {
		return "DownTable [date=" + date + ", nomenclature=" + nomenclature + ", code=" + code + ", measuringSign="
				+ measuringSign + ", measuringCode=" + measuringCode + ", number=" + number + ", priceWithout="
				+ priceWithout + ", basicRate=" + basicRate + ", rate7=" + rate7 + ", delivaryInUk=" + delivaryInUk
				+ ", export=" + export + ", exemptionFromPDV=" + exemptionFromPDV + ", generalSumMoney="
				+ generalSumMoney + "]";
	}



}
