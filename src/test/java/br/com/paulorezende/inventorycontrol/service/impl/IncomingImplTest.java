package br.com.paulorezende.inventorycontrol.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.paulorezende.inventorycontrol.model.Incoming;
import br.com.paulorezende.inventorycontrol.repository.IncomingRepository;
import br.com.paulorezende.inventorycontrol.service.IncomingService;

@RunWith(MockitoJUnitRunner.class)
public class IncomingImplTest {

    private static final int SIZE_FIND_ALL_INCOMINGS = 3;

	@Mock
    private IncomingRepository incomingRepository;

    @InjectMocks
    private IncomingService incomingService = new IncomingServiceImpl();

    @Before
    public void setUp() {
    	
    }

    @Test
    public void shouldSaveNewIncoming() {
        final Incoming incoming = new Incoming();
        incomingService.save(incoming);
        Mockito.verify(incomingRepository, Mockito.times(1)).save(incoming);
    }
    
    @Test
    public void shouldReturnAllIncomings() {
    	Mockito.when(incomingRepository.findAll()).thenReturn(getAllIncomings(SIZE_FIND_ALL_INCOMINGS));
    	
    	List<Incoming> incomings = incomingService.findAll();
    	
    	Assert.assertNotNull(incomings);
    	Assert.assertEquals(SIZE_FIND_ALL_INCOMINGS, incomings.size());
    }

	private List<Incoming> getAllIncomings(int size) {
		List<Incoming> incomings = new ArrayList<Incoming>();
		for (int i = 1; i <= size; i++) {
			Incoming incoming = new Incoming();
			incoming.setId(String.valueOf(i));
			incomings.add(incoming);
		}
		return incomings;
	}
    
    
}