package hu.net54.common.design;

import static hu.net54.common.design.util.Pages.WIDGETS;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/widgets")
class Widgets {

	private static final transient Logger logger = LogManager.getLogger(Widgets.class);

	@RequestMapping(method = RequestMethod.GET)
	private String main() {
		logger.debug("Rendering widgets.");
		return WIDGETS;
	}

}
