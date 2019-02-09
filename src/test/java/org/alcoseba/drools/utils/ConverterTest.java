package org.alcoseba.drools.utils;

import java.io.File;

import org.junit.Test;

public class ConverterTest {

	@Test
	public void testConvertXSL2DRL() {
		System.out.println(Converter.convertXSL2DRL(new File(System.getProperty("user.dir"), "/src/main/resources/rules/accounts/Accounts.xls")));
	}
}
