package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "RED_RESTAURANTS")
public class Ristorante{
		
		@Id
		@Column(name = "RESTAURANT_ID")
		private int id;
		@Column(name = "RESTAURANT_NAME")
		private String name;
		@Column(name = "RESTAURANT_ADDRESS")
		private String address;
		
		@Column(name = "SEATS")
		private int place;
		@Column(name = "TYPE_KITCHEN")
		private String typeOfCucina;
		@Column(name = "FEEDBACK")
		private String feedback;
		@Column(name = "PRICE_RANGE")
		private String priceRange;
		
		public Ristorante() {
			
		}
		
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
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public long getPlace() {
			return place;
		}
		public String getTypeOfCucina() {
			return typeOfCucina;
		}
		public String getFeedback() {
			return feedback;
		}
		public String getPriceRange() {
			return priceRange;
		}
		@Override
		public String toString() {
			return "Ristorante [id=" + id + ", name=" + name + ", address=" + address + ", place=" + place
					+ ", typeOfCucina=" + typeOfCucina + ", feedback=" + feedback + ", priceRange=" + priceRange + "]";
		}
		
		
		
	

		
		

}
