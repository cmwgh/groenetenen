package be.vdab.valueobjects;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import be.vdab.constraints.Postcode;

public class PostcodeReeks {
//	private final static int MIN_POSTCODE = 1000;
//	private final static int MAX_POSTCODE = 9999;
	@NotNull @Postcode private Integer vanpostcode;
	@NotNull @Postcode private Integer totpostcode;

	// Je maakt getters en setters voor de private variabelen
	public boolean bevat(int postcode) {
		// bevat de reeks een bepaalde postcode ? (gebruikt in de repository
		// layer)
		return postcode >= vanpostcode && postcode <= totpostcode;
	}

	public Integer getVanpostcode() {
		return vanpostcode;
	}

	public void setVanpostcode(Integer vanpostcode) {
		//valideer(vanpostcode);
		this.vanpostcode = vanpostcode;
	}

	public Integer getTotpostcode() {
		return totpostcode;
	}

	public void setTotpostcode(Integer totpostcode) {
		//valideer(totpostcode);
		this.totpostcode = totpostcode;
	}

	
}