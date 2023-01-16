package net.andrzejczak.test.contract.server.api

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

@SpringBootTest
@AutoConfigureMessageVerifier
abstract class BaseTestClass extends Specification {

    @Autowired
    WebApplicationContext webApplicationContext



    def setup() {

        /*
            Could be also testes controller in issolation:

            @Autowired
            AnimalController controller
            ...
            RestAssuredMockMvc.standaloneSetup(controller)
         */

        RestAssuredMockMvc.webAppContextSetup(webApplicationContext)
    }
}
