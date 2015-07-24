package br.com.paulorezende.inventorycontrol.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.paulorezende.inventorycontrol.model.Incoming;
import br.com.paulorezende.inventorycontrol.service.IncomingService;

@RunWith(MockitoJUnitRunner.class)
public class IncomingControllerTest {

    @Mock
    private IncomingService userService;

    @InjectMocks
    private IncomingController userController = new IncomingController();

    @Before
    public void setUp() {
    	MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldCreateUser() throws Exception {
        final Incoming savedUser = stubServiceToReturnStoredUser();
        final Incoming user = new Incoming();
        /*Incoming returnedUser = */userController.post(user);
        // verify user was passed to UserService
        Mockito.verify(userService, Mockito.times(1)).save(user);
//        assertEquals("Returned user should come from the service", savedUser, returnedUser);
    }

    private Incoming stubServiceToReturnStoredUser() {
        final Incoming user = new Incoming();
//        Mockito.when(userService.save(Mockito.any(Incoming.class))).thenReturn(user);
        return user;
    }

}