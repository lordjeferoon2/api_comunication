package com.hacom.apicomunication.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(Include.NON_EMPTY)
public class CBEM_CBS_Message_Info {
	
    protected String cbem_data_coding_scheme;

    protected String cbem_language;

    protected int cbem_repetition_period;

    protected int cbem_number_of_broadcast_requested;

    protected String cbem_display_mode;

    protected String cbem_start_data_time;

    @JacksonXmlProperty(localName = "cbem_cbs_geotargeting_info")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<CBEM_CBS_Geotargeting_Info> cbem_cbs_geotargeting_info;

    @JacksonXmlProperty(localName = "cbem_cbs_broadcast_text")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<CBEM_CBS_Broadcast_Text> cbem_cbs_broadcast_text;

	public String getCbem_data_coding_scheme() {
		return cbem_data_coding_scheme;
	}

	public void setCbem_data_coding_scheme(String cbem_data_coding_scheme) {
		this.cbem_data_coding_scheme = cbem_data_coding_scheme;
	}

	public String getCbem_language() {
		return cbem_language;
	}

	public void setCbem_language(String cbem_language) {
		this.cbem_language = cbem_language;
	}

	public int getCbem_repetition_period() {
		return cbem_repetition_period;
	}

	public void setCbem_repetition_period(int cbem_repetition_period) {
		this.cbem_repetition_period = cbem_repetition_period;
	}

	public int getCbem_number_broadcast_requested() {
		return cbem_number_of_broadcast_requested;
	}

	public void setCbem_number_broadcast_requested(int cbem_number_broadcast_requested) {
		this.cbem_number_of_broadcast_requested = cbem_number_broadcast_requested;
	}

	public String getCbem_display_mode() {
		return cbem_display_mode;
	}

	public void setCbem_display_mode(String cbem_display_mode) {
		this.cbem_display_mode = cbem_display_mode;
	}

	public String getCbem_start_data_time() {
		return cbem_start_data_time;
	}

	public void setCbem_start_data_time(String cbem_start_data_time) {
		this.cbem_start_data_time = cbem_start_data_time;
	}

	public List<CBEM_CBS_Geotargeting_Info> getCbem_cbs_geotargeting_info() {
		return cbem_cbs_geotargeting_info;
	}

	public void setCbem_cbs_geotargeting_info(List<CBEM_CBS_Geotargeting_Info> cbem_cbs_geotargeting_info) {
		this.cbem_cbs_geotargeting_info = cbem_cbs_geotargeting_info;
	}

	public List<CBEM_CBS_Broadcast_Text> getCbem_cbs_broadcast_text() {
		return cbem_cbs_broadcast_text;
	}

	public void setCbem_cbs_broadcast_text(List<CBEM_CBS_Broadcast_Text> cbem_cbs_broadcast_text) {
		this.cbem_cbs_broadcast_text = cbem_cbs_broadcast_text;
	}
	
}
