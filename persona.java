	
public class persona{
		
		protected static String nombre = "";
		private static int Id;

	public persona(){
	
	}

	public persona (String nombre/*, int id*/){
		this.nombre = nombre;
		/*Id = id;*/

	}

	/*public void setId(int id){
		Id = id;

	}*/

	public void setnombre(String nombre){
		this.nombre = nombre;

	}

	/*public int getId(){
		return Id;

	}*/

	public String getnombre() {
		return nombre;

	}
	
	
}