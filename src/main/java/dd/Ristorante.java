package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "RISTORANTE")
public class Ristorante{
		
		@Id
		@Column(name = "ID")
		private long ID;
		@Column(name = "NAME")
		private String name;
		@Column(name = "ADDRESS")
		private String address;
		
		@Column(name = "PLACE")
		private long place;
		@Column(name = "TYPE_OF_KITCHEN")
		private String typeOfCucina;
		@Column(name = "FEEDBACK")
		private String feedback;
		@Column(name = "PRICE_RANGE")
		private String priceRange;
		public Ristorante(long iD, String name, String address, long place, String typeOfCucina, String feedback,
				String priceRange) {
			super();
			ID = iD;
			this.name = name;
			this.address = address;
			this.place = place;
			this.typeOfCucina = typeOfCucina;
			this.feedback = feedback;
			this.priceRange = priceRange;
		}
		public long getID() {
			return ID;
		}
		public void setID(long iD) {
			ID = iD;
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
		public void setPlace(long place) {
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
			return "Ristorante [ID=" + ID + ", name=" + name + ", address=" + address + ", place=" + place
					+ ", typeOfCucina=" + typeOfCucina + ", feedback=" + feedback + ", priceRange=" + priceRange + "]";
		}
		
		
		
		
	

		
		

}
