/*package br.com.paulorezende.inventorycontrol.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.paulorezende.inventorycontrol.model.Incoming;
import br.com.paulorezende.inventorycontrol.repository.UserRepository;
import br.com.paulorezende.inventorycontrol.service.UserService;
import br.com.paulorezende.inventorycontrol.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void shouldSaveNewUser() {
        final Incoming savedUser = stubRepositoryToReturnUserOnSave();
        final Incoming user = new Incoming();
        final Incoming returnedUser = userService.save(user);
        // verify repository was called with user
        Mockito.verify(userRepository, Mockito.times(1)).save(user);
        assertEquals("Returned user should come from the repository", savedUser, returnedUser);
    }

    private Incoming stubRepositoryToReturnUserOnSave() {
        Incoming user = new Incoming();
        Mockito.when(userRepository.save(Mockito.any(Incoming.class))).thenReturn(user);
        return user;
    }

}*/