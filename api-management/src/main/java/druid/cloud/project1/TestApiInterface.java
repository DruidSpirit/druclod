package druid.cloud.project1;

import druid.cloud.constant.ServiceNameConstant;
import druid.cloud.project1.request.TestRequest1;
import druid.cloud.project1.response.TestResponse1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(ServiceNameConstant.test1ServiceName)
public interface TestApiInterface {

    @PostMapping("test2")
    TestResponse1 test1 (TestRequest1 testRequest1 );
}
