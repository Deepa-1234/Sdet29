package com.crm.comcast.practice;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups = "ST")
public static void orgTest() {
	System.out.println("org created");
}

@Test(groups = "IT")
public void orgWithIndustryTest() {
	System.out.println("org with industry");
}

}
