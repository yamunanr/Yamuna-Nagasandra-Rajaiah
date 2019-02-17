
package com.inmemory.gleifparser.model.level2_rex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inmemory.gleifparser.model.level1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReportingExceptionData_QNAME = new QName("http://www.gleif.org/data/schema/repex/2016", "ReportingExceptionData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inmemory.gleifparser.model.level1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportingExceptionDataType }
     * 
     */
    public ReportingExceptionDataType createReportingExceptionDataType() {
        return new ReportingExceptionDataType();
    }

    /**
     * Create an instance of {@link ExceptionHeaderType }
     * 
     */
    public ExceptionHeaderType createExceptionHeaderType() {
        return new ExceptionHeaderType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link ReportingExceptionsType }
     * 
     */
    public ReportingExceptionsType createReportingExceptionsType() {
        return new ReportingExceptionsType();
    }

    /**
     * Create an instance of {@link ReportingExceptionsContainerNextVersionType }
     * 
     */
    public ReportingExceptionsContainerNextVersionType createReportingExceptionsContainerNextVersionType() {
        return new ReportingExceptionsContainerNextVersionType();
    }

    /**
     * Create an instance of {@link ReportingExceptionNextVersionType }
     * 
     */
    public ReportingExceptionNextVersionType createReportingExceptionNextVersionType() {
        return new ReportingExceptionNextVersionType();
    }

    /**
     * Create an instance of {@link HeaderNextVersionType }
     * 
     */
    public HeaderNextVersionType createHeaderNextVersionType() {
        return new HeaderNextVersionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportingExceptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportingExceptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gleif.org/data/schema/repex/2016", name = "ReportingExceptionData")
    public JAXBElement<ReportingExceptionDataType> createReportingExceptionData(ReportingExceptionDataType value) {
        return new JAXBElement<ReportingExceptionDataType>(_ReportingExceptionData_QNAME, ReportingExceptionDataType.class, null, value);
    }

}
