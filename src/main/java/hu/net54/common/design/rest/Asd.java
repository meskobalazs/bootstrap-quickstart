package hu.net54.common.design.rest;

/*import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;*/

//@RestController
//@RequestMapping("/service")
public class Asd {

	//@RequestMapping(value = "asd/{name}", method = GET)
	public String echoService(/*@PathVariable*/ String name) {
		return name;
	}

	//@RequestMapping(value = "json", method = POST, consumes = "application/json")
	public /*@ResponseBody*/ MyModel jsonService(/*@RequestBody*/ MyModel myModel) {
		System.out.println(myModel.getStr());
		myModel.setStr("kutyafüle");
		return myModel;
	}

	//@RequestMapping(value = "getjson", method = GET)
	public /*@ResponseBody*/ MyModel jsonGetService() {
		MyModel model = new MyModel();
		model.setStr("kutyafüle");
		return model;
	}

}