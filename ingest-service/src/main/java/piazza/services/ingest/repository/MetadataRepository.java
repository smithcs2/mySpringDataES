package piazza.services.ingest.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import piazza.services.ingest.model.Metadata;

public interface MetadataRepository extends ElasticsearchRepository<Metadata, String> {

}
