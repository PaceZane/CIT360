import org.junit.Test

import static assertThatMatcherExample.PersonMatchers.isPersonLike
import static assertThatMatcherExample.PersonMatchers.isPersonLike2
import static org.junit.Assert.*


class AssertThatTest {

	
	@Test
	public void checkByEquals() {
		def expected = new Person(nickname: 'alice', name: "Alice")
		def actual = new Person(nickname: 'alice', name: "Bob")

		
	}

	
	@Test
	public void checkNameToo() {
		def expected = new Person(nickname: 'alice', name: "Alice")
		def actual = new Person(nickname: 'alice', name: "Alice")

		
	}

	
	@Test
	public void checkChildrenAsWell() {
		def expected = new Person(nickname: 'alice', name: "Alice")
		expected.children = [
			new Person(nickname: 'little_bob', name: 'Bob', children: [expected]),
			new Person(nickname: 'little_con', name: 'Constantin', children: [expected])
		]
		def actual = new Person(nickname: 'alice', name: "Alice")
		actual.children = [
			new Person(nickname: 'little_bob', name: 'Bob', children: [actual]),
			new Person(nickname: 'little_con', name: 'Constantin', children: [actual])
		]

		assertEquals "incorrect nickname", expected.nickname, actual.nickname
		assertEquals "incorrect name", expected.name, actual.name
		assertEquals "incorrect number of children", expected.children.size(), actual.children.size()
		for (def actualFriend in actual.children) {
			def expectedFriend = expected.children.find { it.nickname == actualFriend.nickname }
			assertNotNull "unexpected friend '$actualFriend.nickname'", expectedFriend

			assertEquals "incorrect name", actualFriend.name, expectedFriend.name
			
		}
	}

	
	@Test
	public void comparisonWithMatcher() {
		def expected = new Person(nickname: 'alice', name: "Alice", children: [
			new Person(nickname: 'little_bob', name: 'Bob', children: [
				new Person(nickname: 'tiny_dave', name: 'Dave')
			]),
			new Person(nickname: 'little_con', name: 'Constantin')
		])
		def actual = new Person(nickname: 'alice', name: "Alice", children: [
			new Person(nickname: 'little_bob', name: 'Bob', children: [
				new Person(nickname: 'tiny_dave', name: 'Dave')
			]),
			new Person(nickname: 'little_con', name: 'Constantin')
		])

		assertThat "unexpected Alice", actual, isPersonLike(expected)
	}

	
	@Test
	public void comparisonWithMatcherAndHelpfulErrorMessage() {
		def expected = new Person(nickname: 'alice', name: "Alice", children: [
			new Person(nickname: 'little_bob', name: 'Bob', children: [
				new Person(nickname: 'tiny_dave', name: 'Dave')
			]),
			new Person(nickname: 'little_con', name: 'Constantin')
		])
		def actual = new Person(nickname: 'alice', name: "Alice", children: [
			new Person(nickname: 'little_bob', name: 'Bob', children: [
				new Person(nickname: 'tiny_dave', name: 'David')
			]),
			new Person(nickname: 'little_con', name: 'Constantin')
		])

		// TODO: fix this test if you like
		assertThat "unexpected Alice", actual, isPersonLike2(expected)
	}


}