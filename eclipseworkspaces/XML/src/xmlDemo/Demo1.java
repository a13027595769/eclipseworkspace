package xmlDemo;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Demo1 {
	private File f = new File("D:\\eclipse��������\\XML\\src\\xmlDemo\\contains.xml");

	@Test
	public void testName() throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);

	}

	@Test
	public void test1() throws Exception {
		// 1:��ȡDocument�ĵ�����
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		// 2:��ȡXML�еĸ�Ԫ��
		Element root = doc.getDocumentElement();
		// 3:��ȡ�ڶ�����ϵ��Ԫ��(linkman)
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(1);
		// 4:��ȡlinkmanԪ���µ�nameԪ��
		Element nameEl = (Element) linkmanEl.getElementsByTagName("name").item(0);
		System.out.println(nameEl.getTextContent());

	}

	@Test
	public void test2() throws Exception {
		// 1:��ȡDocument�ĵ�����
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		// 2:��ȡXML�еĸ�Ԫ��
		Element root = doc.getDocumentElement();
		// 3:��ȡ��һ����ϵ��Ԫ��(linkman)
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(0);
		// 4:��ȡlinkmanԪ���µ�emailԪ��
		Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
		// 5:����emailԪ�ص��µ��ı�����(will@)
		emailEl.setTextContent("will@");
		// 6:ͬ������:Transformer
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer trans = factory.newTransformer();
		Source xmlSource = new DOMSource(doc);// Դ���ڴ��е�document����
		Result outputTarget = new StreamResult(f);// Ŀ�꣺�����е�XML�ļ�(contains.xml)
		trans.transform(xmlSource, outputTarget);

	}

	@Test
	public void test3() throws Exception {
		// 1:��ȡDocument�ĵ�����
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		// 2:��ȡXML�еĸ�Ԫ��
		Element root = doc.getDocumentElement();
		// 3:����һ��linkmanԪ�ص�Ƭ��
		// 3.1����linkman��email,name,address,groupԪ��
		Element linkmanEl = doc.createElement("linkman");
		Element emailEl = doc.createElement("email");
		Element nameEl = doc.createElement("name");
		Element addressEl = doc.createElement("address");
		Element groupEl = doc.createElement("group");
		// 3.2��name,email,address,groupԪ�������ı�����
		nameEl.setTextContent("Luck");
		emailEl.setTextContent("Lucy@");
		addressEl.setTextContent("����");
		groupEl.setTextContent("�¸�");
		// 3.3��name,email,address,group����Ϊlinkman����Ԫ��
		linkmanEl.appendChild(nameEl);
		linkmanEl.appendChild(emailEl);
		linkmanEl.appendChild(addressEl);
		linkmanEl.appendChild(groupEl);
		// 3.4��linkmanԪ����Ϊ��Ԫ�ص���Ԫ��
		root.appendChild(linkmanEl);
		// 6:ͬ������:Transformer
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer trans = factory.newTransformer();
		Source xmlSource = new DOMSource(doc);// Դ���ڴ��е�document����
		Result outputTarget = new StreamResult(f);// Ŀ�꣺�����е�XML�ļ�(contains.xml)
		trans.transform(xmlSource, outputTarget);

	}

	@Test
	public void test4() throws Exception {
		// 1:��ȡDocument�ĵ�����
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		// 2:��ȡXML�еĸ�Ԫ��
		Element root = doc.getDocumentElement();
		// 3:��ȡ��һ����ϵ��Ԫ��(linkman)
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(2);
		/**
		 * ��������
		 */
		linkmanEl.setAttribute("id", "123");
		/**
		 * �������
		 */
		String id = linkmanEl.getAttribute("id");
		System.out.println(id);
		/**
		 * ���Լ����ϰ����ɵ��Լ�
		 */
		linkmanEl.getParentNode().removeChild(linkmanEl);
		// 6:ͬ������:Transformer
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer trans = factory.newTransformer();
		Source xmlSource = new DOMSource(doc);// Դ���ڴ��е�document����
		Result outputTarget = new StreamResult(f);// Ŀ�꣺�����е�XML�ļ�(contains.xml)
		trans.transform(xmlSource, outputTarget);

	}
	@Test
	public void test5() throws Exception {
		SAXReader reader = new SAXReader();
		org.dom4j.Document doc = reader.read(f);
		org.dom4j.Element root = doc.getRootElement();
		org.dom4j.Element linkmanList = root.element("linkman");
		for (iterable_type iterable_element : iterable) {
			ArrayList
		}

	}
	
	

}
