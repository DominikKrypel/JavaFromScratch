package com.testerorpogramowania.document;

import javax.print.Doc;

public class DocumentTest {

    public static void main(String[] args) {

        PDF pdf = new PDF();
        pdf.getDocument();

        Excel excel = new Excel();
        excel.getDocument();

        Document document = new Document();
        document.getDocument();

        Document docPDF = new PDF();
        docPDF.getDocument();

    }

}
