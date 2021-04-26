# 2020: java

## How this is organized
This directory is set up as a gradle library:
- In the `lib/src/main/java` folder, I write my code and logic for the actual challenge.
	- Each day of the challenge has its own package, with its own `GetResult.java` for me to run.
- In the `lib/src/test/java` folder, I write the tests provided by the challenge as examples.
- I store my input files in the `lib/src/test/resources` folder.

When I need to test and compile the code, I run `gradle build`.
I have also provided myself with a bash script, `getresult.sh`, 
that allows me to more easily run and check the results of the code.

## TODO:
- Try Day 4 again, using classes
- Add Benchmarking
- Research types
- Refactor directory structure
