package net.viralpatel.contact.controller;

import static org.junit.Assert.*;
import net.viralpatel.contact.service.ContactService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@Controller
@RunWith(MockitoJUnitRunner.class)
public class ContactControllerTest {
	
	@Mock
	ContactService contactService;
	
	@InjectMocks
	ContactController contactController;
	
	MockMvc mockMvc;
	
	
	@Before
	public void setUp()
	{
		 MockitoAnnotations.initMocks(this);
		    this.mockMvc = MockMvcBuilders.standaloneSetup(contactController).build();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("i m in test");
	}

}
