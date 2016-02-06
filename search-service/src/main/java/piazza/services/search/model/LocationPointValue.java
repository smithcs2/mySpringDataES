package piazza.services.search.model;

public class LocationPointValue {
	private Float lat;
	private Float lon;
	
	public LocationPointValue(Float lat, Float lon)
	{
		this.lat = lat;
		this.lon = lon;
	}
	
	public Float getlat() {
		return lat;
	}
	public void setlat(Float lat) {
		this.lat = lat;
	}
	public Float getlon() {
		return lon;
	}
	public void setlon(Float lon) {
		this.lon = lon;
	}
}
