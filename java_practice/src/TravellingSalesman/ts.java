package TravellingSalesman;

public class ts {

	    private static int findNearestCity(int[][] graph, boolean[] visited, int currentCity) {
	        int n = graph.length;
	        int nearestCity = 0;
	        int shortestDistance = Integer.MAX_VALUE;

	        for (int i = 0; i < n; i++) {
	            if (!visited[i] && graph[currentCity][i] < shortestDistance) {
	                nearestCity = i;
	                shortestDistance = graph[currentCity][i];
	            }
	        }

	        return nearestCity;
	    }

	    public static int tsp(int[][] graph) {
	        int n = graph.length;
	        boolean[] visited = new boolean[n];
	        int totalDistance = 0;
	        int currentCity = 0;  // Starting city
	        visited[currentCity] = true;

	        for (int i = 0; i < n - 1; i++) {
	            int nextCity = findNearestCity(graph, visited, currentCity);
	            totalDistance += graph[currentCity][nextCity];
	            visited[nextCity] = true;
	            currentCity = nextCity;
	        }

	        totalDistance += graph[currentCity][0];

	        return totalDistance;
	    }

	    public static void main(String[] args) {
	        int[][] graph = {
	            { 0, 10, 15, 20 },
	            { 10, 0, 35, 25 },
	            { 15, 35, 0, 30 },
	            { 20, 25, 30, 0 }
	        };

	        System.out.println("The shortest distance is : " + tsp(graph));
	    }
	}

