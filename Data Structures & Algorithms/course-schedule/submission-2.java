class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses < 1 || prerequisites == null || prerequisites.length == 0) return true;

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] p : prerequisites) {
            adjList.computeIfAbsent(p[0], k -> new ArrayList<>()).add(p[1]);
        }

        for (int c : adjList.keySet()) {
            if (!dfs(adjList, c, new HashSet<>())) return false;
        }
        return true;
    }

    private boolean dfs(Map<Integer, List<Integer>> adjList, int course, Set<Integer> visiting) {
        if (visiting.contains(course)) return false;
        if (adjList.get(course) == null || adjList.get(course).isEmpty()) return true;

        visiting.add(course);

        for (int p : adjList.get(course)) {
            if (!dfs(adjList, p, visiting)) return false;
        }
        visiting.remove(course);
        adjList.put(course, new ArrayList<>());
        return true;
    }
}
