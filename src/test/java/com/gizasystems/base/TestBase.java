package com.gizasystems.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.gizasystems.utilities.ExtentReportManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected  static ExtentReports extent;
    protected ExtentTest test;

    @BeforeClass
    public void setupReport() {
        extent = ExtentReportManager.getInstance();
    }

    @AfterClass
    public void teardown() {
        ExtentReportManager.flushReport();
    }
}
