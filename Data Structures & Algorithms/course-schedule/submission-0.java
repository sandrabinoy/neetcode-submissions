class Solution {

    Map<Integer, List<Integer>> prereqMap = new HashMap<>();
	Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int[] prereq : prerequisites) {
			int c = prereq[0];
			int p = prereq[1];
			prereqMap.computeIfAbsent(c, k -> new ArrayList<>()).add(p);
		}
		
		for (int c : prereqMap.keySet()) {
			if (!dfs(c)) {
				return false;
			}
		}
		return true;
	}

	public boolean dfs(int c) {
		if (visiting.contains(c)) {
			return false;
		}
		
		if (null == prereqMap.get(c) || prereqMap.get(c).isEmpty()) {
			return true;
		}

		visiting.add(c);
		for (int pre : prereqMap.get(c)) {
			if (!dfs(pre)) {
                return false;
			}
        }
		visiting.remove(c);
		prereqMap.put(c, new ArrayList<>());
		return true;
    }
}
