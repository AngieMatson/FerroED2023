package com.upb.edu.FerroUPBP1.Model.XML;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class xmlDocStructure {

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException {
        xmlDocGenerator xmlDocGenerator = new xmlDocGenerator();
        xmlDocGenerator.generarDocument();
        xmlDocGenerator.generarXml();




    }



}
