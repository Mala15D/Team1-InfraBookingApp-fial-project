package com.infrabookingapp.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class BookingControllerTest {

	@Autowired
	private MockMvc mock;
	
	@Test
    public void getAllBookingsTest() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/booking")).andExpect(MockMvcResultMatchers.status().isOk());
    }
    @Test
    public void getBookingByIdTest() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/booking/{id}",1)).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
