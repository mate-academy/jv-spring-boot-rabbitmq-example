first-run:
	./message-receiver/mvnw clean package -f ./message-receiver/pom.xml
	./message-sender/mvnw clean package -f ./message-sender/pom.xml
	docker-compose build
	docker-compose up
