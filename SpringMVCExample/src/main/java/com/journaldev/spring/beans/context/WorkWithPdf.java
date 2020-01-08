package com.journaldev.spring.beans.context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.journaldev.spring.beans.User;

@Component
public class WorkWithPdf {
	
	Document document;
	
	public void generatePDF(User[] users) {
		document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\workspacex\\x3la\\liferay\\SpringMVCExample\\xlsx\\iTextHelloWorld.pdf"));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}

		document.open();

		printUserOnPdfDoc( users );

		document.close();
	}

	private void printUserOnPdfDoc( User[] users ) {
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		for (User user : users) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(user.getName() + "\t");
			stringBuilder.append(user.getEmail() + "\t");
			stringBuilder.append(user.getUsername() + "\t");
			stringBuilder.append(user.getPhone() + "\t");

			Paragraph paragraph = new Paragraph(stringBuilder.toString(), font);
			
			try {
				document.add(paragraph);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		}
	}
}
