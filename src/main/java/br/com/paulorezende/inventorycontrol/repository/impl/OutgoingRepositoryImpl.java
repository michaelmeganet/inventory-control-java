package br.com.paulorezende.inventorycontrol.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import br.com.paulorezende.inventorycontrol.model.Incoming;
import br.com.paulorezende.inventorycontrol.repository.OutgoingRepository;

@Component
public class OutgoingRepositoryImpl implements OutgoingRepository {

	@Autowired
	private MongoOperations mongoOperations;
	
	@Override
	public Incoming findById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoOperations.findOne(query, Incoming.class);
	}
	
}
