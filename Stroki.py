stroki = ['hello', '2', 'world', ':-)']
stroki_new = []
for i in stroki:
    if len(i) <= 3:
        stroki_new.append(i)
print(stroki_new)
