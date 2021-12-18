package com.actitime.generics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FileDemo 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileLibrary f=new FileLibrary();
		//System.out.println(f.getpropettyData("Url"));
		//System.out.println(f.getExcelData("CreateCustomer",1, 5));
		System.out.println(f.setExcelData("CreateCustomer",1, 5,"Fail");

	}

}
