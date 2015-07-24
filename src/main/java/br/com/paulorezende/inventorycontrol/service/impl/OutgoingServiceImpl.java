package br.com.paulorezende.inventorycontrol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.paulorezende.inventorycontrol.model.Incoming;
import br.com.paulorezende.inventorycontrol.model.Outgoing;
import br.com.paulorezende.inventorycontrol.repository.OutgoingRepository;
import br.com.paulorezende.inventorycontrol.service.IncomingService;
import br.com.paulorezende.inventorycontrol.service.OutgoingService;

@Service
public class OutgoingServiceImpl implements OutgoingService {

	@Autowired
	private OutgoingRepository outgoingRepository;
	
	@Autowired
	private IncomingService incomingService;

    @Override
    @Transactional
    public void update(final Outgoing outgoing) {
    	Incoming incoming = outgoingRepository.findById(outgoing.getId());
    	removeQuantity(incoming, outgoing.getQuantity());
    	incomingService.save(incoming);
    }

	private void removeQuantity(Incoming incoming, Integer quantity) {
		if (incoming.getQuantity() > quantity) {
			incoming.setQuantity(incoming.getQuantity() - quantity);
		}
	}

}