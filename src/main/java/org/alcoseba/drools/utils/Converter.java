package org.alcoseba.drools.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;

public class Converter {
	public static String convertXSL2DRL(File file) {
		String drl = null;

		try {
			SpreadsheetCompiler comp = new SpreadsheetCompiler();
			drl = comp.compile(false, new FileInputStream(file), InputType.XLS);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return drl;
	}
}
