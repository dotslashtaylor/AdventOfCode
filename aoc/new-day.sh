#!/bin/bash

read -p "what day is it? (number) " day
read -p "what day is it? (word) " day
read -p "what is the challenge name? " challenge

mkdir ~/adventofcode/2020/lib/src/main/java/${day}

cp ~/adventofcode/2020/defaults/Solution.java ~/adventofcode/2020/lib/src/main/java/${day}/${challenge}.java

cp ~/adventofcode/2020/defaults/GetResult.java ~/adventofcode/2020/lib/src/main/java/${day}/GetResult.java

cp ~/adventofcode/2020/defaults/Test.java ~/adventofcode/2020/lib/src/test/java/${challenge}Test.java

