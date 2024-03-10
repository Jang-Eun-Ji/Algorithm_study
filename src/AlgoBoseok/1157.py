import collections
import sys
from collections import defaultdict

sys.stdin = open('/Users/song/Desktop/Python/Python/h.txt', 'r')

dic = defaultdict(int)
word = [i.upper() for i in list(input())]
cnt = collections.Counter(word)
print(cnt)
if len(cnt)==1 or list(cnt.most_common(2))[0][1]!=list(cnt.most_common(2))[1][1]:
    print(list(cnt.most_common(2))[0][0])
else:
    print('?')
