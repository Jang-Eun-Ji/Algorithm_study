import sys
from collections import deque

sys.stdin = open('/Users/song/Desktop/Python/Python/h.txt', 'r')

n, m, v = map(int, sys.stdin.readline().split(" "))

graph = [[] for _ in range(n+1)]

for _ in range(m):
    x, y = map(int,sys.stdin.readline().split(" "))
    graph[x].append(y)
    graph[y].append(x)

for i in graph:
    i.sort()

def dfs(v):
    visited[v] = True
    print(v, end=" ")
    for next_node in graph[v]:
        if not visited[next_node]:
            dfs(next_node)
visited = [False] * (n+1)
dfs(v)
print()

def bfs(node):
    Q = deque([node])
    visited[node] = True
    while Q:
        x = Q.popleft()
        print(x, end=" ")
        for next_node in graph[x]:
            if not visited[next_node]:
                visited[next_node] = True
                Q.append(next_node)
visited = [False] * (n+1)
bfs(v)





