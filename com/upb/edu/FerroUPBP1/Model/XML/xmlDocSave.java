package com.upb.edu.FerroUPBP1.Model.XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class xmlDocSave {
    public static void main(String[] args) {

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            // Create a Doc d0
            Document documento = implementation.createDocument(null, "Ferro DataBase", null);
            documento.setXmlVersion("1.0");

            // Create a Element with tag
            Element Personas = documento.createElement("Personas");
            Element Persona = documento.createElement("persona");

            Element nombre = documento.createElement("Nombre");
            Text textNombre = documento.createTextNode("Marco");
            nombre.appendChild(textNombre); // add 4 element
            Persona.appendChild(nombre); // add 4 principal Element

            Element apellido = documento.createElement("Apellido");
            Text textApellido = documento.createTextNode("Prada");
            apellido.appendChild(textApellido);// add 4 element
            Persona.appendChild(apellido);// add 4 principal Element

            Element id = documento.createElement("ID");
            Text textId = documento.createTextNode("000455892");
            id.appendChild(textId);// add 4 element
            Persona.appendChild(id);// add 4 principal Element

            Element direccion = documento.createElement("Direccion");
            Text textDireccion = documento.createTextNode("Cra22#58-25");
            direccion.appendChild(textDireccion);// add 4 element
            Persona.appendChild(direccion);// add 4 principal Element

            // Add people to person
            Personas.appendChild(Persona);
            // Add root Personas
            documento.getDocumentElement().appendChild(Personas);

            Source source = new DOMSource(documento); // add Source to documento instance from DOMSource
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("FerroDB.xml")); // add file name

            // Create Transformer 2 create a XML file
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }

    }

}