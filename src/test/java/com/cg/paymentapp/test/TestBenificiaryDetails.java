package com.cg.paymentapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;

import com.cg.paymentapp.beans.BenificiaryDetails;


import org.junit.jupiter.api.Test;

public class TestBenificiaryDetails {
	static   BenificiaryDetails sample=null;
	@BeforeClass
	public static void setup() {
		sample=new BenificiaryDetails();
	}

	@Test
	public void testaddBenificiary() {
		String s1="";
		assertNull("Name cannot be null",s1);
		String s1="sow@@mya";
		assert("Enter valid name",s1);
		//phonenumber ki kuda 2 testcases
		
	}
	@Test
	public void testdeleteBenificiery() {
		
		
		
		
	}
	
		
		
	}

}
