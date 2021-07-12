package net.osgg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;
	 
	    @Column(name = "codprovincia")
	    private String codprovincia;
	    
	    @Column(name = "nombreprovincia")
	    private String nombreporvincia;

	    @Column(name = "capital")
	    private String capital;
	    
	    @Column(name = "codigopostal")
	    private String codigopostal;
	    

	    
		public Provincia() {
			
		}
		
		public Provincia(String codprovincia, String nombreporvincia, String capital, String codigopostal) {
			super();
			this.codprovincia = codprovincia;
			this.nombreporvincia = nombreporvincia;
			this.capital = capital;
			this.codigopostal = codigopostal;
		}



		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCodprovincia() {
			return codprovincia;
		}
		public void setCodprovincia(String codprovincia) {
			this.codprovincia = codprovincia;
		}
		public String getNombreporvincia() {
			return nombreporvincia;
		}
		public void setNombreporvincia(String nombreporvincia) {
			this.nombreporvincia = nombreporvincia;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		public String getCodigopostal() {
			return codigopostal;
		}
		public void setCodigopostal(String codigopostal) {
			this.codigopostal = codigopostal;
		}
	    

		 @Override
		    public String toString() {
		        return "Provincia [id=" + id + ", codprovincia=" + codprovincia + ", anombreporvincia=" + nombreporvincia + ", capital=" + capital + ", codigopostal=" + codigopostal + "]";
		    }
		 
		
		
}
