package druid.cloud.controller;

import druid.cloud.project1.TestApiInterface;
import druid.cloud.project1.request.TestRequest1;
import druid.cloud.project1.response.TestResponse1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RequiredArgsConstructor
@RestController
public class Testclient {

    private final TestApiInterface testApiInterface;

    @GetMapping("clientTest1")
   public TestResponse1 test1(){

        TestRequest1 build = TestRequest1.builder().nameReq("测试name").testReq("测试test").build();
        return testApiInterface.test1( build );
   }
}
