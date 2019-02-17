
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gleif.data.schema.pni._2016 package. 
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

    private final static QName _PNIData_QNAME = new QName("http://www.gleif.org/data/schema/pni/2016", "PNIData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gleif.data.schema.pni._2016
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PNIDataType }
     * 
     */
    public PNIDataType createPNIDataType() {
        return new PNIDataType();
    }

    /**
     * Create an instance of {@link PNIHeaderType }
     * 
     */
    public PNIHeaderType createPNIHeaderType() {
        return new PNIHeaderType();
    }

    /**
     * Create an instance of {@link HeaderNextVersionType }
     * 
     */
    public HeaderNextVersionType createHeaderNextVersionType() {
        return new HeaderNextVersionType();
    }

    /**
     * Create an instance of {@link PNIRecordsType }
     * 
     */
    public PNIRecordsType createPNIRecordsType() {
        return new PNIRecordsType();
    }

    /**
     * Create an instance of {@link PNIRecordType }
     * 
     */
    public PNIRecordType createPNIRecordType() {
        return new PNIRecordType();
    }

    /**
     * Create an instance of {@link PNIRecordNextVersionType }
     * 
     */
    public PNIRecordNextVersionType createPNIRecordNextVersionType() {
        return new PNIRecordNextVersionType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link EntityNextVersionType }
     * 
     */
    public EntityNextVersionType createEntityNextVersionType() {
        return new EntityNextVersionType();
    }

    /**
     * Create an instance of {@link RegistrationType }
     * 
     */
    public RegistrationType createRegistrationType() {
        return new RegistrationType();
    }

    /**
     * Create an instance of {@link RegistrationNextVersionType }
     * 
     */
    public RegistrationNextVersionType createRegistrationNextVersionType() {
        return new RegistrationNextVersionType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AssociatedEntityType }
     * 
     */
    public AssociatedEntityType createAssociatedEntityType() {
        return new AssociatedEntityType();
    }

    /**
     * Create an instance of {@link BusinessRegisterEntityIDType }
     * 
     */
    public BusinessRegisterEntityIDType createBusinessRegisterEntityIDType() {
        return new BusinessRegisterEntityIDType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link OtherAddressType }
     * 
     */
    public OtherAddressType createOtherAddressType() {
        return new OtherAddressType();
    }

    /**
     * Create an instance of {@link OtherAddressesType }
     * 
     */
    public OtherAddressesType createOtherAddressesType() {
        return new OtherAddressesType();
    }

    /**
     * Create an instance of {@link OtherEntityNamesType }
     * 
     */
    public OtherEntityNamesType createOtherEntityNamesType() {
        return new OtherEntityNamesType();
    }

    /**
     * Create an instance of {@link OtherEntityNameType }
     * 
     */
    public OtherEntityNameType createOtherEntityNameType() {
        return new OtherEntityNameType();
    }

    /**
     * Create an instance of {@link SuccessorEntityType }
     * 
     */
    public SuccessorEntityType createSuccessorEntityType() {
        return new SuccessorEntityType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNIDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PNIDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gleif.org/data/schema/pni/2016", name = "PNIData")
    public JAXBElement<PNIDataType> createPNIData(PNIDataType value) {
        return new JAXBElement<PNIDataType>(_PNIData_QNAME, PNIDataType.class, null, value);
    }

}
