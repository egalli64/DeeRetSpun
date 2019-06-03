package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "RED_RESTAURANTS")
public class Ristorante{
		
		@Id
		@Column(name = "ID")
		private int id;
		@Column(name = "NAME")
		private String name;
		@Column(name = "ADDRESS")
		private String address;
		
		@Column(name = "PLACE")
		private int place;
		@Column(name = "TYPE_OF_KITCHEN")
		private String typeOfCucina;
		@Column(name = "FEEDBACK")
		private String feedback;
		@Column(name = "PRICE_RANGE")
		private String priceRange;
		public Ristorante(int id, String name, String address, int place, String typeOfCucina, String feedback,
				String priceRange) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.place = place;
			this.typeOfCucina = typeOfCucina;
			this.feedback = feedback;
			this.priceRange = priceRange;
		}
		public int getID() {
			return id;
		}
		public void setID(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPlace() {
			return place;
		}
		public void setPlace(int place) {
			this.place = place;
		}
		public String getTypeOfCucina() {
			return typeOfCucina;
		}
		public void setTypeOfCucina(String typeOfCucina) {
			this.typeOfCucina = typeOfCucina;
		}
		public String getFeedback() {
			return feedback;
		}
		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}
		public String getPriceRange() {
			return priceRange;
		}
		public void setPriceRange(String priceRange) {
			this.priceRange = priceRange;
		}
		@Override
		public String toString() {
			return "Ristorante [ID=" + id + ", name=" + name + ", address=" + address + ", place=" + place
					+ ", typeOfCucina=" + typeOfCucina + ", feedback=" + feedback + ", priceRange=" + priceRange + "]";
		}
		
		
		
		
	

		
		

}
