package com.minhthai.common.commonUtils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
	public static List<String> split(String src, String delim){
		List<String> list = new ArrayList<String>();
        int pos = 0, end;
        while ((end = src.indexOf(delim, pos)) >= 0) {
            list.add(src.substring(pos, end));
            pos = end + 1;
        }
        
        if(pos < src.length())
        	list.add(src.substring(pos));
        
        return list;
	}
}
