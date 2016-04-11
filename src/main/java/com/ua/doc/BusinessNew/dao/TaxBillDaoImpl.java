package com.ua.doc.BusinessNew.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.ua.doc.BusinessNew.model.DownTable;
import com.ua.doc.BusinessNew.model.TaxBillAll;

@Repository
public class TaxBillDaoImpl implements TaxBillDao {
	@Autowired
	private MongoTemplate mongoTemplate;

	public static final String COLLECTIONNAME = "taxbillAll";

	public void addTaxBillAll(TaxBillAll tba) {
		if (!mongoTemplate.collectionExists(TaxBillAll.class)) {
			mongoTemplate.createCollection(TaxBillAll.class);
		}
		tba.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(tba, COLLECTIONNAME);
	}

	public List<TaxBillAll> listCustomer() {
		return mongoTemplate.findAll(TaxBillAll.class, COLLECTIONNAME);
	}
	/*public List<DownTable> listDown() {
		return mongoTemplate.findAll(DownTable.class, COLLECTIONNAME);
	}*/

	public void deleteTaxBillAll(TaxBillAll tba) {
		mongoTemplate.remove(tba, COLLECTIONNAME);
	}

	public void updateTaxBillAll(TaxBillAll tba) {
		mongoTemplate.insert(tba, COLLECTIONNAME);
	}
}