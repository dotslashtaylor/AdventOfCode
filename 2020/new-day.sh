#!/bin/bash

read -p "[string] what day is this?" day
read -p "[int] what day is this?" number
read -p "what challenge is this?" ClassName

cd templates
python chevron_day.py $day $number $ClassName
Day="Day${day}"
python chevron_test.py $day $Day $ClassName
cd ..
mkdir src/main/adventofcode2020/$day
mv templates/${ClassName}.java src/main/adventofcode2020/$day/${ClassName}.java
mv templates/${Day}.java src/test/${Day}.java
