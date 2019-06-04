package com.ykkoo.pet.utils.wechat.pay.utls;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;

public class xmlparse {

    public static HashMap<String, String> readStringXmlOut(String xml) {
        HashMap<String, String> map = new HashMap<>();
        Document doc;
        try {
            doc = DocumentHelper.parseText(xml);
            Element rootElt = doc.getRootElement();
            Iterator iter = rootElt.elementIterator();
            while (iter.hasNext()) {
                Element recordEle = (Element) iter.next();
                map.put(recordEle.getName(), recordEle.getText());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;

    }


}
