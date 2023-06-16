# Tree algorithms

| Breadth First Search                                                                                                                                            | Deep First Search |   
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------| ---- |
| Uses queue (FIFO)                                                                                                                                               | Uses stack (LIFO) |
| BFS explores all of its neighbors before moving on to the vertices at the next depth level (edge).  When a vertex is discovered, it should be added to a queue. | DFS goes as far as it can down a given path, then backtracks until it finds another unexplored path, and visits it. When a vertex is discovered, it should be added to a stack |
| Find the shortest path since we reach a vertex with a min number of edges from a root                                                                           | Search all possibilities since we traverse through more edges to reach a destination vertex |

### Tree traversal algorithms:

| Inorder Traversal | Preorder Traversal | Postorder Traversal | Level Order Traversal |
| ---- | ---- | ---- | ---- |
| Left-current-right | Current-left-right | Left-right-current | Level-by-level, left-right |
| DFS | DFS | DFS | BFS |
| Go to the left subtree, visit node, go to the right subtree | Visit node, go to the left subtree, go to the right subtree | Go to the left subtree, go to the right subtree, visit the node | Visit nodes on one level, then move to another |
