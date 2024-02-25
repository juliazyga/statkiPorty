
package pl.poznan.ue.uslugaprojekt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.poznan.ue.uslugaprojekt package. 
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

    private final static QName _ZarejestrujStatek_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "zarejestrujStatek");
    private final static QName _PobierzPortWgNazwy_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "pobierzPortWgNazwy");
    private final static QName _PobierzStatekWgMmsiResponse_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "pobierzStatekWgMmsiResponse");
    private final static QName _ZarejestrujPortResponse_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "zarejestrujPortResponse");
    private final static QName _ZarejestrujStatekResponse_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "zarejestrujStatekResponse");
    private final static QName _ZarejestrujPort_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "zarejestrujPort");
    private final static QName _PobierzPortWgNazwyResponse_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "pobierzPortWgNazwyResponse");
    private final static QName _PobierzStatekWgMmsi_QNAME = new QName("http://uslugaprojekt.ue.poznan.pl/", "pobierzStatekWgMmsi");
    private final static QName _ZarejestrujStatekPicture_QNAME = new QName("", "picture");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.poznan.ue.uslugaprojekt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PobierzStatekWgMmsiResponse }
     * 
     */
    public PobierzStatekWgMmsiResponse createPobierzStatekWgMmsiResponse() {
        return new PobierzStatekWgMmsiResponse();
    }

    /**
     * Create an instance of {@link ZarejestrujPortResponse }
     * 
     */
    public ZarejestrujPortResponse createZarejestrujPortResponse() {
        return new ZarejestrujPortResponse();
    }

    /**
     * Create an instance of {@link ZarejestrujStatekResponse }
     * 
     */
    public ZarejestrujStatekResponse createZarejestrujStatekResponse() {
        return new ZarejestrujStatekResponse();
    }

    /**
     * Create an instance of {@link PobierzPortWgNazwyResponse }
     * 
     */
    public PobierzPortWgNazwyResponse createPobierzPortWgNazwyResponse() {
        return new PobierzPortWgNazwyResponse();
    }

    /**
     * Create an instance of {@link PobierzStatekWgMmsi }
     * 
     */
    public PobierzStatekWgMmsi createPobierzStatekWgMmsi() {
        return new PobierzStatekWgMmsi();
    }

    /**
     * Create an instance of {@link ZarejestrujPort }
     * 
     */
    public ZarejestrujPort createZarejestrujPort() {
        return new ZarejestrujPort();
    }

    /**
     * Create an instance of {@link ZarejestrujStatek }
     * 
     */
    public ZarejestrujStatek createZarejestrujStatek() {
        return new ZarejestrujStatek();
    }

    /**
     * Create an instance of {@link PobierzPortWgNazwy }
     * 
     */
    public PobierzPortWgNazwy createPobierzPortWgNazwy() {
        return new PobierzPortWgNazwy();
    }

    /**
     * Create an instance of {@link Port }
     * 
     */
    public Port createPort() {
        return new Port();
    }

    /**
     * Create an instance of {@link Statek }
     * 
     */
    public Statek createStatek() {
        return new Statek();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZarejestrujStatek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "zarejestrujStatek")
    public JAXBElement<ZarejestrujStatek> createZarejestrujStatek(ZarejestrujStatek value) {
        return new JAXBElement<ZarejestrujStatek>(_ZarejestrujStatek_QNAME, ZarejestrujStatek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzPortWgNazwy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "pobierzPortWgNazwy")
    public JAXBElement<PobierzPortWgNazwy> createPobierzPortWgNazwy(PobierzPortWgNazwy value) {
        return new JAXBElement<PobierzPortWgNazwy>(_PobierzPortWgNazwy_QNAME, PobierzPortWgNazwy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzStatekWgMmsiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "pobierzStatekWgMmsiResponse")
    public JAXBElement<PobierzStatekWgMmsiResponse> createPobierzStatekWgMmsiResponse(PobierzStatekWgMmsiResponse value) {
        return new JAXBElement<PobierzStatekWgMmsiResponse>(_PobierzStatekWgMmsiResponse_QNAME, PobierzStatekWgMmsiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZarejestrujPortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "zarejestrujPortResponse")
    public JAXBElement<ZarejestrujPortResponse> createZarejestrujPortResponse(ZarejestrujPortResponse value) {
        return new JAXBElement<ZarejestrujPortResponse>(_ZarejestrujPortResponse_QNAME, ZarejestrujPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZarejestrujStatekResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "zarejestrujStatekResponse")
    public JAXBElement<ZarejestrujStatekResponse> createZarejestrujStatekResponse(ZarejestrujStatekResponse value) {
        return new JAXBElement<ZarejestrujStatekResponse>(_ZarejestrujStatekResponse_QNAME, ZarejestrujStatekResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZarejestrujPort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "zarejestrujPort")
    public JAXBElement<ZarejestrujPort> createZarejestrujPort(ZarejestrujPort value) {
        return new JAXBElement<ZarejestrujPort>(_ZarejestrujPort_QNAME, ZarejestrujPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzPortWgNazwyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "pobierzPortWgNazwyResponse")
    public JAXBElement<PobierzPortWgNazwyResponse> createPobierzPortWgNazwyResponse(PobierzPortWgNazwyResponse value) {
        return new JAXBElement<PobierzPortWgNazwyResponse>(_PobierzPortWgNazwyResponse_QNAME, PobierzPortWgNazwyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzStatekWgMmsi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uslugaprojekt.ue.poznan.pl/", name = "pobierzStatekWgMmsi")
    public JAXBElement<PobierzStatekWgMmsi> createPobierzStatekWgMmsi(PobierzStatekWgMmsi value) {
        return new JAXBElement<PobierzStatekWgMmsi>(_PobierzStatekWgMmsi_QNAME, PobierzStatekWgMmsi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "picture", scope = ZarejestrujStatek.class)
    public JAXBElement<byte[]> createZarejestrujStatekPicture(byte[] value) {
        return new JAXBElement<byte[]>(_ZarejestrujStatekPicture_QNAME, byte[].class, ZarejestrujStatek.class, ((byte[]) value));
    }

}
