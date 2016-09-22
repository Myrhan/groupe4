
public class Test {

	
	private Long id;
	private String nom;
	private String prenom;
	
	
	public Test(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public Test() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
}
