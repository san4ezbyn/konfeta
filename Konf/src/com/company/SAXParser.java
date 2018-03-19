/*
package com.company;


import jdk.internal.org.xml.sax.SAXException;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SAXParser {

   */
/* private final Object SAXParseException;*//*

    private int elements;
private int attributes;
private int characters;
private int ignorableWhitespace;
private String url;

public SAXParser(String url_str){
url=url_str;
try {
out=new PrintWriter (new OutputStreamWriter (
System.out, "koi8-r"));
}
catch (UnsupportedEncodingException e){
}
public void startDocument(){
elements =0;
attributes = 0;
characters =0;
ignorableWhitespace = 0;

out.println("<?xml version=\"1.0\"encoding=\"UTF-8\"?>");
}
public void endDocument (){
out.flush();
}
//встретился открывающий тэг элемента
public void startElement(String name, AttributeList attrs) {
elements++;
if (attrs !=null){
attributes += attrs.getLength();
}
//печать тэга элемента вместе со списком его атрибутов
out.print('<');
out.print(name);
if(attrs !=null){
int len= attrs.getLength();
for (int i=0; i<len; i++){
out.print (' ');
out.print(attrs.getName(i));
out.print("=\");
out.print(attrs.getValue(i));
out.print("'");
}
}
out.println('>');
}
//Встретился закрывающий тег элемента
public void endElement (String name){
out.ptintln("</"+name+">");

//текстовые символы
public void characters (char ch[], int start, int length){
characters +=length;
out.println(new String(ch, start, length);
}
// необрабатываемые символы(например, содержимое секции DATA
public void ignorableWhitespace(char ch[], int start, int length){
characters (ch, start, length);
}

//инструкции XML процессору
public void processingInstruction (String target, String data);
out.print("<?");
out.print(target);
if (data !=null && data.length() >0) {
out.print(' ');
out.print(data);
}
out.print("?>");
}
// методы интерфейса ErrorHandler последнее предупреждение
public void warning (SAXParseException ex){
System.err.println("Warning at "+ ex.getLineNumber()+ " . " +
ex.getColumnNumber()+" . " + ex.getMessage());
}
//произошла ошибка
public void error (SAXParseException ex){
System.err.println("Error at {" + ex.getLineNumber() + " . " +
ex.getColumnNumber()+ " . " + ex.getMessage());
}
//эти ошибки уже нельзя исправить
public void fatalError(SAXParseException ex) throws SAXException {
System.err.println("Fatal error at {" + ex.getLineNumber() + " . " +
ex.getColumnNumber()+ " . " + ex.getMessage());
throw ex;
}
//Вывести информацию о документе

public void printInfo(){
System.out.println();
System.out.println ("Документ + url + " был успешно обработан");
System.out.println ("Элементов :" + elements);
System.out.println ("Атрибутов :" + attributes);
System.out.println ("Символов :" + characters);




}
*/
