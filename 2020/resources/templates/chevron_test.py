#!/bin/env python

import sys
import chevron

day = sys.argv[1]
Day = sys.argv[2]
ClassName = sys.argv[3]

with open('test.mustache') as template:
	with open(f'{Day}Test.java', 'a') as newFile:
		newFile.write(chevron.render(template, {
			'day': day, 'Day': Day, 'ClassName': ClassName
		}))

