# Spring Controller Security

The purpose of this project is to experiment with the following Sonarsource recommendation:

> Persistent entities should not be used as arguments of "@RequestMapping" methods - [RSPEC-4684](https://rules.sonarsource.com/java/tag/spring/RSPEC-4684)

## Usage

```
curl 'http://localhost:8080/v1/patients' -i -X POST \
    -H 'Content-Type: application/json' \
    -d '{
  "dateOfBirth" : "2000-01-01",
  "name" : "John Doe"
}'
```

## Sonar analysis

```
docker run -d --name sonarqube -p 9000:9000 sonarqube
./gradlew sonarqube -Dsonar.host.url=http://localhost:9000
```


## Development

### Dependencies

- [Lombok](https://projectlombok.org/)

