test:
	javac Vcalc_Test.java
	java Vcalc_Test testfile a >> test.s
	cat test.s

clean:
	clear
	rm *.class
	rm test.s

refresh: clean test
