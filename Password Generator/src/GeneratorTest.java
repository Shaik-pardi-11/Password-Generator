
class GeneratorTest {
	
	private final Password password= new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
	private final Generator generator = new Generator(true,false,false,false);
//	private final Password generatedPassword = generator.GeneratePassword(4);
	
	void test1() {
		assertEquals("Secret", password.toString());
	}

	void test2() {
		assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
	}

	void test3() {
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS);
	}
	
	void test4() {
		assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
	}
	
	void test5() {
		assertEquals(generator.alphabet.getAlphabet().length(), 26);
	}

	// Runner so the test methods are actually used
	public void runTests() {
		test1();
		test2();
		test3();
		test4();
		test5();
	}

	public static void main(String[] args) {
		new GeneratorTest().runTests();
	}

	private void assertEquals(String expected, String actual) {
		if (expected == null ? actual != null : !expected.equals(actual)) {
			throw new AssertionError("Expected <" + expected + "> but was <" + actual + ">");
		}
	}

	private void assertEquals(int expected, int actual) {
		if (expected != actual) {
			throw new AssertionError("Expected <" + expected + "> but was <" + actual + ">");
		}
	}

}
