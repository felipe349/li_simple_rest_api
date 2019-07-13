package br.com.felipe.restapi.springcloudcontract;

import br.com.felipe.restapi.controller.PessoaController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MvcTest {

    @Autowired
    PessoaController pessoaController;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(pessoaController);
    }

    @Test
    public void test() {
        assert(true);
    }
}
