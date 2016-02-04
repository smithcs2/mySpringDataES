ingest-service currently using:
kibana-4.0.2-linux-x64
and
elasticsearch-1.5.2

While this may work with later versions of ES or Kibana, it does not work with the current ones.

The application.properties file enables you to edit things such as the Tomcat port number.
The most important property to note, however, is the "elasticsearch.clustername" property. If this does not align with the cluster.name in your elasticsearch.yml file, this application will not work.

Elasticsearch must be running for this application to do anything.
