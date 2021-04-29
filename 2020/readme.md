# 2020 challenge: java

## how to run
`gradle run` for all days,
or `gradle run --args="1 2"` to run days 1 and 2, etc

## how this is organized
- In order to create a new day, I run `./new-day.sh`, which creates files using the templates in the `resources/templates` directory.
- In the `src` folder, I have my main code, organized by packages according to day,
and my tests, which are the examples provided on the challenge website.
- I put my data in the `resources/inputs` directory, which means that the path to those files will only work if I run 
`gradle run` in this current directory (`adventofcode/2020`).
- I wanted to use this challenge to become more familiar with Java.
`adventofcode2020.Solution` is the abstract class which is the basis of the rest of the main code.
I try to arrange my logic around Java classes and objects, using the Java generics system to customize the Solution for each day.

## todo
- [ ] days 7-25
