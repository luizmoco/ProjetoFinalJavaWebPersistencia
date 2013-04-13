package service;

//classe diamante 
public interface GenericDAO <Type> {
	
	public void create (Type t);
	
	public void delete (Type t);
	
	public Object buscarporid(int id);
	
	public java.util.List<Type> buscartodos();
	
	public void update (Type t);
}
