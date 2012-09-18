package net.unit8.sastruts.easyapi.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@SuppressWarnings("serial")
@XStreamAlias("error")
public class ErrorDto implements Serializable {
	private String code;
	private String message;

	public ErrorDto(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
