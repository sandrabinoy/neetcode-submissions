class Solution {

    Map<Integer, List<Integer>> prereqMap = new HashMap<>();
	Set<Integer> visiting = new HashSet<>();
    List<Integer> order = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            prereqMap.put(i, new ArrayList<>());
        }
        for (int[] prereq : prerequisites) {
			prereqMap.get(prereq[0]).add(prereq[1]);
		}
		
		for (int c : prereqMap.keySet()) {
			if (!dfs(c)) {
				return new int[0];
			}
		}
		return order.stream()
                      .mapToInt(Integer::intValue)
                      .toArray();
	}

	public boolean dfs(int c) {
		if (visiting.contains(c)) {
			return false;
		}
		
		if (null == prereqMap.get(c) || prereqMap.get(c).isEmpty()) {
            if (!order.contains(c)) {
                order.add(c);
            };
			return true;
		}

		visiting.add(c);
		for (int pre : prereqMap.get(c)) {
			if (!dfs(pre)) {
                return false;
			}
        }
		visiting.remove(c);
        order.add(c);
		prereqMap.put(c, new ArrayList<>());
		return true;
    }
}
