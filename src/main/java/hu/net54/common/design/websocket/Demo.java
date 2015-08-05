package hu.net54.common.design.websocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@ServerEndpoint(value = "/demo", configurator = SessionConfigurator.class, decoders = DemoMessageDecoder.class)
public class Demo {

	private static final Logger log = LogManager.getLogger(Demo.class);

	@Autowired
	private DemoService demoService;

	@OnMessage
	public void handleMessage(Session session, DemoMessage message) {
		log.info("Message arrived: {}", message);
		try {
			session.getBasicRemote().sendText(demoService.getDemoString());
		} catch (IOException e) {
			log.error("IOException in WS", e);
		}
	}

}
