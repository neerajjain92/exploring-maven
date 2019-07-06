package com.neeraj.maven;

import java.util.ArrayList;
import java.util.List;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

/**
 * @author neeraj on 2019-07-07
 * Copyright (c) 2019, exploring-maven.
 * All rights reserved.
 */
public class MavenCompilerPluginExample {

    List<String> textList = new ArrayList();

    public void addText(String text) {
        textList.add(text);
    }

    public List getTextList() {
        return this.textList;
    }

    public static void main(String[] args) {
        System.out.println("The XML namespace prefix is "+ XML_NS_PREFIX);
    }
}
