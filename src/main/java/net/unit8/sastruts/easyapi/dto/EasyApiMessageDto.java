package net.unit8.sastruts.easyapi.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EasyApiMessageDto implements Serializable{
	public HeaderDto header;
	public Object body;
}