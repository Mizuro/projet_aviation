package JPAClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TitreMoral")
public class ClientMoral extends Client{
	
		private String siret;
		
		public ClientMoral(){
			
		}

		public String getSiret() {
			return siret;
		}

		public void setSiret(String siret) {
			this.siret = siret;
		}
		
		
}

