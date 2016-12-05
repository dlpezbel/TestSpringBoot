package poc.boot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import poc.boot.dto.Order;

@RestController
public class TestRestController {

    @RequestMapping(value = "/test/{orderId}", method = RequestMethod.GET, produces = "application/json")
    public String getOrder(@PathVariable("orderId") Integer orderId) {
    	System.out.println("get orderId: " + orderId);
    	
    	Order o = new Order();
    	o.setId(orderId);
    	o.setName("test");
        return "index";
    }

}