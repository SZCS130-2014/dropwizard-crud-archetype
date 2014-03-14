Setup and usage:
================

1. navigate to the /solr-4.5.0/example/ folder
2. unzip the file dataset.xml.zip in the current folder
3. run the command 'java -jar start.jar' to start the Solr platform
4. navigate to '/dropwizard/service/' folder
5. run the command 'java -classpath dist/solr-solrj-4.5.0.jar:dist/solrj-lib/commons-io-2.1.jar:dist/solrj-lib/httpcore-4.2.2.jar:dist/solrj-lib/httpmime-4.2.3.jar:dist/solrj-lib/httpclient-4.2.3.jar:dist/solrj-lib/slf4j-api-1.6.6.jar:dist/solrj-lib/slf4j-log4j12-1.6.6.jar:dist/solrj-lib/wstx-asl-3.2.7.jar:dist/solrj-lib/zookeeper-3.4.5.jar:dist/solrj-lib/jul-to-slf4j-1.6.6.jar:dist/solrj-lib/jcl-over-slf4j-1.6.6.jar:dist/solrj-lib/noggit-0.5.jar:dist/solrj-lib/log4j-1.2.16.jar -jar target/shoppingcart-service-1.0-SNAPSHOT.jar server service.yaml'
6. open the browser and enter 'localhost:8983/solr/dataimport?command=full-import' in the address bar to import the data
7. to access the search engine, enter 'http://localhost:8080/search?q=tv' for a sample start page
8. use the product
