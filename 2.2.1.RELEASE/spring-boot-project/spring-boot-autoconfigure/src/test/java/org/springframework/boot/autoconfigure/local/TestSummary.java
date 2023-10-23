package org.springframework.boot.autoconfigure.local;

import org.junit.jupiter.api.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @description: 本地测试汇总
 * @author: jiabb-b
 * @date: 2023/10/23 023 13:16
 * @since: 1.0
 */
public class TestSummary {

	@Test
	void testMultiValueMap() {
		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.add("test1", "value1");
		multiValueMap.add("test1", "value2");
		multiValueMap.add("test1", "value3");
		multiValueMap.add("test1", "value4");
		System.out.println(multiValueMap);

	}

}
