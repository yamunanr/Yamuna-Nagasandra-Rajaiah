
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TransliteratedNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransliteratedNameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.gleif.org/data/schema/leidata/2016&gt;TransliteratedStringType"&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransliteratedNameType", propOrder = {
    "value"
})
@XmlSeeAlso({
    TransliteratedOtherEntityNameType.class
})
public class TransliteratedNameType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;style xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="text/css"&gt; .tg {border-collapse:collapse;border-spacing:0;} .tg&#13;
     *           td{font-family:Arial, sans-serif;font-size:14px;padding:10px&#13;
     *           5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;} .tg&#13;
     *           th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px&#13;
     *           5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;} .tg&#13;
     *           .tg-9hbo{font-weight:bold;vertical-align:top} .tg .tg-yw4l{vertical-align:top} &lt;/style&gt;
     * </pre>
     * 
     *         
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h1 xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Character Codes Allowed in ASCII Transliterated Names&lt;/h1&gt;
     * </pre>
     *  A
     *           
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TransliteratedOtherEntityName&lt;/code&gt;
     * </pre>
     *  instance of type
     *           
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PREFERRED_ASCII_TRANSLITERATED_LEGAL_NAME&lt;/code&gt;
     * </pre>
     *  or
     *           
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AUTO_ASCII_TRANSLITERATED_LEGAL_NAME&lt;/code&gt;
     * </pre>
     * , can only contain non-control characters
     *         drawn from the â€œinvariant subsetâ€\u009d of ISO 646. These characters are enumerated below. The
     *         â€œHex Valueâ€\u009d column indicates the code point value (expressed in hexadecimal) for each
     *         character in both ISOÂ 646 and ISOÂ 10646. 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;strong xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;This is enforced by the XML&#13;
     *           schema.&lt;/strong&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *         
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;table xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema" class="tg"&gt;&lt;tr&gt;&lt;th class="tg-9hbo"&gt;Graphic Symbol&lt;/th&gt;&lt;th class="tg-9hbo"&gt;Name&lt;/th&gt;&lt;th class="tg-9hbo"&gt;Hex Value&lt;/th&gt;&lt;th class="tg-9hbo"&gt;Graphic Symbol&lt;/th&gt;&lt;th class="tg-9hbo"&gt;Name&lt;/th&gt;&lt;th class="tg-9hbo"&gt;Hex Value&lt;/th&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;!&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Exclamation Mark&lt;/td&gt;&lt;td class="tg-yw4l"&gt;21&lt;/td&gt;&lt;td class="tg-yw4l"&gt;M&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter M&lt;/td&gt;&lt;td class="tg-yw4l"&gt;4D&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;"&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Quotation Mark&lt;/td&gt;&lt;td class="tg-yw4l"&gt;22&lt;/td&gt;&lt;td class="tg-yw4l"&gt;N&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter N&lt;/td&gt;&lt;td class="tg-yw4l"&gt;4E&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;%&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Percent Sign&lt;/td&gt;&lt;td class="tg-yw4l"&gt;25&lt;/td&gt;&lt;td class="tg-yw4l"&gt;O&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter O&lt;/td&gt;&lt;td class="tg-yw4l"&gt;4F&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;&amp;amp;&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Ampersand&lt;/td&gt;&lt;td class="tg-yw4l"&gt;26&lt;/td&gt;&lt;td class="tg-yw4l"&gt;P&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter P&lt;/td&gt;&lt;td class="tg-yw4l"&gt;50&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;'&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Apostrophe&lt;/td&gt;&lt;td class="tg-yw4l"&gt;27&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Q&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter Q&lt;/td&gt;&lt;td class="tg-yw4l"&gt;51&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;(&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Left Parenthesis&lt;/td&gt;&lt;td class="tg-yw4l"&gt;28&lt;/td&gt;&lt;td class="tg-yw4l"&gt;R&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter R&lt;/td&gt;&lt;td class="tg-yw4l"&gt;52&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;)&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Right Parenthesis&lt;/td&gt;&lt;td class="tg-yw4l"&gt;29&lt;/td&gt;&lt;td class="tg-yw4l"&gt;S&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter S&lt;/td&gt;&lt;td class="tg-yw4l"&gt;53&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;*&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Asterisk&lt;/td&gt;&lt;td class="tg-yw4l"&gt;2A&lt;/td&gt;&lt;td class="tg-yw4l"&gt;T&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter T&lt;/td&gt;&lt;td class="tg-yw4l"&gt;54&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;+&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Plus sign&lt;/td&gt;&lt;td class="tg-yw4l"&gt;2B&lt;/td&gt;&lt;td class="tg-yw4l"&gt;U&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter U&lt;/td&gt;&lt;td class="tg-yw4l"&gt;55&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;,&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Comma&lt;/td&gt;&lt;td class="tg-yw4l"&gt;2C&lt;/td&gt;&lt;td class="tg-yw4l"&gt;V&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter V&lt;/td&gt;&lt;td class="tg-yw4l"&gt;56&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;-&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Hyphen/ Minus&lt;/td&gt;&lt;td class="tg-yw4l"&gt;2D&lt;/td&gt;&lt;td class="tg-yw4l"&gt;W&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter W&lt;/td&gt;&lt;td class="tg-yw4l"&gt;57&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;.&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Full Stop&lt;/td&gt;&lt;td class="tg-yw4l"&gt;2E&lt;/td&gt;&lt;td class="tg-yw4l"&gt;X&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter X&lt;/td&gt;&lt;td class="tg-yw4l"&gt;58&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;/&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Solidus&lt;/td&gt;&lt;td class="tg-yw4l"&gt;2F&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Y&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter Y&lt;/td&gt;&lt;td class="tg-yw4l"&gt;59&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;0&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Zero&lt;/td&gt;&lt;td class="tg-yw4l"&gt;30&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Z&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter Z&lt;/td&gt;&lt;td class="tg-yw4l"&gt;5A&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;1&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit One&lt;/td&gt;&lt;td class="tg-yw4l"&gt;31&lt;/td&gt;&lt;td class="tg-yw4l"&gt;_&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Low Line&lt;/td&gt;&lt;td class="tg-yw4l"&gt;5F&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;2&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Two&lt;/td&gt;&lt;td class="tg-yw4l"&gt;32&lt;/td&gt;&lt;td class="tg-yw4l"&gt;a&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter a&lt;/td&gt;&lt;td class="tg-yw4l"&gt;61&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;3&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Three&lt;/td&gt;&lt;td class="tg-yw4l"&gt;33&lt;/td&gt;&lt;td class="tg-yw4l"&gt;b&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter b&lt;/td&gt;&lt;td class="tg-yw4l"&gt;62&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;4&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Four&lt;/td&gt;&lt;td class="tg-yw4l"&gt;34&lt;/td&gt;&lt;td class="tg-yw4l"&gt;c&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter c&lt;/td&gt;&lt;td class="tg-yw4l"&gt;63&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;5&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Five&lt;/td&gt;&lt;td class="tg-yw4l"&gt;35&lt;/td&gt;&lt;td class="tg-yw4l"&gt;d&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter d&lt;/td&gt;&lt;td class="tg-yw4l"&gt;64&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;6&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Six&lt;/td&gt;&lt;td class="tg-yw4l"&gt;36&lt;/td&gt;&lt;td class="tg-yw4l"&gt;e&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter e&lt;/td&gt;&lt;td class="tg-yw4l"&gt;65&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;7&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Seven&lt;/td&gt;&lt;td class="tg-yw4l"&gt;37&lt;/td&gt;&lt;td class="tg-yw4l"&gt;f&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter f&lt;/td&gt;&lt;td class="tg-yw4l"&gt;66&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;8&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Eight&lt;/td&gt;&lt;td class="tg-yw4l"&gt;38&lt;/td&gt;&lt;td class="tg-yw4l"&gt;g&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter g&lt;/td&gt;&lt;td class="tg-yw4l"&gt;67&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;9&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Digit Nine&lt;/td&gt;&lt;td class="tg-yw4l"&gt;39&lt;/td&gt;&lt;td class="tg-yw4l"&gt;h&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter h&lt;/td&gt;&lt;td class="tg-yw4l"&gt;68&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;:&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Colon&lt;/td&gt;&lt;td class="tg-yw4l"&gt;3A&lt;/td&gt;&lt;td class="tg-yw4l"&gt;i&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter i&lt;/td&gt;&lt;td class="tg-yw4l"&gt;69&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;;&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Semicolon&lt;/td&gt;&lt;td class="tg-yw4l"&gt;3B&lt;/td&gt;&lt;td class="tg-yw4l"&gt;j&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter j&lt;/td&gt;&lt;td class="tg-yw4l"&gt;6A&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;&amp;lt;&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Less-than Sign&lt;/td&gt;&lt;td class="tg-yw4l"&gt;3C&lt;/td&gt;&lt;td class="tg-yw4l"&gt;k&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter k&lt;/td&gt;&lt;td class="tg-yw4l"&gt;6B&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;=&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Equals Sign&lt;/td&gt;&lt;td class="tg-yw4l"&gt;3D&lt;/td&gt;&lt;td class="tg-yw4l"&gt;l&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter l&lt;/td&gt;&lt;td class="tg-yw4l"&gt;6C&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;&amp;gt;&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Greater-than Sign&lt;/td&gt;&lt;td class="tg-yw4l"&gt;3E&lt;/td&gt;&lt;td class="tg-yw4l"&gt;m&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter m&lt;/td&gt;&lt;td class="tg-yw4l"&gt;6D&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;?&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Question Mark&lt;/td&gt;&lt;td class="tg-yw4l"&gt;3F&lt;/td&gt;&lt;td class="tg-yw4l"&gt;n&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter n&lt;/td&gt;&lt;td class="tg-yw4l"&gt;6E&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;A&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter A&lt;/td&gt;&lt;td class="tg-yw4l"&gt;41&lt;/td&gt;&lt;td class="tg-yw4l"&gt;o&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter o&lt;/td&gt;&lt;td class="tg-yw4l"&gt;6F&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;B&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter B&lt;/td&gt;&lt;td class="tg-yw4l"&gt;42&lt;/td&gt;&lt;td class="tg-yw4l"&gt;p&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter p&lt;/td&gt;&lt;td class="tg-yw4l"&gt;70&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;C&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter C&lt;/td&gt;&lt;td class="tg-yw4l"&gt;43&lt;/td&gt;&lt;td class="tg-yw4l"&gt;q&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter q&lt;/td&gt;&lt;td class="tg-yw4l"&gt;71&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;D&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter D&lt;/td&gt;&lt;td class="tg-yw4l"&gt;44&lt;/td&gt;&lt;td class="tg-yw4l"&gt;r&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter r&lt;/td&gt;&lt;td class="tg-yw4l"&gt;72&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;E&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter E&lt;/td&gt;&lt;td class="tg-yw4l"&gt;45&lt;/td&gt;&lt;td class="tg-yw4l"&gt;s&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter s&lt;/td&gt;&lt;td class="tg-yw4l"&gt;73&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;F&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter F&lt;/td&gt;&lt;td class="tg-yw4l"&gt;46&lt;/td&gt;&lt;td class="tg-yw4l"&gt;t&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter t&lt;/td&gt;&lt;td class="tg-yw4l"&gt;74&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;G&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter G&lt;/td&gt;&lt;td class="tg-yw4l"&gt;47&lt;/td&gt;&lt;td class="tg-yw4l"&gt;u&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter u&lt;/td&gt;&lt;td class="tg-yw4l"&gt;75&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;H&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter H&lt;/td&gt;&lt;td class="tg-yw4l"&gt;48&lt;/td&gt;&lt;td class="tg-yw4l"&gt;v&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter v&lt;/td&gt;&lt;td class="tg-yw4l"&gt;76&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;I&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter I&lt;/td&gt;&lt;td class="tg-yw4l"&gt;49&lt;/td&gt;&lt;td class="tg-yw4l"&gt;w&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter w&lt;/td&gt;&lt;td class="tg-yw4l"&gt;77&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;J&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter J&lt;/td&gt;&lt;td class="tg-yw4l"&gt;4A&lt;/td&gt;&lt;td class="tg-yw4l"&gt;x&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter x&lt;/td&gt;&lt;td class="tg-yw4l"&gt;78&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;K&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter K&lt;/td&gt;&lt;td class="tg-yw4l"&gt;4B&lt;/td&gt;&lt;td class="tg-yw4l"&gt;y&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter y&lt;/td&gt;&lt;td class="tg-yw4l"&gt;79&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"&gt;L&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Capital Letter L&lt;/td&gt;&lt;td class="tg-yw4l"&gt;4C&lt;/td&gt;&lt;td class="tg-yw4l"&gt;z&lt;/td&gt;&lt;td class="tg-yw4l"&gt;Small Letter z&lt;/td&gt;&lt;td class="tg-yw4l"&gt;7A&lt;/td&gt;&#13;
     *           &lt;/tr&gt;&lt;tr&gt;&lt;td class="tg-yw4l"/&gt;&lt;td class="tg-yw4l"&gt;Space&lt;/td&gt;&lt;td class="tg-yw4l"&gt;20&lt;/td&gt;&lt;td class="tg-yw4l"/&gt;&lt;td class="tg-yw4l"/&gt;&lt;td class="tg-yw4l"/&gt;&#13;
     *           &lt;/tr&gt;&#13;
     *         &lt;/table&gt;
     * </pre>
     * 
     *       
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The language of this element's text content. An IETF Language Code
     *               conforming to the latest RFC from IETF BCP 47. Note that the first characters of an
     *               IETF Language Code, up to the hyphen (if any), are all lowercase, and those following
     *               the hyphen (if any) are all uppercase.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *             
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
