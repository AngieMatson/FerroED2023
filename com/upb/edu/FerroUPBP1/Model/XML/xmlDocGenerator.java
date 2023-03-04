package com.upb.edu.FerroUPBP1.Model.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class xmlDocGenerator {
    private Document document;
    public xmlDocGenerator() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        document = builder.newDocument();
    }

    public void generarDocument(){
        Element element = document.createElement("Personas");
        document.appendChild(element);

        Element nombres = document.createElement("Nombres");
        document.appendChild(nombres);

    }

    public void generarXml() throws TransformerException, IOException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();

        Source source = new DOMSource(document);
        File file = new File("FerroDatabe.xml");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        Result result = new StreamResult(pw);

        transformer.transform(source,result);


    }

}
