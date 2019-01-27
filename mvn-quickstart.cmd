REM mvn archetype:generate -DgroupId=com.dwbook.phonebook -DartifactId=dwbook-phonebook -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn package
java -jar target/dwbook-phonebook-1.0-SNAPSHOT.jar server config.yaml 