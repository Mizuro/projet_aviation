package JPAClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TitrePhysique")
public class ClientPhysique extends Client{
	private String prenom;
	
	public ClientPhysique()
	{
		super();
	}
	
	
	
	
	public ClientPhysique(String prenom) {
		super();
		this.prenom = prenom;
	}




	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
