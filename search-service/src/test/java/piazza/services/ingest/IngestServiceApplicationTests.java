package piazza.services.ingest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import piazza.services.search.model.Metadata;
import piazza.services.search.model.NumericKeyValue;
import piazza.services.search.model.TextKeyValue;
import piazza.services.search.repository.MetadataRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/elasticsearch-test-connection.xml")
public class IngestServiceApplicationTests {

	@Autowired
	MetadataRepository repository;
	
	@Test
	public void loadData()
	{
		Metadata data = new Metadata();
		data.setUuid(UUID.randomUUID().toString());
		data.setUserId("rshultz");
		data.setDate(new Date());
		data.setClassification("Unclassified");
		List<NumericKeyValue> numerics = new ArrayList<NumericKeyValue>();
		numerics.add(new NumericKeyValue("velocity", 55.5));
		numerics.add(new NumericKeyValue("angle", 90.0));
		data.setNumericKeyValue(numerics);
		List<TextKeyValue> text = new ArrayList<TextKeyValue>();
		text.add(new TextKeyValue("comment", "testing 1.. 2.. 3.."));
		data.setTextKeyValue(text);
		repository.save(data);
		System.out.println("Hello World"+"/n"+repository.toString());
	}

}
