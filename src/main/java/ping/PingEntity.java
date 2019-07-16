package ping;

import java.util.UUID;

public class PingEntity {
	private final String uuid = UUID.randomUUID().toString();
	private String reply;
	
	public PingEntity(String aReply) {
		reply = aReply;
	}

	public String getUuid() {
		return uuid;
	}

	public String getReply() {
		return reply;
	}
}
