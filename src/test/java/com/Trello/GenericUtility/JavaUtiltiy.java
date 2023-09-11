package com.Trello.GenericUtility;

import java.time.LocalDateTime;

public class JavaUtiltiy {

	public String timestame() {
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		return timestamp;
	}
}
