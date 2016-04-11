package com.ua.doc.BusinessNew.dao;

import java.util.List;

import com.ua.doc.BusinessNew.model.DownTable;
import com.ua.doc.BusinessNew.model.TaxBillAll;

public interface TaxBillDao {
	public void addTaxBillAll(TaxBillAll tba);
	public List<TaxBillAll> listCustomer();
	//public List<DownTable> listDown();
	public void deleteTaxBillAll(TaxBillAll tba);
	public void updateTaxBillAll(TaxBillAll tba);
	

}
