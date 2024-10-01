class Node:
    def __init__(self, node_id, value=None):
        self.id = node_id   # 노드의 id
        self.value = value  # 리프 노드는 값을 가지고 있음, 내부 노드는 None

class Tree:
    def __init__(self):
        self.nodes = {}        # 모든 노드를 저장하는 딕셔너리 {id: Node}
        self.children = {}     # 각 노드의 자식들을 저장하는 딕셔너리 {id: [child_ids]}
    
    def add_node(self, node_id):
        if node_id not in self.nodes:
            self.nodes[node_id] = Node(node_id)
        return self.nodes[node_id]

    def add_edge(self, parent_id, child_id):
        self.add_node(parent_id)
        self.add_node(child_id)
        if parent_id not in self.children:
            self.children[parent_id] = []
        self.children[parent_id].append(child_id)

    def set_leaf_value(self, node_id, value):
        if node_id not in self.nodes:
            self.nodes[node_id] = Node(node_id)
        self.nodes[node_id].value = value

    def dfs(self, node_id, is_max):
        node = self.nodes[node_id]

        # 리프 노드인 경우 그 값을 반환
        if node.value is not None:
            return node.value
        
        # 자식 노드들 탐색
        if is_max:
            value = float('-inf')
        else:
            value = float('inf')

        # 해당 노드의 자식들에 대해 재귀적으로 값을 계산
        for child_id in self.children.get(node_id, []):
            child_value = self.dfs(child_id, not is_max)
            if is_max:
                value = max(value, child_value)
            else:
                value = min(value, child_value)
        
        # 계산된 값을 노드에 저장
        node.value = value
        return value

# 입력 처리
data = input().split()
N, R = int(data[0]), int(data[1])

# 트리 생성
tree = Tree()

index = 2
for _ in range(N - 1):
    u, v = int(data[index]), int(data[index + 1])
    tree.add_edge(u, v)
    index += 2

L = int(data[index])
index += 1

# 리프 노드에 값 할당
for _ in range(L):
    k, t = int(data[index]), int(data[index + 1])
    tree.set_leaf_value(k, t)
    index += 2

Q = int(data[index])
index += 1

queries = [int(data[index + i]) for i in range(Q)]

# 루트에서 Minimax 계산
tree.dfs(R, True)

# 질의에 대한 답 출력
result = [str(tree.nodes[q].value) for q in queries]
print("\n".join(result))
