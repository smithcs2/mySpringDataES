package piazza.services.ingest.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Document(indexName = "metadata_v1", type = "metadata")
public class Metadata {
	@Id
	private String id;
	@Field(type = FieldType.String)
	private String uuid;
	@Field(type = FieldType.String)
	private String userId;
	@Field(type = FieldType.Date, format = DateFormat.basic_date_time)
	private Date date = null;
	@Field(type = FieldType.String)
	private String classification;
	@Field(type = FieldType.Nested)
	@JsonDeserialize(using = NumericKeyValueJsonDeserializer.class)
	private List<NumericKeyValue> numericKeyValue;
	@Field(type = FieldType.Nested)
	@JsonDeserialize(using = TextKeyValueJsonDeserializer.class)
	private List<TextKeyValue> textKeyValue;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public List<NumericKeyValue> getNumericKeyValue() {
		return numericKeyValue;
	}
	public void setNumericKeyValue(List<NumericKeyValue> numericKeyValue) {
		this.numericKeyValue = numericKeyValue;
	}
	public List<TextKeyValue> getTextKeyValue() {
		return textKeyValue;
	}
	public void setTextKeyValue(List<TextKeyValue> textKeyValue) {
		this.textKeyValue = textKeyValue;
	}
}
