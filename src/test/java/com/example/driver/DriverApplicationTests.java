package com.example.driver;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.driver.Controller.DriverController;
import com.example.driver.Model.Driver;
import com.example.driver.Repository.DriverRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
class DriverApplicationTests {


	// 	private MockMvc mvc;
	// @Mock
	// private DriverRepository driverrepo;

	// @InjectMocks
	// private DriverController driverController;

	// private JacksonTester<Driver> jsonDriver;

	// private JacksonTester<Collection<Driver>> jsonDrivers;

	

	// @BeforeEach
    // public void setUp() {
    //     MockitoAnnotations.openMocks(this);
    //     JacksonTester.initFields(this, new ObjectMapper().registerModule(new JavaTimeModule()));
    //     mvc = MockMvcBuilders.standaloneSetup(driverController).build();
    // }

	// // @Test
	// // public void canAddANewDriver() throws Exception {
	// // 	Driver driver = new Driver(1L, "abc", 021343, "abc22", "1313", LocalDateTime.now(), LocalDateTime.now(), 152.0, 1L);
    // //    when(driverrepo.save(driver)).thenReturn((driver));
	// // 	mvc.perform(post("/drivers/add")
	// // 			.contentType(MediaType.APPLICATION_JSON)
	// // 			.content(jsonDriver.write(driver).getJson()))
	// // 			.andExpect(status().isOk());

	// // }

	// @Test
	// public void canGetAllDrivers() throws Exception {
	// 	Driver driver1 = new Driver(1L, "abc", 021343, "abc22", "1313", LocalDateTime.now(), LocalDateTime.now(), 152.0, 1L);
	// 	Driver driver2 = new Driver(1L, "abc", 021343, "abc22", "1313", LocalDateTime.now(), LocalDateTime.now(), 152.0, 1L);
	// 	List<Driver> driverList = new ArrayList<>();
	// 	driverList.add(driver1);
	// 	driverList.add(driver2);
	// 	when(driverrepo.findAll()).thenReturn(driverList);
	// 	mvc.perform(get("/drivers/getAll")
	// 			.contentType(MediaType.APPLICATION_JSON))
	// 			.andExpect(status().isOk())
	// 			.andExpect(content().json(jsonDrivers.write(driverList).getJson()));
	// }
}
