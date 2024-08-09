package com.pmunger.pm0173.constants;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

@SpringBootTest
class EVacationTests {

	@Test
	void julyFourthTests() {
		Date start = new Date(2024, 11, 5);
		Date end = new Date(2024, 11, 10);
		List<EVacation.VacationInstance> instanceList = EVacation.getVacationList(start, end);
		assertEquals(0, instanceList.size());
	}
}
