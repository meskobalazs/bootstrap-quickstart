package hu.net54.common.design;

import static hu.net54.common.design.util.Pages.INDEX;
import static hu.net54.common.design.util.Pages.REDIRECT;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
class Index {

	private static final Logger logger = LogManager.getLogger(Index.class);

	/**
	 * Simán rendereljük le az 'index' oldalt
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	private String index() {
		logger.debug("Showcase rendered.");
		return INDEX;
	}

	/**
	 * Ha nem ad meg a felhasználó útvonalat, csak a '/'-t, akkor
	 * átirányítjuk az 'index' felé.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String root() {
		return REDIRECT + INDEX;
	}

}
