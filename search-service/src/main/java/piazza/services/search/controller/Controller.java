package piazza.services.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiParam;

import piazza.services.search.model.Metadata;
import piazza.services.search.repository.MetadataRepository;

@RestController
public class Controller {
	
	@Autowired
	MetadataRepository repository;

	//Creating a deserializer to handle Key Values currently
	// add "/?userId=csmith" at the end of url to receive all metadata with that userId
	@RequestMapping(value="/metadata_v1/getRequest", method=RequestMethod.GET)
	public List<Metadata> getMetadataByUserId(@ApiParam(value="name of user")
			@RequestParam(value = "userId", required = true, defaultValue = "anonymous") String userId){
			return repository.findByUserId(userId);
	}
	
	
	//Probably doesn't work yet.
	@RequestMapping(value="/metadata_v1/postRequest", method=RequestMethod.POST, consumes="application/json")
	public List<Metadata> getByUserId(@ApiParam(value="name of user")
			@RequestParam(value = "userId", required = true, defaultValue = "anonymous") String userId){
			return repository.findByUserId(userId);
	}
	
	
}
