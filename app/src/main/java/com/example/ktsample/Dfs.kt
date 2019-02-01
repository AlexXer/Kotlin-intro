package com.example.ktsample


class Graph(
    val vertices: Array<Vertex>
)

class Vertex(
    val neighbors: Array<Vertex>
)

/**
 * Depth-first search
 */
fun dfs(graph: Graph) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v)
    }

    dfs(graph.vertices[0])
}
