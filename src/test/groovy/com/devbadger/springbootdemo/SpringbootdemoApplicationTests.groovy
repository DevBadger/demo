package com.devbadger.springbootdemo

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification
import spock.lang.Unroll

@RunWith(SpringRunner)
@SpringBootTest
class SpringbootdemoApplicationTests extends Specification{

	@Unroll("Test - #num => testName")
	"testNameTest"() {
		given:
		def given
		/*Use this space to set up inputs and mocks*/
		when:
		def result = true /*Use this space to set result t whatever you are testing*/
		then:
		assert result == expected
		where:
		num | expected
		1   | true
	}

}
