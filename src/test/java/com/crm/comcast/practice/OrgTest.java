package com.crm.comcast.practice;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups = "ST")
public static void orgTest() {
	System.out.println("org created");
	System.out.println("SANTHOSH1: made this chnages after forking Deepa's Master branch to learn branching");
}

@Test(groups = "IT")
public void orgWithIndustryTest() {
	System.out.println("org with industry");
	System.out.println("SANTHOSH2: made this SECOND chnages after forking Deepa's Master branch to learn branching");
}

}
