#!/usr/bin/env python3

alph = 'A B C D E F G H I J K L M N O P Q R S T U V W X Y Z'
values = {}
total_score = 0

cnt = 1
for ltr in alph.split():
    values[ltr] = cnt
    cnt += 1


with open("names.txt") as name_list:
    names = name_list.read()

names = names.replace('"', '')
names = names.split(',')
names.sort()

cnt = 1
for name in names:
    print("Calculating " +name)
    name_score = 0
    for c in name:
        name_score += values[c]
    name_score *= cnt
    total_score += name_score
    cnt += 1
    print(name_score)

print("Total Score: %s" % total_score)


