package piazza.services.ingest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import piazza.services.ingest.model.Metadata;
import piazza.services.ingest.repository.MetadataRepository;

@RestController
public class Controller {
	
	@Autowired
	MetadataRepository repository;

	@RequestMapping(value="/metadata_v1/ingest", method=RequestMethod.POST, consumes="application/json")
	public @ResponseBody Metadata createEntry(@RequestBody Metadata entry){
		repository.save(entry);
		return entry;
	}
	
	
}
