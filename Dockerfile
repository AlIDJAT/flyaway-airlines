# Utiliser l'image officielle de Java
FROM openjdk:17-jdk-slim

# Copier le fichier JAR dans l'image Docker
COPY target/flyaway-airlines-0.0.1-SNAPSHOT.jar /usr/app/flyaway-airlines.jar

# Définir le répertoire de travail dans le conteneur
WORKDIR /usr/app

# Exposer le port sur lequel l'application sera accessible
EXPOSE 8080

# Lancer l'application avec Java
ENTRYPOINT ["java", "-jar", "flyaway-airlines.jar"]
