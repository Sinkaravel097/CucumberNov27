package org.customreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateJvm {
	
	public static void jvmRepo(String jsonFilePath) {
		
		// Steps for generating JVMReport:-
		
		// 1.Mention the target folder location - File
		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_8.30am\\src\\test\\resources\\jvm");

		// 2.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook & Amazon");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Browser Version", "68.9");
		c.addClassifications("Os", "Windows");
		c.addClassifications("OS Version", "11");
		c.addClassifications("Sprint No", "3");
		
		// 3.Add json file paths into List<String>
		List<String> l = new ArrayList<String>();
		l.add(jsonFilePath);
		
		// 4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
		// using the created object call generateReports() method
		r.generateReports();	
	}
}
