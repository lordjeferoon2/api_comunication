package com.hacom.apicomunication.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(Include.NON_EMPTY)
public class CBEM_CBS_Geotargeting_Info {

    protected String cbem_geocode_type;

    protected List<String> cbem_geocode;

    @JacksonXmlProperty(localName = "cbem_polygon")
    private String cbem_polygon;

    @JacksonXmlProperty(localName = "cbem_circle")
    protected String cbem_circle;

    protected List<String> cbem_gnis;

	public String getCbem_geocode_type() {
		return cbem_geocode_type;
	}

	public void setCbem_geocode_type(String cbem_geocode_type) {
		this.cbem_geocode_type = cbem_geocode_type;
	}

	public List<String> getCbem_geocode() {
		return cbem_geocode;
	}

	public void setCbem_geocode(List<String> cbem_geocode) {
		this.cbem_geocode = cbem_geocode;
	}

	public String getCbem_polygon() {
		return cbem_polygon;
	}

	public void setCbem_polygon(List<String> polygonList) {
        if (polygonList != null && !polygonList.isEmpty()) {
            this.cbem_polygon = String.join(", ", polygonList);
        }
    }

	public String getCbem_circle() {
		return cbem_circle;
	}
	
	public void setCbem_circle(List<String> cbem_circle) {
        if (cbem_circle != null && !cbem_circle.isEmpty()) {
            this.cbem_polygon = String.join(", ", cbem_circle);
        }
    }

	public List<String> getCbem_gnis() {
		return cbem_gnis;
	}

	public void setCbem_gnis(List<String> cbem_gnis) {
		this.cbem_gnis = cbem_gnis;
	}
	
}
