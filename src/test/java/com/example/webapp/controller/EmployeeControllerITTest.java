package com.example.webapp.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest// charge le contexte d application et les classe reel , pas de mockbean necessaire, different du test unitaire
@AutoConfigureMockMvc//afin qu’un objet MockMvc soit disponible dans le contexte Spring (ainsi il pourra être injecté dans l’attribut).
class EmployeeControllerITTest {

	 @Autowired
	    public MockMvc mockMvc;

	    @Test
	    public void testGetEmployees() throws Exception {
	          MvcResult result =mockMvc.perform(get("/"))	
	            .andDo(print())//imprime l objet retourné, ici la view
	            .andExpect(status().isOk()).andReturn();
	           
	          assertThat(result.getResponse().getContentAsString())
				.contains(">Laurent</span");
	    }
	  /*  @Test
	    public void testGetEmployees() throws Exception {
	        mockMvc.perform(get("/"))
	            .andDo(print())
	            .andExpect(status().isOk())
	            .andExpect(view().name("home"))
	            .andExpect(content().string(containsString("Laurent")));
	            
	            view().name(“home”) : le nom de vue retourné correspond au paramètre “home” ;

               content().string(containsString("Laurent")) : le corps de la réponse contient à un moment ou à un autre le texte Laurent.
	    }*/
}
