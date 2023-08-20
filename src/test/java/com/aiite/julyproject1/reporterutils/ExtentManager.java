package com.aiite.julyproject1.reporterutils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentSparkReporter sparkReporter = null;
	public static ExtentReports extentReport = null;
	public static String reportlocation = System.getProperty("user.dir")+"/reports/Junit_ExtentReport.html";
	public static ExtentTest extentTest = null;
	
	public static ExtentReports getInstance() {
		if(extentReport == null) {
			return createInstance();
		}
		return extentReport;
	}
	
	public static ExtentReports createInstance() {
		sparkReporter = new ExtentSparkReporter(reportlocation);
		sparkReporter.config().setDocumentTitle("Junit");
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setReportName("Junit Extent Report");
		extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("InstuteName", "Aiite Technologies");
		extentReport.setSystemInfo("BatchName", "July Project 1");
		extentReport.setSystemInfo("TrainerName", "Dinesh Kumar M");
		return extentReport;
	}
	
	public static void createReportTest(String name) {
		extentTest = extentReport.createTest(name);
	}
	
	public static void flushreport() {
		extentReport.flush();
	}
	
	

}
