package com.hacom.apicomunication.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class CBEM_CBS_Broadcast_Text {
	
    protected String cbem_broadcast_text;

    protected String cbem_network;

	public String getCbem_broadcast_text() {
		return cbem_broadcast_text;
	}

	public void setCbem_broadcast_text(String cbem_broadcast_text) {
		this.cbem_broadcast_text = cbem_broadcast_text;
	}

	public String getCbem_network() {
		return cbem_network;
	}

	public void setCbem_network(String cbem_network) {
		this.cbem_network = cbem_network;
	}
	
}
