import sys
s1 = set()
s2 = set() 
s3 = []
a,b = map(int, sys.stdin.readline().split())

for _ in range(0,a):
    x = input()
    s1.add(x)
for _ in range(0,b):
    y = input()
    s2.add(y)
s3 =  list(s1 & s2)
s3.sort()
print(len(s3))
for i in s3:
    print(i)
