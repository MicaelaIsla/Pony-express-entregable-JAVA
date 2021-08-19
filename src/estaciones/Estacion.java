package estaciones;

	public class Estacion {


		public static int caballos(int[] distancia) {
			int jinetes=1;
			int millasRecorridas=0;
			for (int i=0; i<distancia.length; i++) {
				if(distancia[i]>100)
					return -1; // Entrada inválida, no puede recorrer mas de 100 millas sin estación intermedia
				if(millasRecorridas+distancia[i]>100)
				{
					jinetes++;
					millasRecorridas=distancia[i];
				}
				else
					millasRecorridas+=distancia[i];
			}
			return jinetes;
		}
	}