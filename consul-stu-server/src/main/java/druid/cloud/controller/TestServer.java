package druid.cloud.controller;


import druid.cloud.project1.TestApiInterface;
import druid.cloud.project1.request.TestRequest1;
import druid.cloud.project1.response.TestResponse1;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestServer implements TestApiInterface {

    public TestResponse1 test1( @RequestBody TestRequest1 testRequest1 ) {

        System.out.println("进来了服务1");
        TestResponse1 testResponse1 = TestResponse1.builder().nameRes("服务1").build();
        System.out.println(testResponse1);
        return testResponse1;
    }
}
