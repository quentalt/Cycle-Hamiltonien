package monpackage;

import java.util.Arrays;

import java.util.Scanner;

public class hardgraph {

	
		private int V, pathcount;
		
		private int[] path;
		
		private int[][] graph;
		

		/** fonction cycle **/
		
		public void hamiltoniancycle(int[][] g)
		
		{
			
			V= g.length;
			path= new int[V];
			Arrays.fill(path, -1);
			
			graph = g;
			
			try
			
			{
				
				path[0]=0;
				
				 pathcount = 1;
				solve(0);
				System.out.println("No solution");
				
			}
			
			
			catch (Exception e)
			
			{
				
				System.out.println(e.getMessage());
				
				display();
			}
			
		}
		
	
		   


		private void display() {
			// TODO Auto-generated method stub
			
		}





		/** fonction trouver chemins recursivement **/
		
		public void solve(int vertex) throws Exception
		
		{
			
			/**solution **/
			
			if (graph[vertex][0] == 1 && pathcount == V)
				
				throw new Exception("Solution trouvé");
			
			/** tous les vertices selectionner but la derniere n'est pas lié à 0 **/
			
			if(pathcount ==V)
				return;
		
			for(int v=0; v < V; v++)
				
			{
				
				/** si connecté **/
				
				if (graph[vertex][v]==1)
					
				{
					
					/** ajouter un chemin **/
					
					path[pathcount++] = v;
					
					/** enlever connection **/
					
					graph[vertex] [v] =0;
						
					graph[v] [vertex] =0;
					
				/** si vertex n'est pas déjà sélectionné résoudre récursivement **/
						
						if (!isPresent(v))
							solve(v);
					
					/** restaurer connection **/
					
					graph[vertex][v]=1;
					
					graph[v][vertex]=1;
				
					/** enlever chemin **/
					
					path[--pathcount] = -1;
					
				}
				
			}
		}


		
		/** fonction vérifie si chemin est déjà selectionné **/
		
	public boolean isPresent(int v) {
		
		for (int i=0; i < pathcount - 1; i++)
			
			if (path[i] == v)
				
				return true;
		
		return false;
	}
	
	/** fonction principale **/
	
	public static void main1(String[] args)
	
	{
		
		Scanner scan = new Scanner (System.in);
		
		/** faire un objet de la classe cycle Hamiltonien **/
		
		hardgraph hc = new hardgraph();
		
		System.out.println("Entre le nombre de vertices");
		
		int V = scan.nextInt();
		
	/** avoir le graphe **/
		
		System.out.println("Entre la matrice adjacente");
		
		int[][] graph=new int[V][V];
		
		for(int i = 0; i<V; i++)
			
			for(int j = 0; j<V; j++) 
			
				graph[i][j] = scan.nextInt();
		
		hc.hamiltoniancycle(graph);
		scan.close();
		
	}
	
	}
		
		

		
