package Codegnan.HibernateDemo;

public class Orders {
	
	@Id
	@GeneratedValue(strategy=Generation)
	
	private int oid;
	private String cname;
	
	@ManyToMany
	@JoinTable(name="product_orders")
	joinColumns=@JoinColumns(name="Orders");
	inverse
}
