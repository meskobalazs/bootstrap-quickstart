package hu.net54.common.design.websocket;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class DemoMessageDecoder implements Decoder.Text<DemoMessage> {

	@Override
	public void init(EndpointConfig config) {
		// nope
	}

	@Override
	public void destroy() {
		// nope
	}

	@Override
	public DemoMessage decode(String s) throws DecodeException {
		return DemoMessage.valueOf(s);
	}

	@Override
	public boolean willDecode(String s) {
		return s != null;
	}

}
