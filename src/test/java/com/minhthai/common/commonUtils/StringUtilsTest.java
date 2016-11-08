package com.minhthai.common.commonUtils;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class StringUtilsTest {
	@Test
	public void testSplit(){
		String src = "This is a test string";
		List<String> list = StringUtils.split(src, " ");
		
		Assert.assertEquals(5, list.size());
		Assert.assertEquals("is", list.get(1));
	}
}
