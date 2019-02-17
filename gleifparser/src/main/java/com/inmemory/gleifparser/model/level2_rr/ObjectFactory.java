
package com.inmemory.gleifparser.model.level2_rr;

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

    private final static QName _RelationshipData_QNAME = new QName("http://www.gleif.org/data/schema/rr/2016", "RelationshipData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inmemory.gleifparser.model.level1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RelationshipDataType }
     * 
     */
    public RelationshipDataType createRelationshipDataType() {
        return new RelationshipDataType();
    }

    /**
     * Create an instance of {@link RRHeaderType }
     * 
     */
    public RRHeaderType createRRHeaderType() {
        return new RRHeaderType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link RelationshipRecordsType }
     * 
     */
    public RelationshipRecordsType createRelationshipRecordsType() {
        return new RelationshipRecordsType();
    }

    /**
     * Create an instance of {@link RelationshipRecordType }
     * 
     */
    public RelationshipRecordType createRelationshipRecordType() {
        return new RelationshipRecordType();
    }

    /**
     * Create an instance of {@link RelationshipContainerType }
     * 
     */
    public RelationshipContainerType createRelationshipContainerType() {
        return new RelationshipContainerType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link RelationshipPeriodsType }
     * 
     */
    public RelationshipPeriodsType createRelationshipPeriodsType() {
        return new RelationshipPeriodsType();
    }

    /**
     * Create an instance of {@link RelationshipPeriodType }
     * 
     */
    public RelationshipPeriodType createRelationshipPeriodType() {
        return new RelationshipPeriodType();
    }

    /**
     * Create an instance of {@link RelationshipQualifiersType }
     * 
     */
    public RelationshipQualifiersType createRelationshipQualifiersType() {
        return new RelationshipQualifiersType();
    }

    /**
     * Create an instance of {@link RelationshipQualifierType }
     * 
     */
    public RelationshipQualifierType createRelationshipQualifierType() {
        return new RelationshipQualifierType();
    }

    /**
     * Create an instance of {@link RelationshipQuantifiersType }
     * 
     */
    public RelationshipQuantifiersType createRelationshipQuantifiersType() {
        return new RelationshipQuantifiersType();
    }

    /**
     * Create an instance of {@link RelationshipQuantifierType }
     * 
     */
    public RelationshipQuantifierType createRelationshipQuantifierType() {
        return new RelationshipQuantifierType();
    }

    /**
     * Create an instance of {@link RegistrationContainerType }
     * 
     */
    public RegistrationContainerType createRegistrationContainerType() {
        return new RegistrationContainerType();
    }

    /**
     * Create an instance of {@link HeaderNextVersionType }
     * 
     */
    public HeaderNextVersionType createHeaderNextVersionType() {
        return new HeaderNextVersionType();
    }

    /**
     * Create an instance of {@link RelationshipRecordNextVersionType }
     * 
     */
    public RelationshipRecordNextVersionType createRelationshipRecordNextVersionType() {
        return new RelationshipRecordNextVersionType();
    }

    /**
     * Create an instance of {@link RelationshipNextVersionType }
     * 
     */
    public RelationshipNextVersionType createRelationshipNextVersionType() {
        return new RelationshipNextVersionType();
    }

    /**
     * Create an instance of {@link RegistrationNextVersionType }
     * 
     */
    public RegistrationNextVersionType createRegistrationNextVersionType() {
        return new RegistrationNextVersionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelationshipDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gleif.org/data/schema/rr/2016", name = "RelationshipData")
    public JAXBElement<RelationshipDataType> createRelationshipData(RelationshipDataType value) {
        return new JAXBElement<RelationshipDataType>(_RelationshipData_QNAME, RelationshipDataType.class, null, value);
    }

}
