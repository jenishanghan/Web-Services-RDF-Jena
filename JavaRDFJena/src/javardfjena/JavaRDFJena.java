/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javardfjena;

import org.apache.jena.datatypes.xsd.*;
import org.apache.jena.rdf.model.*;
import java.io.*;
/**
 *
 * @author Jenish Anghan
 */
public class JavaRDFJena {

    /**
     * @param args the command line arguments
     */
    
    static private String nameSpace = "http://example.org/test/#";
    public static void main(String[] args) {
    
        Model model = ModelFactory.createDefaultModel();

        Resource subject = model.createResource(nameSpace + "MyInfo");
        Property propertyName = model.createProperty(nameSpace + "MyName");
        Property propertyStudentOf = model.createProperty(nameSpace + "StudentOf");
        Property propertyRegNo = model.createProperty(nameSpace + "RegNo");
        Property propertyCity = model.createProperty(nameSpace + "City");
        Property propertyState = model.createProperty(nameSpace + "State");
        
        subject.addProperty(propertyState, " Gujarat ",XSDDatatype.XSDstring);
        subject.addProperty(propertyCity, " Surat ",XSDDatatype.XSDstring);
        subject.addProperty(propertyStudentOf, " VIT ",XSDDatatype.XSDstring);
        subject.addProperty(propertyRegNo, " 16MCS0050 ",XSDDatatype.XSDstring);
        subject.addProperty(propertyName, " Is Jainishkumar Anghan",XSDDatatype.XSDstring);
       
        model.write(System.out);
     }
    
}
