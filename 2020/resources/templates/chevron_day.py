#!/bin/env python

import sys
import chevron

day = sys.argv[1]
number = sys.argv[2]
ClassName = sys.argv[3]

with open('day.mustache') as template:
	with open(f'{ClassName}.java', 'a') as newFile:
		newFile.write(chevron.render(template, {
			'day': day, 'ClassName': ClassName, 'number': number
		}))

