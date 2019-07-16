package ping;

import java.util.UUID;

public class PingEntity {
	private static final String REPLY_FORMAT = "Hi, %s.";
	
	private final String uuid = UUID.randomUUID().toString();
	private String reply;
	
	public PingEntity(String aReply) {
		reply = String.format(REPLY_FORMAT, aReply);
	}

	public String getUuid() {
		return uuid;
	}

	public String getReply() {
		return reply;
	}
}
