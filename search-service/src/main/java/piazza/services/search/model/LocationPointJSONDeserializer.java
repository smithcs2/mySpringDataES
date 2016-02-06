package piazza.services.search.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class LocationPointJSONDeserializer extends JsonDeserializer<List<LocationPointValue>> {

	@Override
	public List<LocationPointValue> deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		List<LocationPointValue> LocationPointValues = new ArrayList<LocationPointValue>();

		JsonNode root = jp.getCodec().readTree(jp);

		for (int i = 0; i != root.size(); ++i) {

			LocationPointValue locationPointValue = new LocationPointValue(
					Float.parseFloat(root.get(i).get("lat").asText()),
					Float.parseFloat(root.get(i).get("lon").asText()));

			LocationPointValues.add(locationPointValue);
		}
		return LocationPointValues;
	}

}
