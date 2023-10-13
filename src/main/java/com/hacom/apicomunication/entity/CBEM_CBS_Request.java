package com.hacom.apicomunication.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(Include.NON_EMPTY)
public class CBEM_CBS_Request {

    private String cbem_sender_id;
	
    private String cbem_message_id;

    private String cbem_message_type;

    private String cbem_referenced_message_number;

    private String cbem_message_number;

    private String cbem_protocol_version;

    private List<String> cbem_operator_info;

    private List<String> cbem_response_code;

    private List<String> cbem_response_description;

    @JacksonXmlProperty(localName = "cbem_info")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<CBEM_CBS_Message_Info> cbem_info;

	public String getCbem_sender_id() {
		return cbem_sender_id;
	}

	public void setCbem_sender_id(String cbem_sender_id) {
		this.cbem_sender_id = cbem_sender_id;
	}

	public String getCbem_message_id() {
		return cbem_message_id;
	}

	public void setCbem_message_id(String cbem_message_id) {
		this.cbem_message_id = cbem_message_id;
	}

	public String getCbem_message_type() {
		return cbem_message_type;
	}

	public void setCbem_message_type(String cbem_message_type) {
		this.cbem_message_type = cbem_message_type;
	}

	public String getCbem_referenced_message_number() {
		return cbem_referenced_message_number;
	}

	public void setCbem_referenced_message_number(String cbem_referenced_message_number) {
		this.cbem_referenced_message_number = cbem_referenced_message_number;
	}

	public String getCbem_message_number() {
		return cbem_message_number;
	}

	public void setCbem_message_number(String cbem_message_number) {
		this.cbem_message_number = cbem_message_number;
	}

	public String getCbem_protocol_version() {
		return cbem_protocol_version;
	}

	public void setCbem_protocol_version(String cbem_protocol_version) {
		this.cbem_protocol_version = cbem_protocol_version;
	}

	public List<String> getCbem_operator_info() {
		return cbem_operator_info;
	}

	public void setCbem_operator_info(List<String> cbem_operator_info) {
		this.cbem_operator_info = cbem_operator_info;
	}

	public List<String> getCbem_response_code() {
		return cbem_response_code;
	}

	public void setCbem_response_code(List<String> cbem_response_code) {
		this.cbem_response_code = cbem_response_code;
	}

	public List<String> getCbem_response_description() {
		return cbem_response_description;
	}

	public void setCbem_response_description(List<String> cbem_response_description) {
		this.cbem_response_description = cbem_response_description;
	}

	public List<CBEM_CBS_Message_Info> getCbem_info() {
		return cbem_info;
	}

	public void setCbem_info(List<CBEM_CBS_Message_Info> cbem_info) {
		this.cbem_info = cbem_info;
	}

}
