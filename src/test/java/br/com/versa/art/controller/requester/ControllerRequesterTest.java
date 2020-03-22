package br.com.versa.art.controller.requester;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class ControllerRequesterTest {

    private MockMvc mockMvc;
    @BeforeEach
    public void setup(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(ControllerRequester.class).build();
    }

    @Test
    void controllerRequester() throws JSONException {

    }
}
