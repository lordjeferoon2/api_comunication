package com.hacom.apicomunication.service;

import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.springframework.stereotype.Service;

import com.hacom.apicomunication.entity.Alert;
import com.hacom.apicomunication.entity.Area;
import com.hacom.apicomunication.entity.EventCode;
import com.hacom.apicomunication.entity.Geocode;
import com.hacom.apicomunication.entity.Info;
import com.hacom.apicomunication.entity.Parameter;
import com.hacom.apicomunication.entity.Resource;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class XmlCapToJsonCap {
	
	public Alert parseXmlToAlert(String xml) throws XMLStreamException, JsonProcessingException {
		XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xml));

        Alert alert = new Alert();
        Info info = new Info();
        EventCode eventCode = new EventCode();
        Parameter parameter = new Parameter();
        Resource resource = new Resource();
        Area area = new Area();
        Geocode geocode = new Geocode();

        List<Info> infoList = new ArrayList<>();
        List<EventCode> eventCodes = new ArrayList<>();
        List<Parameter> parameters = new ArrayList<>();
        List<Resource> resources = new ArrayList<>();
        List<Area> areas = new ArrayList<>();
        List<Geocode> geocodes = new ArrayList<>();

        while (reader.hasNext()) {
            if (reader.isStartElement()) {
                String elementName = reader.getLocalName();
                reader.next();
                String text = reader.getText();
                String parent = "";
                System.out.println(elementName);

                switch (elementName) {
                    case "identifier":
                        alert.setIdentifier(text);
                        parent = "alert";
                        break;
                    case "sender":
                        alert.setSender(text);
                        parent = "alert";
                        break;
                    case "sent":
                        alert.setSent(text);
                        parent = "alert";
                        break;
                    case "status":
                        alert.setStatus(text);
                        parent = "alert";
                        break;
                    case "msgType":
                        alert.setMsgType(text);
                        parent = "alert";
                        break;
                    case "source":
                        alert.setSource(text);
                        parent = "alert";
                        break;
                    case "scope":
                        alert.setScope(text);
                        parent = "alert";
                        break;
                    case "restriction":
                        alert.setRestriction(text);
                        parent = "alert";
                        break;
                    case "addresses":
                        alert.setAddresses(text);
                        parent = "alert";
                        break;
                    case "code":
                        alert.setCode(Arrays.asList(text.split(", ")));
                        parent = "alert";
                        break;
                    case "note":
                        alert.setNote(text);
                        parent = "alert";
                        break;
                    case "references":
                        alert.setReferences(text);
                        parent = "alert";
                        break;
                    case "incidents":
                        alert.setIncidents(text);
                        parent = "alert";
                        break;
                    case "info":
                        info = new Info();
                        parent = "alert";
                        break;
                    case "language":
                        info.setLanguage(text);
                        parent = "info";
                        break;
                    case "category":
                        info.setCategory(Arrays.asList(text));
                        parent = "info";
                        break;
                    case "event":
                        info.setEvent(text);
                        parent = "info";
                        break;
                    case "responseType":
                        info.setResponseType(Arrays.asList(text));
                        parent = "info";
                        break;
                    case "urgency":
                        info.setUrgency(text);
                        parent = "info";
                        break;
                    case "severity":
                        info.setSeverity(text);
                        break;
                    case "certainty":
                        info.setCertainty(text);
                        parent = "info";
                        break;
                    case "audience":
                        info.setAudience(text);
                        parent = "info";
                        break;
                    case "effective":
                        info.setEffective(text);
                        parent = "info";
                        break;
                    case "onset":
                        info.setOnset(text);
                        parent = "info";
                        break;
                    case "expires":
                        info.setExpires(text);
                        parent = "info";
                        break;
                    case "senderName":
                        info.setSenderName(text);
                        parent = "info";
                        break;
                    case "headline":
                        info.setHeadline(text);
                        parent = "info";
                        break;
                    case "description":
                        info.setDescription(text);
                        parent = "info";
                        break;
                    case "instruction":
                        info.setInstruction(text);
                        parent = "info";
                        break;
                    case "web":
                        info.setWeb(text);
                        parent = "info";
                        break;
                    case "contact":
                        info.setContact(text);
                        parent = "info";
                        break;
                    case "eventCode":
                    	eventCode = new EventCode();
                    	parent = "eventCode";
                        break;
                    case "parameter":
                    	parameter = new Parameter();
                    	parent = "parameter";
                        break;
                    case "geocode":
                    	geocode = new Geocode();
                    	parent = "geocode";
                        break;
                    case "valueName":
                        //String parentElement = reader.getLocalName();
                        //reader.next();
                        //String valueText = reader.getText();
                        
                        switch (parent) {
                            case "eventCode":
                                eventCode.setValueName(text);
                                parent = "eventCode";
                                break;
                            case "parameter":
                                parameter.setValueName(text);
                                parent = "parameter";
                                break;
                            case "geocode":
                                geocode.setValueName(text);
                                parent = "geocode";
                                break;
                        }
                        break;
                    case "value":
                        //String parentElement2 = reader.getLocalName();
                        //reader.next();
                        //String valueText2 = reader.getText();
                        
                        switch (parent) {
                            case "eventCode":
                                eventCode.setValue(text);
                                eventCodes.add(eventCode);
                                info.setEventCode(eventCodes);
                                parent = "eventCode";
                                break;
                            case "parameter":
                                parameter.setValue(text);
                                parameters.add(parameter);
                                info.setParameter(parameters);
                                parent = "parameter";
                                break;
                            case "geocode":
                                geocode.setValue(text);
                                geocodes.add(geocode);
                                area.setGeocode(geocodes);
                                parent = "geocode";
                                break;
                        }
                        break;
                    case "resource":
                        resource = new Resource();
                        parent = "resource";
                        break;
                    case "resourceDesc":
                        resource.setResourceDesc(text);
                        parent = "resource";
                        break;
                    case "mimeType":
                        resource.setMimeType(text);
                        parent = "resource";
                        break;
                    case "size":
                        resource.setSize(new BigInteger(text));
                        parent = "resource";
                        break;
                    case "uri":
                        resource.setUri(text);
                        parent = "resource";
                        break;
                    case "derefUri":
                        resource.setDerefUri(text);
                        parent = "resource";
                        break;
                    case "digest":
                        resource.setDigest(text);
                        parent = "resource";
                        break;
                    case "area":
                        area = new Area();
                        parent = "area";
                        break;
                    case "areaDesc":
                        area.setAreaDesc(text);
                        parent = "area";
                        break;
                    case "polygon":
                        area.setPolygon(Arrays.asList(text.split(", ")));
                        parent = "area";
                        break;
                    case "circle":
                        area.setCircle(Arrays.asList(text.split(", ")));
                        parent = "area";
                        break;
                    case "altitude":
                        area.setAltitude(new BigDecimal(text));
                        parent = "area";
                        break;
                    case "ceiling":
                        area.setCeiling(new BigDecimal(text));
                        parent = "area";
                        break;
                }
            }
            if (reader.isEndElement()) {
                String closedElement = reader.getLocalName();
                //elementStack.pop();

                if (closedElement.equals("resource")) {
                    resources.add(resource);
                    resource = new Resource();
                    info.setResource(resources);
                } 
                if (closedElement.equals("area")) {
                    areas.add(area);
                    area.setGeocode(geocodes);
                    area = new Area();
                    geocodes = new ArrayList<>();
                }
                if (closedElement.equals("parameter")) {
                    parameters.add(parameter);
                    parameter = new Parameter();
                }
                if (closedElement.equals("eventCode")) {
                    eventCodes.add(eventCode);
                    eventCode = new EventCode();
                }
                if (closedElement.equals("geocode")) {
                    geocodes.add(geocode);
                    geocode = new Geocode();
                }
                if (closedElement.equals("info")) {
                	infoList.add(info);
                    
                    
                    info.setEventCode(eventCodes);
                    info.setParameter(parameters);
                    info.setResource(resources);
                    info.setArea(areas);
                    
                    alert.setInfo(infoList);
                    info = new Info();
                    
                    eventCodes = new ArrayList<>();
                    parameters = new ArrayList<>();
                    resources = new ArrayList<>();
                    areas = new ArrayList<>();
                }
            }
            reader.next();
        }

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(alert);
        System.out.println(jsonString);
        return alert;
    }
}
