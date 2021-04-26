#!/bin/env python

import chevron

with open('day.mustache', 'r') as template:
	chevron.render(template)

